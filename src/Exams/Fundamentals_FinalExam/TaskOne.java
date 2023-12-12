package Exams.Fundamentals_FinalExam;

import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();

        String input = sc.nextLine();

        while (!input.equals("Done")){
            String[] commandParts=input.split(" ");
            String command = commandParts[0];

            switch (command){
                case "Change" :
                    String charToChange = commandParts[1];
                    String replacement = commandParts[2];

                    word=word.replace(charToChange,replacement);
                    System.out.println(word);
                    break;
                case "Includes" :
                    String includesSubstring = commandParts[1];
                    if(word.contains(includesSubstring)){
                        System.out.println("True");
                    }else {
                        System.out.println("False");
                    }
                    break;
                case "End" :
                    String endSubstring = commandParts[1];
                    if(word.endsWith(endSubstring)){
                        System.out.println("True");
                    }else {
                        System.out.println("False");
                    }
                    break;
                case "Uppercase" :
                    word=word.toUpperCase();

                    System.out.println(word);
                    break;
                case "FindIndex" :
                    String charToFind = commandParts[1];
                    int index = word.indexOf(charToFind);
                    if (index != -1) {
                        System.out.println(index);
                    }
                    break;
                case "Cut" :
                    int startIndex = Integer.parseInt(commandParts[1]);
                    int cutCount = Integer.parseInt(commandParts[2]);
                    int endIndex =startIndex+cutCount;

                    word = word.substring(startIndex,endIndex);
                    System.out.println(word);

                    break;
            }
            input= sc.nextLine();
        }
    }
}
