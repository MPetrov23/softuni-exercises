package ProgrammingFundamentals._4_Methods.Exercise;

import java.util.Scanner;

public class _5_AddAndSubtract {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstNum = Integer.parseInt(sc.nextLine());
        int secondNum = Integer.parseInt(sc.nextLine());
        int thirdNum = Integer.parseInt(sc.nextLine());

        System.out.println(subtract(sumTwo(firstNum,secondNum),thirdNum));
    }

    private static int sumTwo(int a,int b){
        return a+b;
    }
    private static int subtract(int a, int b){
        return a-b;
    }
}
