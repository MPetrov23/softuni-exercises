package ProgrammingFundamentals._3_Arrays.MoreExercise;

import java.util.Arrays;
import java.util.Scanner;

public class _1_EncryptSortAndPrintArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int lines= Integer.parseInt(sc.nextLine());
        int[] encrypted = new int[lines];
        int sum=0;

        for(int i=0; i<lines; i++){
           char[] input=sc.nextLine().toCharArray();

           for(int j=0;j< input.length; j++){
               if(input[j]=='a' || input[j]=='e' || input[j]=='o' || input[j]=='i' || input[j]=='u' || input[j]=='A' || input[j]=='E' || input[j]=='O' || input[j]=='I' || input[j]=='U'){
                   sum+=((int)input[j]) * input.length;
               }else{
                   sum+=((int)input[j]) / input.length;
               }
           }
           encrypted[i]=sum;
           sum=0;
        }

        boolean swapped;

        for(int i=0; i<encrypted.length; i++){
            swapped=false;
            for(int j = 0; j< encrypted.length-1; j++){
                if(encrypted[j]>encrypted[j+1]){
                    encrypted[j]=encrypted[j]+encrypted[j+1];
                    encrypted[j+1]=encrypted[j]-encrypted[j+1];
                    encrypted[j]=encrypted[j]-encrypted[j+1];
                    swapped=true;
                }
            }
            if(!swapped){
                break;
            }
        }

        for(int a : encrypted){
            System.out.println(a);
        }

    }
}
