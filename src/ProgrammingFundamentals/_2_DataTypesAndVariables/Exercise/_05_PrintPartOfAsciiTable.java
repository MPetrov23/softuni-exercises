package ProgrammingFundamentals._2_DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class _05_PrintPartOfAsciiTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = Integer.parseInt(sc.nextLine());
        int end = Integer.parseInt(sc.nextLine());

        for(int i=start; i<=end; i++){
            System.out.print((char)i+" ");
        }
    }
}
