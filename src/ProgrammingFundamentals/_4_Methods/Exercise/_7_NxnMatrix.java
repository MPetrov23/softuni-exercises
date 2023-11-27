package ProgrammingFundamentals._4_Methods.Exercise;

import java.util.Scanner;

public class _7_NxnMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size=Integer.parseInt(sc.nextLine());
        matrix(size);
    }

    private static void matrix(int size){
        for(int i=0; i<size; i++){
            for(int j=0;j<size; j++){
                System.out.print(size+" ");
            }
            System.out.println();
        }
    }
}
