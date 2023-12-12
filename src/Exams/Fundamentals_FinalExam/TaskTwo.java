package Exams.Fundamentals_FinalExam;

import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String regex ="(![A-Z][a-z]{2,}!):(\\[[a-zA-z]{8,}\\])";

        int count =Integer.parseInt(sc.nextLine());




        for(int i=0; i<count; i++){
            String input=sc.nextLine();


            if(input.matches(regex)){

                String[] parts=removeSymbols(input).split(" ");
                System.out.println(parts[0]+" "+translate(parts[1]));

            }else{

                System.out.println("The message is invalid");

            }

        }
    }
    private static String removeSymbols(String input) {
        String result=input.replaceAll("[!\\[\\]]", "");
        result = result.replace(":",": ");
        return result;
    }

    private static String translate(String input){
        char[] letters = input.toCharArray();
        String result="";

        for(int i=0; i< letters.length; i++){
            if(i< letters.length-1){
                result+=(int) letters[i]+" ";
            }else{
                result+=(int) letters[i];
            }
        }

        return result;
    }
}
