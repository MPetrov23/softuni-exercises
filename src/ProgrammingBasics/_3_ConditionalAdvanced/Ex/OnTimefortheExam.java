package ProgrammingBasics._3_ConditionalAdvanced.Ex;

import java.util.Scanner;

public class OnTimefortheExam {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int examHour= Integer.parseInt(scan.nextLine());
        int examMin= Integer.parseInt(scan.nextLine());
        int arriveHour= Integer.parseInt(scan.nextLine());
        int arriveMin= Integer.parseInt(scan.nextLine());

        int examTime=examHour*60+examMin;
        int arriveTime=arriveHour*60+arriveMin;

        int diff=Math.abs(examTime-arriveTime);

        if(examTime==arriveTime){
            System.out.println("On time");
        }else if (arriveTime<examTime && diff<=30) {
            System.out.println("On time");
            System.out.printf("%d minutes before the start",diff);
        } else if (arriveTime<examTime && diff>30) {
            System.out.println("Early");
            if(diff<60) {
                System.out.printf("%d minutes before the start",diff);
            }else{
                System.out.printf("%d:%02d hours before the start", diff/60,diff%60);
            }
        }else if(arriveTime>examTime){
            System.out.println("Late");
            if(diff<60) {
                System.out.printf("%d minutes after the start",diff);
            }else{
                System.out.printf("%d:%02d hours after the start", diff/60,diff%60);
            }
        }

    }
}
