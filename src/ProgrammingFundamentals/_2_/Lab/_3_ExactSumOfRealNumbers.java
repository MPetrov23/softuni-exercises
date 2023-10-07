package ProgrammingFundamentals._2_.Lab;

import java.math.BigDecimal;
import java.util.Scanner;

public class _3_ExactSumOfRealNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nums=Integer.parseInt(sc.nextLine());
        BigDecimal sum= new BigDecimal(0);
        for(int i=1;i<=nums;i++){
            BigDecimal current =new BigDecimal(sc.nextLine());
            sum=sum.add(current);
        }
        System.out.println(sum);
    }
}

