package JavaAdvanced.OOP.ExceptionAndErrorHandling;

import java.io.IOException;
import java.util.Scanner;

public class _3_EnterNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[10];
        int start = 1;
        int end = 100;
        int index = 0;

        while(index<10){
            String input = sc.nextLine();
            try{
                int number = Integer.parseInt(input);
                if(number>start && number<end){
                    numbers[index++]=number;
                    start=number;
                }else{
                    throw new IOException(String.format("Your number is not in range %d - 100!",start));
                }
            }catch (IOException e){
                System.out.println(e.getMessage());
            }catch (NumberFormatException e){
                System.out.println("Invalid Number!");
            }
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i < numbers.length - 1) {
                System.out.print(", ");
            }
        }
    }
}
