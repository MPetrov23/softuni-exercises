package ProgrammingFundamentals._8_TextProcessing.Lab;

import java.util.Scanner;

public class _5_DigitsLettersAndOther {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String numbers="";
        String characters="";
        String symbols="";

        for(int i=0;i<input.length();i++){
            char curr=input.charAt(i);
            if(isDigit(curr)){
                numbers+=curr;
            }else if(isChar(curr)){
                characters+=curr;
            }else{
                symbols+=curr;
            }
        }

        System.out.println(numbers);
        System.out.println(characters);
        System.out.println(symbols);
    }

    private static boolean isDigit(char a){
        if (Character.isDigit(a)) {
            return  true;
        } else {
            return false;
        }
    }
    private static boolean isChar(char a){
        if (Character.isLetter(a)) {
            return  true;
        } else {
            return false;
        }
    }

}
