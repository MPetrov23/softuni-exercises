package ProgrammingFundamentals._4_Methods.Lab;

import java.util.Scanner;

public class _3_PrintingTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = Integer.parseInt(sc.nextLine());

        for(int i=0; i<size; i++){
            printLine(1,i);
        }
        printLine(1,size);
        for(int i=size-1; i>=1; i--){
            printLine(1,i);
        }
    }

    private static void printLine(int start,int end){
        for(int i=start; i<=end; i++){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
