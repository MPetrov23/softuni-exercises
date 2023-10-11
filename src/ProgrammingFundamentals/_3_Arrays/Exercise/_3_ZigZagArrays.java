package ProgrammingFundamentals._3_Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class _3_ZigZagArrays {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int lines =Integer.parseInt(sc.nextLine());

        int[] firstArray=new int[lines];
        int[] secondArray=new int[lines];
        int firstIndex=0;
        int secondIndex=1;

        for(int i=0; i<lines; i++){
            int[] arr= Arrays.stream(sc.nextLine().split(" "))
                    .mapToInt(e -> Integer.parseInt(e))
                    .toArray();

            firstArray[i]=arr[firstIndex];
            secondArray[i]=arr[secondIndex];

            firstIndex=firstIndex+secondIndex;
            secondIndex=firstIndex-secondIndex;
            firstIndex=firstIndex-secondIndex;
        }

        for(int i=0; i<firstArray.length; i++){
            System.out.print(firstArray[i]+ " ");
        }
        System.out.println();
        for(int i=0; i<secondArray.length; i++){
            System.out.print(secondArray[i]+ " ");
        }

    }
}
