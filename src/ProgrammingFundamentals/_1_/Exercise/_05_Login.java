package ProgrammingFundamentals._1_.Exercise;

import java.util.Scanner;

public class _05_Login {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String username = sc.nextLine();
        StringBuilder reversed = new StringBuilder(username).reverse();
        String password = reversed.toString();
        String input=sc.nextLine();
        int counter=1;

        while(!password.equals(input) ){
            System.out.println("Incorrect password. Try again.");
            input=sc.nextLine();
            counter++;
            if(counter==4){
                break;
            }
            }

        if(!password.equals(input)) {
            System.out.printf("User %s blocked!", username);
        }else {
            System.out.printf("User %s logged in.", username);
        }

    }
}
