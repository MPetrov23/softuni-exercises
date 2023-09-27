package ProgrammingBasics._4_ForLoop.Ex;

import java.util.Scanner;

public class Oscars {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        String actor=scan.nextLine();
        double points=Double.parseDouble(scan.nextLine());
        int judges=Integer.parseInt(scan.nextLine());

        for(int i=1; i<=judges;i++){
            String judge=scan.nextLine();
            double judgePoints=Double.parseDouble(scan.nextLine());
            points+=(judge.length()*judgePoints)/2;
            if(points>1205.5){
                System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!",actor,points);
                break;
            }
        }

        double diff=Math.abs(1250.5-points);
        if(points<1250.5){
            System.out.printf("Sorry, %s you need %.1f more!",actor,diff);
        }
    }
}
