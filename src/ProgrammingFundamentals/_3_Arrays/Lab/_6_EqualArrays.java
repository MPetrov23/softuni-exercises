package ProgrammingFundamentals._3_Arrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class _6_EqualArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arrayOne = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();
        int[] arrayTwo = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        int arrayOneSum=0;
        int flag=0;

        for(int i=0; i<arrayOne.length; i++){
            if(arrayOne[i]!=arrayTwo[i]){
                System.out.printf("Arrays are not identical. Found difference at %d index.",i);
                flag++;
                break;
            }else {
                arrayOneSum+=arrayOne[i];

            }
        }

        if(flag==0){
            System.out.printf("Arrays are identical. Sum: %d",arrayOneSum);
        }

    }
}
