package ProgrammingFundamentals._2_.MoreExercise;

import java.util.Scanner;

public class _6_BalancedBrackets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int lines = Integer.parseInt(sc.nextLine());
        int bracket=0;

        for(int i = 0; i<lines; i++){
            String input = sc.nextLine();

            if(input.equals("(")){
                bracket++;
            }else if(input.equals(")")){
                bracket--;
            }

            if(bracket>1 || bracket<0){
                break;
            }
        }

        if(bracket==0){
            System.out.println("BALANCED");
        }else {
            System.out.println("UNBALANCED");

        }
    }
}
