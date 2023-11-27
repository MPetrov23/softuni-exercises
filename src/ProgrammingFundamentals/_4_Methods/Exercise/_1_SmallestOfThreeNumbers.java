package ProgrammingFundamentals._4_Methods.Exercise;

import java.util.Scanner;

public class _1_SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstNum = Integer.parseInt(sc.nextLine());
        int secondNum = Integer.parseInt(sc.nextLine());
        int thirdNum = Integer.parseInt(sc.nextLine());

        System.out.println(smallestOfThree(firstNum,secondNum,thirdNum));
    }

    private static int smallestOfThree(int a,int b, int c){
        int smallest=a;
        if(b<smallest){
            smallest=b;
        }
        if(c<smallest){
            smallest=c;
        }
        return smallest;
    }
}
