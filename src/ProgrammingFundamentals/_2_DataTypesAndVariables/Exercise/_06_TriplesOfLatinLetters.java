package ProgrammingFundamentals._2_DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class _06_TriplesOfLatinLetters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());

        for(int i = 0;i<num;i++){
            char firstChar=(char)('a'+i);
            for(int j = 0;j<num;j++){
                char secondChar=(char)('a'+j);
                for(int k = 0;k<num;k++) {
                    char thirdChar=(char)('a'+k);
                    System.out.printf("%c%c%c\n",firstChar,secondChar,thirdChar);
                }
            }
        }
    }
}
