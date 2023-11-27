package ProgrammingFundamentals._4_Methods.Exercise;

import java.util.Locale;
import java.util.Scanner;

public class _2_VowelsCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(vowelsCount(input));
    }
    private static int vowelsCount(String input){
        int vowels = 0;
        String word=input.toLowerCase(Locale.getDefault());
        for(int i=0; i<word.length();i++){
            if(word.charAt(i)=='a' || word.charAt(i)=='e' || word.charAt(i)=='o' || word.charAt(i)=='u' || word.charAt(i)=='y' || word.charAt(i)=='i'){
                vowels++;
            }
        }
        return vowels;
    }
}
