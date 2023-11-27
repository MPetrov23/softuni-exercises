package ProgrammingFundamentals._4_Methods.Exercise;

import java.util.Scanner;

public class _3_CharactersInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char start = sc.nextLine().charAt(0);
        char end = sc.nextLine().charAt(0);

        System.out.println(betweenTwo(start,end));
    }
    private static String betweenTwo(char a,char b){
        String result="";
        int start =(int) a ;
        int end = (int) b ;
        if(start>end){
            start=start+end;
            end=start-end;
            start=start-end;
        }
            for(int i=start+1;i<end;i++){
                char myChar=(char) i;
                result+= myChar+" ";
            }
        return result;
    }
}
