package ProgrammingBasics._3_ConditionalAdvanced.Lab;

import java.util.Scanner;

public class InvalidNumber {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);

        double number= Double.parseDouble(scanner.nextLine());

        if(number>=100 && number<=200 || number==0){

        }
        else {
            System.out.println("invalid");
        }
    }
}
