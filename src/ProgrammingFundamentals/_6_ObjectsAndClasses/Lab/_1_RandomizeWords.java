package ProgrammingFundamentals._6_ObjectsAndClasses.Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _1_RandomizeWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> words = Arrays.stream(sc.nextLine().split(" "))
                .collect(Collectors.toList());

        Random rand= new Random();
        int loops = words.size();

        for(int i=0; i<loops;i++){
            int index = rand.nextInt(words.size());
            String output=words.get(index);
            words.remove(index);
            System.out.println(output);
        }
    }


}
