package JavaAdvanced.OOP.ExceptionAndErrorHandling;

import java.util.Scanner;

public class _2_SquareRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        try{
            int num = Integer.parseInt(input);
            if(num>=0){
                double numSqrt = Math.sqrt(num);
                System.out.printf("%.2f\n",numSqrt);
            }else{
                throw new NumberFormatException();
            }
        }catch (NumberFormatException e){
            System.out.println("Invalid");
        }finally {
            System.out.println("Goodbye");
        }
    }
}
