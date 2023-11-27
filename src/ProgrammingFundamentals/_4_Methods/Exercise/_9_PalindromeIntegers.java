package ProgrammingFundamentals._4_Methods.Exercise;

import java.util.Scanner;

public class _9_PalindromeIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        while(!input.equals("END")){
            int number=Integer.parseInt(input);
            System.out.println(isPalindrome(number));
            input= sc.nextLine();
        }

    }
    private static boolean isPalindrome(int num){
        if (num < 0) {
            return false;
        }

        int originalNumber = num;
        int reversedNumber = 0;

        while (num != 0) {
            int digit = num % 10;
            reversedNumber = reversedNumber * 10 + digit;
            num /= 10;
        }

        return originalNumber == reversedNumber;
    }

}
