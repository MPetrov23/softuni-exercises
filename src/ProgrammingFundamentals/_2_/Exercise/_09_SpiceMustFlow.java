package ProgrammingFundamentals._2_.Exercise;

import java.util.Scanner;

public class _09_SpiceMustFlow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int yield = Integer.parseInt(sc.nextLine());
        int totalYield=0;
        int days=0;

        while(yield>=100){
            totalYield+=yield;

            if(totalYield>=26) {
                totalYield -= 26;
            }

            yield-=10;
            days++;
        }

        if(totalYield>=26) {
            totalYield -= 26;
        }

        System.out.println(days);
        System.out.println(totalYield);
    }

}
