package ProgrammingFundamentals._1_BasicSyntax_ConditionalStatements_Loops.Exercise;

import java.util.Scanner;

public class _10_PadawanEquipment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double georgeMoney = Double.parseDouble(sc.nextLine());
        int studentsCount= Integer.parseInt(sc.nextLine());
        double lightsabers = Double.parseDouble(sc.nextLine());
        double robes = Double.parseDouble(sc.nextLine());
        double belts = Double.parseDouble(sc.nextLine());

        double sumLightsabers=Math.ceil(studentsCount+studentsCount*0.1)*lightsabers;
        double sumRobes=studentsCount*robes;
        double sumBelts=(studentsCount-studentsCount/6)*belts;

        double totalSum=sumLightsabers+sumRobes+sumBelts;

        if(georgeMoney>=totalSum){
            System.out.printf("The money is enough - it would cost %.2flv.", totalSum);
        }else{
            double neededMoney=totalSum-georgeMoney;
            System.out.printf("George Lucas will need %.2flv more.", neededMoney);
        }


    }
}
