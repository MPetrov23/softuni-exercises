package ProgrammingFundamentals._4_Methods.MoreExercise;

import java.util.Scanner;

public class _5_MultiplicationSign {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1=Integer.parseInt(sc.nextLine());
        int num2=Integer.parseInt(sc.nextLine());
        int num3=Integer.parseInt(sc.nextLine());

        System.out.println(productSign(num1,num2,num3));
    }
    private static String productSign(int a, int b, int c ){
        int minusCount=0;
        if(a==0 || b==0 || c==0){
            return "zero";
        }
        if(a<0){
            minusCount++;
        }
        if(b<0){
            minusCount++;
        }
        if(c<0){
            minusCount++;
        }
        if(minusCount%2!=0){
            return "negative";
        }
        return "positive";
    }
}
