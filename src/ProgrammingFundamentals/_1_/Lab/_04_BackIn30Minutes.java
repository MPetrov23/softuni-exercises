package ProgrammingFundamentals._1_.Lab;

import java.util.Scanner;

public class _04_BackIn30Minutes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int hours=Integer.parseInt(sc.nextLine());
        int minutes=Integer.parseInt(sc.nextLine());

        minutes+=30;

        if(minutes>59){
            minutes-=60;
            hours++;
            if(hours==24){
                hours=0;
            }
        }

        System.out.printf("%d:%02d",hours,minutes);

    }
}
