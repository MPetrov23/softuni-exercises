package JavaAdvanced.OOP.WorkingWithAbstraction.Lab;

import java.util.Scanner;

public class _1_RhombusOfStars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());

        for(int i=1; i<=num; i++){
            printRow(i, num-i);
        }
        for(int i=num-1; i>0;i--){
            printRow(i,num-i);
        }
    }
    public static void printRow(int stars, int spaces){
        for (int space = 0; space < spaces; space++){
            System.out.print(" ");
        }
        for (int star=0; star<stars; star++){
            System.out.print("* ");
        }
        System.out.println();
    }
}
