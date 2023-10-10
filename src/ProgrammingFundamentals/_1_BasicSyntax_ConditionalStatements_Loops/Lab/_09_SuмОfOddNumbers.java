package ProgrammingFundamentals._1_BasicSyntax_ConditionalStatements_Loops.Lab;

import java.util.Scanner;

public class _09_SuмОfOddNumbers {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int num = Integer.parseInt(sc.nextLine());
        int sum=0;
        int odd=1;

        for(int i=1; i<=num; i++){
            System.out.println(odd);
            sum+=odd;
            odd+=2;
        }
        System.out.printf("Sum: %d", sum);
    }
}
