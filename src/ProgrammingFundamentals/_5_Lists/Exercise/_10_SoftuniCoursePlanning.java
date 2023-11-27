package ProgrammingFundamentals._5_Lists.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _10_SoftuniCoursePlanning {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> topics= Arrays.stream(sc.nextLine().split(", ")).collect(Collectors.toList());

        String command = sc.nextLine();
        while(!command.equals("course start")){
            String[] commandParts = command.split(":");
            String commandName = commandParts[0];
            String topic = commandParts[1];

            switch(commandName){
                case "Add":
                    if(!topics.contains(topic)){
                        topics.add(topic);
                    }
                    break;
                case "Insert":
                    int index = Integer.parseInt(commandParts[2]);
                    if(!topics.contains(topic)){
                        topics.add(index,topic);
                    }
                    break;
                case "Remove":
                    if(topics.contains(topic)){
                        int topicIndex = topics.indexOf(topic);
                        String exercise = topic + "-Exercise";
                        boolean hasExercise = topicIndex != topics.size() - 1 && topics.get(topicIndex + 1).equals(exercise);
                        topics.remove(topic);
                        if(hasExercise){
                            topics.remove(topicIndex+1);
                        }
                    }
                    break;
                case "Swap":
                    String topicTwo = commandParts[2];
                    if(topics.contains(topic) && topics.contains(topicTwo)){
                        int firstIndex = topics.indexOf(topic);
                        int secondIndex = topics.indexOf(topicTwo);

                        topics.set(firstIndex,topicTwo);
                        topics.set(secondIndex,topic);

                        String firstEx = topic+"-Exercise";
                        String secondEx = topicTwo+"-Exercise";

                        if(topics.contains(firstEx)){
                            topics.remove(firstEx);
                            topics.add(topics.indexOf(topic)+1,firstEx);
                        }
                        if(topics.contains(secondEx)){
                            topics.remove(secondEx);
                            topics.add(topics.indexOf(topicTwo)+1,secondEx);
                        }
                    }
                    break;
                case "Exercise":
                    String exercise = topic+"-Exercise";
                if(topics.contains(topic)){
                    int indX=topics.indexOf(topic);
                    if(indX==topics.size()-1){
                        topics.add(indX+1,exercise);
                    } else if (!topics.get(indX+1).equals(exercise)) {
                        topics.add(indX + 1, exercise);
                    }
                }
                else{
                    topics.add(topic);
                    topics.add(exercise);
                }
                    break;
            }
            command=sc.nextLine();
        }
        int number=1;
        for(String topic:topics){
            System.out.println(number+"."+topic);
            number++;
        }
    }
}
