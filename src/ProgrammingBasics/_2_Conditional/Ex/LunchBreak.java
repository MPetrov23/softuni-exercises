package ProgrammingBasics._2_Conditional.Ex;

import java.util.Scanner;

public class LunchBreak {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String movieTitle = scanner.nextLine();
        int episodeTime = Integer.parseInt(scanner.nextLine());
        int breakTime = Integer.parseInt(scanner.nextLine());

        double lunchTime = breakTime/8.0;
        double restTime = breakTime/4.0;

        double timeLeft= breakTime - (lunchTime+restTime);
        double diff= Math.ceil(Math.abs(timeLeft-episodeTime));

        if(timeLeft>=episodeTime){
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", movieTitle,diff);
        }
        else {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", movieTitle,diff);

        }

    }
}
