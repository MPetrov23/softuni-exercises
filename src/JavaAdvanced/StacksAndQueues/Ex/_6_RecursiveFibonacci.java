package JavaAdvanced.StacksAndQueues.Ex;

import java.util.Scanner;

public class _6_RecursiveFibonacci {
    private static long[] memory;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.nextLine());

        memory = new long[number+1];
        long result = fibonacci(number);

       System.out.println(result);
    }
    private static long fibonacci(int n){
   if(n<2){
       return 1;
   }
   if(memory[n] != 0){
       return memory[n];
        }

       memory[n]= fibonacci(n - 1) + fibonacci(n - 2);
        return memory[n];
    }
}