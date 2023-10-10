package ProgrammingFundamentals._2_DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class _02_SumDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num =Integer.parseInt(sc.nextLine());
        int digitsSum=0;

        while(num>0){
            digitsSum+=num%10;
            num/=10;
        }

            System.out.print(digitsSum);
    }
}
