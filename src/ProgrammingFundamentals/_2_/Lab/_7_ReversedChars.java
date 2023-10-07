package ProgrammingFundamentals._2_.Lab;

import java.util.Scanner;

public class _7_ReversedChars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String first = sc.nextLine();
        String second = sc.nextLine();
        String third = sc.nextLine();


        StringBuilder result=new StringBuilder();
        result.append(third+" ")
                .append(second+" ")
                .append(first);


        System.out.println(result);
    }
}
