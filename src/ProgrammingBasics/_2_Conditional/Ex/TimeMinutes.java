package ProgrammingBasics._2_Conditional.Ex;

import java.util.Scanner;

public class TimeMinutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startHour = Integer.parseInt(scanner.nextLine());
        int startMinutes = Integer.parseInt(scanner.nextLine());

        int time= startHour*60 + startMinutes + 15;
        int hour= time/60;
        int minutes=time%60;

        if(hour==24){
            hour=0;
        }
        System.out.printf("%d:%02d",hour,minutes);
    }
}
