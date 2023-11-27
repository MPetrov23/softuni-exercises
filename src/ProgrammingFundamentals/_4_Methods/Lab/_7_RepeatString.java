package ProgrammingFundamentals._4_Methods.Lab;

import java.util.Scanner;

public class _7_RepeatString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String stringToRepeat = sc.nextLine();
        int timesToRepeat = Integer.parseInt(sc.nextLine());
        System.out.println(repeat(stringToRepeat,timesToRepeat));
    }
    private static String repeat(String givenString, int times){
        String finalString ="";
        for(int i=0;i<times;i++){
            finalString+=givenString;
        }
        return finalString;
    }
}
