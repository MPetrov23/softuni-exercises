package ProgrammingFundamentals._3_Arrays.MoreExercise;

import java.util.Scanner;

public class _3_RecursiveFibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int fibonacciN= Integer.parseInt(sc.nextLine());
        long[] array=new long[50];

        for(int i=0;i<array.length;i++){
            if(i==0 || i==1){
                array[i]=1;
            }else {
                array[i]=array[i-1]+array[i-2];
            }
        }

        System.out.print(array[fibonacciN-1]);
    }

}
