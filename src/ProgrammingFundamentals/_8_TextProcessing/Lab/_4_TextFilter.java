package ProgrammingFundamentals._8_TextProcessing.Lab;

import java.util.Scanner;

public class _4_TextFilter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] banned=sc.nextLine().split(", ");
        String text=sc.nextLine();

        for(int i=0; i<banned.length; i++){
            String ban=banned[i];
            String replacement="";
            for(int j=0;j<ban.length();j++){
                replacement+="*";
            }
            while(text.contains(ban)){
                text = text.replaceAll(ban,replacement );
            }
        }

        System.out.print(text);
    }
}
