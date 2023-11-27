package ProgrammingFundamentals._4_Methods.MoreExercise;

import java.util.Scanner;

public class _1_DataTypes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String type = sc.nextLine();
        if(type.equals("int")){
            int variable=Integer.parseInt(sc.nextLine());
            System.out.println(edit(variable));
        } else if (type.equals("real")) {
            double variable = Double.parseDouble(sc.nextLine());
            System.out.printf("%.2f",edit(variable));
        } else if (type.equals("string")) {
            String variable = sc.nextLine();
            System.out.println(edit(variable));
        }

    }
    private static int edit(int var){
        return var*2;
    }
    private static double edit(double var){
        return var*1.5;
    }
    private static String edit(String var){
        return "$"+var+"$";
    }
}
