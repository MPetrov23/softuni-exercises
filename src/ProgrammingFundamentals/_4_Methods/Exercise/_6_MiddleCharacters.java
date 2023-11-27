package ProgrammingFundamentals._4_Methods.Exercise;

import java.util.Scanner;

public class _6_MiddleCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(middleChar(input));
    }
    private static String middleChar(String input){
        String middle="";
        int mid=input.length()/2;

        if(input.length()%2==0){
            middle+=input.charAt(mid-1);
        }
        middle+=input.charAt(mid);

        return middle;
    }
}
