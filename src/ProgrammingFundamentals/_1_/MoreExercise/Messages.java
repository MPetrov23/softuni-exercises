package ProgrammingFundamentals._1_.MoreExercise;

import java.util.Scanner;

public class Messages {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int letters =Integer.parseInt(sc.nextLine());

        StringBuilder message= new StringBuilder();

        for(int i = 1; i <=letters;i++){
            int number = Integer.parseInt(sc.nextLine());
            if (number == 0) {
                message.append(" ");
            } else {
                int numberOfDigits = String.valueOf(number).length();
                int mainDigit = number%10;
                int offset = (mainDigit - 2) * 3;
                if (mainDigit == 8 || mainDigit == 9) {
                    offset += 1;
                }
                int letterIndex = offset + numberOfDigits - 1;
                char letter = (char) (letterIndex + 'a');
                message.append(letter);
            }
        }
        System.out.println(message);
    }
}
