package ProgrammingFundamentals._8_TextProcessing.Lab;

import java.util.Scanner;

public class _1_ReverseStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        while(!input.equals("end")){
            String reversed="";
            for(int i=input.length()-1; i>=0; i--){
                reversed+=input.charAt(i);
            }
            System.out.println(input+" = "+reversed);
            input=sc.nextLine();
        }
    }
}
