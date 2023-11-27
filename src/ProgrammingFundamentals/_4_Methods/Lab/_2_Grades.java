package ProgrammingFundamentals._4_Methods.Lab;

import java.util.Scanner;

public class _2_Grades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double grade=Double.parseDouble(sc.nextLine());
        System.out.print(gradeWithWords(grade));
    }

    private static String gradeWithWords(double grade){
        if(grade<=2.99){
            return "Fail";
        } else if (grade>=3 && grade<=3.49) {
            return "Poor";
        }else if (grade>=3.5 && grade<=4.49) {
            return "Good";
        }else if (grade>=4.5 && grade<=5.49) {
            return "Very good";
        }else if (grade>=5.5) {
            return "Excellent";
        }
        return null;
    }
}
