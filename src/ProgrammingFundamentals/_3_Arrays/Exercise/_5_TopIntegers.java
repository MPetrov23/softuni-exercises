package ProgrammingFundamentals._3_Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class _5_TopIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();
        boolean isTop=false;

        for(int i=0; i< numbers.length; i++){
            if( i==numbers.length-1){
                isTop=true;
            }else {
                for (int j = i + 1; j < numbers.length; j++) {
                    if (numbers[i] > numbers[j]) {
                        isTop = true;
                    } else {
                        isTop = false;
                        break;
                    }
                }
            }
            if(isTop){
                System.out.print(numbers[i]+ " ");
            }
        }
    }
}
