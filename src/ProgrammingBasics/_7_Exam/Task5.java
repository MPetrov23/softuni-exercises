package ProgrammingBasics._7_Exam;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days =1;
        int atanas=5364;
        int everest=8848;

        while(days<=5 ){
            String input=scanner.nextLine();
            if(input.equals("END")){
                break;
            }
            int meters = Integer.parseInt(scanner.nextLine());


            if (input.equals("Yes")) {
                days++;
            }
            if(days>+5){
                break;
            }
            atanas+=meters;
            if(atanas>=everest){
                break;
            }
        }

        if(atanas>=everest){
            System.out.printf("Goal reached for %d days!",days);
        }else{
            System.out.println("Failed!");
            System.out.println(atanas);

        }

    }
}
