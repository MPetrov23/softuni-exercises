package ProgrammingFundamentals._2_.MoreExercise;

import java.util.Scanner;

public class _2_FromLeftToTheRight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int lines = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < lines; i++) {
            String input = sc.nextLine();
            String[] parts = input.split(" ");
            int digitsSum=0;

            long leftNum = Long.parseLong(parts[0]);
            long rightNum = Long.parseLong(parts[1]);

                if (leftNum > rightNum) {
                    digitsSum=sumOfDigits(leftNum);
                } else {
                    digitsSum=sumOfDigits(rightNum);
                }

            System.out.println(Math.abs(digitsSum));

        }


    }


    public static int sumOfDigits(long num){
        int sum=0;
        while(num!=0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }



}