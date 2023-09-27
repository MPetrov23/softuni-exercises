package ProgrammingBasics._7_Exam;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());
        int a = input%10;
        int b = (input%100)/10;
        int c = input/100;


      for(int x=1;x<=a;x++){
          for(int y=1;y<=b;y++){
              for (int z=1; z<=c;z++){
                  System.out.printf("%d * %d * %d = %d;%n",x,y,z,x*y*z);
              }
          }
      }
    }
}
