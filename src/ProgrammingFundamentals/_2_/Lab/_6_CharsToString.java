package ProgrammingFundamentals._2_.Lab;

import java.util.Scanner;

public class _6_CharsToString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String first = sc.nextLine();
        String second = sc.nextLine();
        String third = sc.nextLine();


        StringBuilder result=new StringBuilder();
        result.append(first)
                .append(second)
                .append(third);

        System.out.println(result);
    }
}
