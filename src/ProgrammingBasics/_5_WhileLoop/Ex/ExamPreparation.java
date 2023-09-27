package ProgrammingBasics._5_WhileLoop.Ex;

import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int lowGradesAllowed = Integer.parseInt(scan.nextLine());

        String problem="";
        int lowGrades=0;
        int count=0;
        int grades=0;

        while(lowGradesAllowed>lowGrades){
            String input=scan. nextLine();

            if(input.equals("Enough")){
                break;
            }

            int grade= Integer.parseInt(scan.nextLine());

            grades+=grade;
            count++;
            problem = input;

            if(grade<=4){
                lowGrades++;
            }

        }

        double averageGrade = (double)grades/count;
        if(lowGradesAllowed>lowGrades){
            System.out.printf("Average score: %.2f \n", averageGrade);
            System.out.printf("Number of problems: %d \n",count);
            System.out.printf("Last problem: %s", problem);

        }else{
            System.out.printf("You need a break, %d poor grades.",lowGrades);
        }
    }
}
