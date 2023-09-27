package ProgrammingBasics._4_ForLoop.Ex;
import java.util.Scanner;
public class Histogram {
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);

        int n=Integer.parseInt(scan.nextLine());

        double p1=0;
        double p2=0;
        double p3=0;
        double p4=0;
        double p5=0;


        for(int i=0;i<n;i++){
            int number=Integer.parseInt(scan.nextLine());
            if(number<200){
                p1++;
            } else if (number>=200 && number<400) {
                p2++;
            } else if (number>=400 && number <600) {
                p3++;
            } else if (number>=600 && number <800) {
                p4++;
            } else if (number >= 800 && number <= 1000) {
                p5++;
            }
        }
        double percent1=p1/n*100;
        double percent2=p2/n*100;
        double percent3=p3/n*100;
        double percent4=p4/n*100;
        double percent5=p5/n*100;
        String percent="%";

        System.out.printf("%.2f%s \n",percent1,percent);
        System.out.printf("%.2f%s \n",percent2,percent);
        System.out.printf("%.2f%s \n",percent3,percent);
        System.out.printf("%.2f%s \n",percent4,percent);
        System.out.printf("%.2f%s \n",percent5,percent);



    }
}
