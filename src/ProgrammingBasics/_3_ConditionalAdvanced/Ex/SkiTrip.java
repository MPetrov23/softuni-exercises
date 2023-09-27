package ProgrammingBasics._3_ConditionalAdvanced.Ex;
import java.util.Scanner;
public class SkiTrip {
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);

        int days = Integer.parseInt(scan.nextLine());
        String room=scan.nextLine();
        String grade=scan.nextLine();

        double price=0.0;
        

       if(room.equals("room for one person")){
           price=18*(days-1);
       } else if (room.equals("apartment")) {
           price=25*(days-1);
           if(days<10){
               price=price*0.7;
           } else if (days>=10 && days<=15) {
               price=price*0.65;
           } else if (days>15) {
               price=price*0.5;
           }
       }else if(room.equals("president apartment")){
           price=35*(days-1);
           if(days<10){
               price=price*0.9;
           } else if (days>=10 && days<=15) {
               price=price*0.85;
           } else if (days>15) {
               price=price*0.8;
           }
       }

       if(grade.equals("positive")){
           price=price*1.25;
       } else if (grade.equals("negative")) {
           price=price*0.9;
       }

       System.out.printf("%.2f",price);
    }
}
