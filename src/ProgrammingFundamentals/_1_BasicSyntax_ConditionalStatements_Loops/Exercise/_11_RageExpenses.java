package ProgrammingFundamentals._1_BasicSyntax_ConditionalStatements_Loops.Exercise;

import java.util.Scanner;

public class _11_RageExpenses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int gamesLost = Integer.parseInt(sc.nextLine());
        double headsetPrice = Double.parseDouble(sc.nextLine());
        double mousePrice = Double.parseDouble(sc.nextLine());
        double keyboardPrice = Double.parseDouble(sc.nextLine());
        double displayPrice = Double.parseDouble(sc.nextLine());
        double sum=0;
        int keyboardsBroken=0;

        for(int i=1; i<=gamesLost;i++){
            if(i%2==0 && i%3==0){
                sum+=headsetPrice;
                sum+=keyboardPrice;
                sum+=mousePrice;
                keyboardsBroken++;
                if(keyboardsBroken%2==0){
                    sum+=displayPrice;
                }
            }else if(i%2==0){
                sum+=headsetPrice;
            } else if(i%3==0){
                sum+=mousePrice;
            }
        }
        System.out.printf("Rage expenses: %.2f lv.",sum);
    }
}
