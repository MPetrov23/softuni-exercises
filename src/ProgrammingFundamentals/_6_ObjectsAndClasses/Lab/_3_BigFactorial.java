package ProgrammingFundamentals._6_ObjectsAndClasses.Lab;

import java.math.BigInteger;
import java.util.Scanner;

public class _3_BigFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = Integer.parseInt(sc.nextLine());

        BigInteger factorial = factorial(number);
        System.out.println(factorial);

    }
    private static BigInteger factorial(int a){

        if (a > 0) {
            BigInteger result = BigInteger.valueOf(1);

            for (int i = 1; i <= a; i++) {
                result=result.multiply(BigInteger.valueOf(i));
            }

            return result;
        }
        return BigInteger.valueOf(0);
    }
}
