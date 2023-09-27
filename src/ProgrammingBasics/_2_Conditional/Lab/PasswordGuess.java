package ProgrammingBasics._2_Conditional.Lab;

import java.util.Scanner;

public class PasswordGuess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String attempt = scanner.nextLine();
        String password="s3cr3t!P@ssw0rd";
        if(attempt.equals(password)){
            System.out.print("Welcome");
        }
        else{
            System.out.print("Wrong password!");
        }
    }
}
