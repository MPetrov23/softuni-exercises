package ProgrammingFundamentals._4_Methods.Exercise;

import java.util.Scanner;

public class _10_TopNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int end=Integer.parseInt(sc.nextLine());
        topNumbers(end);
    }

    private static void topNumbers(int end){
        for(int i=0;i<=end;i++){
            if(isDivideByEight(i) && isHasOdd(i)){
                System.out.println(i);
            }
        }

    }

    private static boolean isDivideByEight(int num){
        int digitSum=0;
        while(num>0){
            digitSum+=num%10;
            num/=10;
        }
        if(digitSum%8==0){
            return true;
        }
        return false;
    }

    private static boolean isHasOdd(int num){
        while(num>0){
            if(num%2!=0){
                return true;
            }
            num/=10;
        }
        return false;
    }
}
