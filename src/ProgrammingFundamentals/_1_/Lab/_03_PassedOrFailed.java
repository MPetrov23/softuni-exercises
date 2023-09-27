package ProgrammingFundamentals._1_.Lab;

import java.util.Scanner;

public class _03_PassedOrFailed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double grade = Double.parseDouble(sc.nextLine());

        if(grade >=3){
            System.out.println("Passed!");
        }else{
            System.out.println("Failed!");
        }
    }
}
