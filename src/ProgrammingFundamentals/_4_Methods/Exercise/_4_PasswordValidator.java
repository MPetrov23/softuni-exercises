package ProgrammingFundamentals._4_Methods.Exercise;

import java.util.Scanner;

public class _4_PasswordValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password = sc.nextLine();

        checkPassword(password);
    }

    private static boolean isRightLength(String pass){
        if(pass.length()>=6 && pass.length()<=10 ){
            return true;
        }
        return false;
    }

    private static boolean isCorrectSymbols(String pass){
        for(int i=0;i<pass.length();i++){
            if(!Character.isLetterOrDigit(pass.charAt(i))){
                return false;
            }
        }
        return true;
    }
    private static boolean isEnoughDigits(String pass){
        int digitCount = 0;

        for (char c : pass.toCharArray()) {
            if (Character.isDigit(c)) {
                digitCount++;

                if (digitCount >= 2) {
                    return true;
                }
            }
        }
        return false;
    }

    private static void checkPassword(String password) {
        if (isRightLength(password) && isCorrectSymbols(password) && isEnoughDigits(password)) {
            System.out.println("Password is valid");
        } else {
            if (!isRightLength(password)) {
            System.out.println("Password must be between 6 and 10 characters");
            }
             if (!isCorrectSymbols(password)) {
            System.out.println("Password must consist only of letters and digits");
            }
            if (!isEnoughDigits(password)) {
            System.out.println("Password must have at least 2 digits");
            }
    }
    }
}
