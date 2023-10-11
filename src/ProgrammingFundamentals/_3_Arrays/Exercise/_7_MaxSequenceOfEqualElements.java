package ProgrammingFundamentals._3_Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class _7_MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers= Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        int maxLength=0;
        int currentLength=1;
        int longestStartIndex=0;
        int currentStartIndex=0;

        for(int i=1; i< numbers.length; i++){
            if(numbers[i]==numbers[i-1]){
                currentLength++;
            }else {
                currentLength=1;
                currentStartIndex=i;
            }

            if(currentLength>maxLength){
                maxLength=currentLength;
                longestStartIndex=currentStartIndex;
            }
        }
        for(int i=longestStartIndex;i<longestStartIndex+maxLength;i++){
            System.out.print(numbers[i]+" ");

        }
    }
}
