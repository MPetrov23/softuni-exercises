package ProgrammingFundamentals._8_TextProcessing.Lab;

import java.util.Scanner;

public class _3_Substring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String key=sc.nextLine();
        String word=sc.nextLine();

        while(word.contains(key)) {
            word = word.replaceAll(key, "");
        }

        System.out.print(word);
    }
}
