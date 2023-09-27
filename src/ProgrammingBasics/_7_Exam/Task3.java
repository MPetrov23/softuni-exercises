package ProgrammingBasics._7_Exam;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        String room=scanner.nextLine();
        String grade=scanner.nextLine();

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
