package ProgrammingFundamentals._5_Lists.MoreExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _5_DrumSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double savings = Double.parseDouble(sc.nextLine());
        List<Integer> drums = Arrays.stream(sc.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List <Integer> prices = new ArrayList<>();
        for(int i=0;i<drums.size();i++){
            int drum=drums.get(i);
            prices.add(drum*3);
        }

        String input=sc.nextLine();
        while(!input.equals("Hit it again, Gabsy!")){
            int drumPower = Integer.parseInt(input);

            for(int i=0;i<drums.size();i++){
                drums.set(i,drums.get(i)-drumPower);

                if(drums.get(i)<=0){
                    if(savings>=prices.get(i)){
                        drums.set(i,prices.get(i)/3);
                        savings-=prices.get(i);
                    }else{
                        drums.remove(i);
                        prices.remove(i);
                        i--;
                    }
                }
            }
            input=sc.nextLine();
        }

        for(int drum : drums){
            System.out.print(drum+" ");
        }
        System.out.printf("\nGabsy has %.2flv.",savings);
    }
}
