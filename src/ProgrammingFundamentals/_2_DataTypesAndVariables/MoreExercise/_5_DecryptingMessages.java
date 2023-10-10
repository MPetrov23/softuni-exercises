package ProgrammingFundamentals._2_DataTypesAndVariables.MoreExercise;

import java.util.Scanner;

public class _5_DecryptingMessages {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int key=Integer.parseInt(sc.nextLine());
        int lines=Integer.parseInt(sc.nextLine());
        String message="";

        for(int i=0; i<lines; i++){
            String input=sc.next();
            char encryptedLetter=input.charAt(0);
            char letter= (char) (encryptedLetter+key);
            message+=letter;
        }

        System.out.println(message);
    }
}
