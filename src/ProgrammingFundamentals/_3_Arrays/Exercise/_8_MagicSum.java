package ProgrammingFundamentals._3_Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class _8_MagicSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers= Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();
        int sum=Integer.parseInt(sc.nextLine());

        for(int i=0; i<numbers.length; i++){
            for(int j=i+1;j<numbers.length; j ++){
                    if(numbers[i]+numbers[j]==sum){
                        System.out.printf("%d %d\n",numbers[i],numbers[j]);

                    }
            }
        }
    }
}
