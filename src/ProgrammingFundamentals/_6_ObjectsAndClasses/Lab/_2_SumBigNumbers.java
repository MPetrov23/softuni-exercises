package ProgrammingFundamentals._6_ObjectsAndClasses.Lab;

import java.math.BigInteger;
import java.util.Scanner;

public class _2_SumBigNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BigInteger firstNumber = new BigInteger(sc.nextLine());
        BigInteger secondNumber = new BigInteger(sc.nextLine());

        BigInteger result= firstNumber.add(secondNumber);
        System.out.println(result);
    }
}
