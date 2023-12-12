package ProgrammingFundamentals._8_TextProcessing.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class _2_RepeatStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] input=  sc.nextLine().split(" ");
        String finalString="";

        for(int i=0; i<input.length;i++){
            String current = input[i];
            for(int j=0;j<current.length();j++){
                finalString+=current;
            }
        }

        System.out.print(finalString);
    }
}
