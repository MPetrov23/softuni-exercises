package ProgrammingFundamentals._2_.Exercise;

import java.util.Scanner;

public class _08_BeerKegs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputs = Integer.parseInt(sc.nextLine());
        String biggestKeg="";
        double biggestKegVolume = 0;

        for(int i =0; i<inputs; i++){
            String kegName=sc.nextLine();
            double kegRadius=Double.parseDouble(sc.nextLine());
            double kegHeight=Double.parseDouble(sc.nextLine());
            double kegVolume=Math.PI*Math.pow(kegRadius,2)*kegHeight;
            if(kegVolume>biggestKegVolume){
                biggestKegVolume=kegVolume;
                biggestKeg=biggestKeg.replace(biggestKeg,kegName);
            }
        }
        System.out.println(biggestKeg);
    }
}
