package ProgrammingBasics._2_Conditional.Ex;

import java.util.Scanner;

public class BonusScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = Integer.parseInt(scanner.nextLine());

        double bonus=0;
        double totalScore=score;

        if(score<=100){
            bonus+=5;
        } else if (score>100 && score<=1000) {
            bonus+=totalScore*20/100;
        } else if (score>1000) {
            bonus+=totalScore*10/100;
        }

        if(score%2==0){
            bonus+=1;
        } else if (score%5==0) {
            bonus+=2;
        }


        System.out.println(bonus);
        System.out.println(score+bonus);
    }
}
