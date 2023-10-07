package ProgrammingFundamentals._2_.Lab;

import java.util.Scanner;

public class _10_SpecialNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=Integer.parseInt(sc.nextLine());

        for(int i=1; i<=num; i++ ){

            int current=i;
            int sum=0;

            while(current!=0){
                sum+=current%10;
                current=current/10;
            }

            if(sum==5){
                System.out.printf("%d -> True\n",i);
            } else if (sum==7) {
                System.out.printf("%d -> True\n",i);
            }else if (sum==11) {
                System.out.printf("%d -> True\n",i);
            }else {
                System.out.printf("%d -> False\n",i);
            }
        }

    }
}
