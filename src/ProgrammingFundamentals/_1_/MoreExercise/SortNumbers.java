package ProgrammingFundamentals._1_.MoreExercise;

import java.util.Scanner;

public class SortNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1=Integer.parseInt(sc.nextLine());
        int num2=Integer.parseInt(sc.nextLine());
        int num3=Integer.parseInt(sc.nextLine());
        int top,mid,bot = 0;

        if(num1>num2 && num1>num3){
            top=num1;
            if(num2>num3){
                mid=num2;
                bot=num3;
            }else {
                mid=num3;
                bot=num2;
            }
        } else if (num2>num1 && num2>num3) {
            top=num2;
            if(num1>num3){
                mid=num1;
                bot=num3;
            }else {
                mid=num3;
                bot=num1;
            }
        }else {
            top = num3;
            if(num1>num2){
                mid=num1;
                bot=num2;
            }else {
                mid=num2;
                bot=num1;
            }
        }

        System.out.printf("%d\n%d\n%d\n",top,mid,bot);
    }
}
