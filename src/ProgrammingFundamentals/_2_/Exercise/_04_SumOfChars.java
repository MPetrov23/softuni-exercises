package ProgrammingFundamentals._2_.Exercise;

import java.util.Scanner;

public class _04_SumOfChars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int charNum=Integer.parseInt(sc.nextLine());
        int sum=0;
        for(int i=0;i<charNum;i++){
            String input = sc.next();
            char currentChar = input.charAt(0);
           sum+= (int) currentChar;
        }
        System.out.printf("The sum equals: %d",sum);
    }
}
