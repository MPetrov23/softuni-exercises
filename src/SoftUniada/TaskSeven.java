package SoftUniada;

import java.util.Scanner;
public class TaskSeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = Integer.parseInt(sc.nextLine());
        int end = Integer.parseInt(sc.nextLine());

        for(int i = start;i<=end;i++){
            if(isSpecial(i)) System.out.println(i);
        }
    }
    public static boolean isSpecial(int number) {
        String numStr = Integer.toString(number);

        for (int i = 1; i < numStr.length(); i++) {
            int prevDigit = numStr.charAt(i - 1) - '0';
            int currDigit = numStr.charAt(i) - '0';
            if (Math.abs(prevDigit - currDigit) != 1) {
                return false;
            }
        }
        return true;
    }
}