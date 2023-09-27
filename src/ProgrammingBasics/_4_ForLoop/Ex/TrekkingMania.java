package ProgrammingBasics._4_ForLoop.Ex;


import java.util.Scanner;

public class TrekkingMania {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nGroups=Integer.parseInt(scan.nextLine());

        int totalHikers=0;
        double musala=0;
        double monblan=0;
        double kilimanjaro=0;
        double k2=0;
        double everest=0;

        for(int i = 1; i<=nGroups; i++){
            int numberOfHikers = Integer.parseInt(scan.nextLine());
            if(numberOfHikers<=5){
                musala+=numberOfHikers;
                totalHikers+=numberOfHikers;
            } else if (numberOfHikers>=6 && numberOfHikers<=12) {
                monblan+=numberOfHikers;
                totalHikers+=numberOfHikers;
            }else if (numberOfHikers>=13 && numberOfHikers<=25) {
                kilimanjaro+=numberOfHikers;
                totalHikers+=numberOfHikers;
            }else if (numberOfHikers>=26 && numberOfHikers<=40) {
                k2+=numberOfHikers;
                totalHikers+=numberOfHikers;
            }else if (numberOfHikers>=41) {
                everest+=numberOfHikers;
                totalHikers+=numberOfHikers;
            }
        }


        String percent="%";

        System.out.printf("%.2f%s \n",musala/totalHikers*100,percent);
        System.out.printf("%.2f%s \n",monblan/totalHikers*100,percent);
        System.out.printf("%.2f%s \n",kilimanjaro/totalHikers*100,percent);
        System.out.printf("%.2f%s \n",k2/totalHikers*100,percent);
        System.out.printf("%.2f%s \n",everest/totalHikers*100,percent);

    }
}
