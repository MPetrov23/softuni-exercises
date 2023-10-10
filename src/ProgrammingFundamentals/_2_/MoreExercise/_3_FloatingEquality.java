package ProgrammingFundamentals._2_.MoreExercise;

import java.util.Scanner;

public class _3_FloatingEquality {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double eps=0.000001;

        double numberA = Double.parseDouble(sc.nextLine());
        double numberB = Double.parseDouble(sc.nextLine());

        if(Math.abs(numberA-numberB)<eps){
            System.out.println("True");
        }else {
            System.out.println("False");
        }
    }
}
