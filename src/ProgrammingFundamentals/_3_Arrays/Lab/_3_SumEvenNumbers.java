package ProgrammingFundamentals._3_Arrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class _3_SumEvenNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0;

        int[] numbers= Arrays
                .stream(sc.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        for(int i=0; i<=numbers.length-1; i++){
            if(numbers[i]%2==0){
                sum+=numbers[i];
            }
        }
        System.out.print(sum);
    }
}
