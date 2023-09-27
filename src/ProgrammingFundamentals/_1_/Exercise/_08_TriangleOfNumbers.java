package ProgrammingFundamentals._1_.Exercise;

import java.util.Scanner;

public class _08_TriangleOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = Integer.parseInt(sc.nextLine());

        for(int i=1; i<=num; i++){

            for(int j=1;j<=i;j++){
                System.out.printf("%d ",i);
            }
            System.out.println("");
        }
    }
}
