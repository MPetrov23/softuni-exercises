package ProgrammingFundamentals._2_DataTypesAndVariables.Lab;

import java.util.Scanner;

public class _5_ConcatNames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstName = sc.nextLine();
        String lastName = sc.nextLine();
        String delimeter = sc.nextLine();


        StringBuilder result=new StringBuilder();
        result.append(firstName)
                .append(delimeter)
                .append(lastName);

        System.out.println(result);
    }
}
