package ProgrammingFundamentals._3_Arrays.Lab;

import java.util.Scanner;

public class _2_PrintNumbersInReverseOrder {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int lines = Integer.parseInt(sc.nextLine());
        int[] numbers=new int[lines];

        for(int i=0; i<lines; i++){
            numbers[i]=Integer.parseInt(sc.nextLine());
        }

        for(int i=numbers.length -1;i>=0; i--){
            System.out.print(numbers[i]+ " ");
        }
    }
}
