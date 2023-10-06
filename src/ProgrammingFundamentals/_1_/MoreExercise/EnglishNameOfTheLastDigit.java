package ProgrammingFundamentals._1_.MoreExercise;

import java.util.Scanner;

public class EnglishNameOfTheLastDigit {

    public static String lastDigit(int num){
        int lastDigit=num%10;
        String digit="";

        switch (lastDigit){
            case 0:
                digit="zero";
                break;
            case 1:
                digit="one";
                break;
            case 2:
                digit="two";
                break;
            case 3:
                digit="three";
                break;
            case 4:
                digit="four";
                break;
            case 5:
                digit="five";
                break;
            case 6:
                digit="six";
                break;
            case 7:
                digit="seven";
                break;
            case 8:
                digit="eight";
                break;
            case 9:
                digit="nine";
                break;

        }
        return digit;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        System.out.println(lastDigit(num));
    }
}
