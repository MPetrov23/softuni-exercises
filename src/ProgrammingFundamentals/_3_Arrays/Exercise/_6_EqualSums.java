package ProgrammingFundamentals._3_Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class _6_EqualSums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers= Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(e ->Integer.parseInt(e))
                .toArray();
        int left=0;
        int right=0;
        boolean flag=false;

        for(int i=0; i< numbers.length; i++){
            for(int j=i-1;j>=0;j--){
                if(j < 0){
                    left+=0;
                }else {
                    left += numbers[j];
                }
            }
            for (int j=i+1;j<=numbers.length;j++){
                if(j==numbers.length){
                    right+=0;
                }else {
                    right += numbers[j];
                }
            }

            if(left==right){
                System.out.print(i);
                flag=true;
            }
            left=0;
            right=0;
        }
        if(!flag){
            System.out.print("no");
        }
    }
}
