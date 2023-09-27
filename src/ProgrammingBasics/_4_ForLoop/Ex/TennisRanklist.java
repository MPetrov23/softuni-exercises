package ProgrammingBasics._4_ForLoop.Ex;
import java.util.Scanner;
public class TennisRanklist {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int tournamentsN = Integer.parseInt(scan.nextLine());
        int startingPoints = Integer.parseInt(scan.nextLine());

        int tournamentsWon=0;
        int pointsWon=0;

        for(int i =1; i<=tournamentsN;i++){
            String result=scan.nextLine();
            if(result.equals("W")){
                pointsWon+=2000;
                tournamentsWon++;
            } else if (result.equals("F")) {
                pointsWon+=1200;
            } else if (result.equals("SF")) {
                pointsWon+=720;
            }
        }

        double winPercent=(double) tournamentsWon/tournamentsN*100;
        String percent = "%";

        System.out.printf("Final points: %d\n",startingPoints+pointsWon);
        System.out.printf("Average points: %d\n",pointsWon/tournamentsN);
        System.out.printf("%.2f%s",winPercent,percent);
    }
}
