package ProgrammingFundamentals._1_BasicSyntax_ConditionalStatements_Loops.Exercise;

import java.util.Scanner;

public class _04_PrintAndSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = Integer.parseInt(sc.nextLine());
        int end = Integer.parseInt(sc.nextLine());
        int sum=0;

        for(int i =start; i<=end; i++){
            System.out.printf("%d ",i);
            sum+=i;
        }
        System.out.printf("\nSum: %d",sum);
    }
}
