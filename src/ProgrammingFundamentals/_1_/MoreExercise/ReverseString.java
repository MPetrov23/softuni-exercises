package ProgrammingFundamentals._1_.MoreExercise;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        char[] charArray = input.toCharArray();

        int start = 0;
        int end = charArray.length - 1;

        while (start < end) {

            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;
            start++;
            end--;
        }
        String reversed = new String(charArray);

        System.out.println(reversed);
    }
}
