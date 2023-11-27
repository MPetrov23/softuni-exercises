package ProgrammingFundamentals._4_Methods.Lab;

import java.util.Scanner;

public class _9_GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        if(input.equals("int")){
            int a=Integer.parseInt(sc.nextLine());
            int b=Integer.parseInt(sc.nextLine());
           System.out.println( getMax(a,b));
        } else if (input.equals("string")) {
            String a= sc.nextLine();
            String b= sc.nextLine();
            System.out.println(getMax(a,b));
        } else if (input.equals("char")) {
            char a= sc.nextLine().charAt(0);
            char b= sc.nextLine().charAt(0);
            System.out.println( getMax(a,b));

        }

    }
    private static int getMax(int a,int b){
        if(a>b){
            return a;
        }
        return b;
    }
    private static String getMax(String a,String b){
        if(a.compareTo(b)>=0){
            return a;
        }
        return b;
    }
    private static char getMax(char a,char b){
        if(a>b){
            return a;
        }
        return b;
    }
}
