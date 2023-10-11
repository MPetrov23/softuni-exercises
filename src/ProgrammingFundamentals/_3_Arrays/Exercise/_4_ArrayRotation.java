package ProgrammingFundamentals._3_Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class _4_ArrayRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers= Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();
        int rotations=Integer.parseInt(sc.nextLine());

        for(int i=0; i<rotations; i++){
            int temp=numbers[0];

            for(int j=0; j< numbers.length-1; j++){
              numbers[j]=numbers[j+1];
            }

            numbers[numbers.length-1]=temp;
        }

        for( int i=0;i<numbers.length; i++){
            System.out.print(numbers[i]+ " ");
        }
    }
}
