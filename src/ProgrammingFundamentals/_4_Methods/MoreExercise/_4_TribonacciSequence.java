package ProgrammingFundamentals._4_Methods.MoreExercise;

import java.util.Scanner;

public class _4_TribonacciSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count= Integer.parseInt(sc.nextLine());
        tribonacci(count);
    }
    private static void tribonacci(int num){
        int[] arr= new int[num];
        arr[0]=1;
        for(int i=1;i<num;i++){
            if(i-2>0){
                arr[i]=arr[i-1]+arr[i-2]+arr[i-3];
            } else if (i-1>0) {
                arr[i]=arr[i-1]+arr[i-2];
            } else {
                arr[i]=arr[i-1];
            }

        }
        for(int i=0;i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
