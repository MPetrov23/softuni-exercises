package ProgrammingFundamentals.FinalExam;

import java.util.*;

public class TaskThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();

        LinkedHashMap<String, ArrayList<String>> guests = new LinkedHashMap<>();
        int disliked=0;

            while(!input.equals("Stop")){
                String[] parts = input.split("-");
                String status = parts[0];
                String guest = parts[1];
                String meal = parts[2];

                if(status.equals("Like")){

                    guests.putIfAbsent(guest,new ArrayList<>());
                    if(!guests.get(guest).contains(meal)) {
                        guests.get(guest).add(meal);
                    }
                }else if(status.equals("Dislike")){

                    if(!guests.containsKey(guest)){
                        System.out.printf("%s is not at the party.\n",guest);
                    }else {
                        if (guests.get(guest).contains(meal)) {
                            guests.get(guest).remove(meal);
                            System.out.printf("%s doesn't like the %s.\n", guest, meal);
                            disliked++;
                        }else{
                            System.out.printf("%s doesn't have the %s in his/her collection.\n", guest, meal);
                        }
                    }
                }

                input=sc.nextLine();


                }
        for(Map.Entry<String, ArrayList<String>> entry : guests.entrySet()){
            String guest = entry.getKey();
            List<String> synonyms = entry.getValue();

            System.out.printf("%s: %s\n",guest,String.join(", ",synonyms));
        }
        System.out.printf("Unliked meals: %d",disliked);
            }

            }



