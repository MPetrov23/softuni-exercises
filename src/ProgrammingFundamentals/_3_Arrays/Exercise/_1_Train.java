package ProgrammingFundamentals._3_Arrays.Exercise;

import java.util.Scanner;

public class _1_Train {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int wagons = Integer.parseInt(sc.nextLine());
        int[] train=new int[wagons];
        int peopleSum = 0;

        for(int i =0; i<wagons; i++){
            train[i]=Integer.parseInt(sc.nextLine());
            peopleSum+=train[i];

            System.out.print(train[i]+" ");
        }

        System.out.print("\n"+peopleSum);
    }
}
