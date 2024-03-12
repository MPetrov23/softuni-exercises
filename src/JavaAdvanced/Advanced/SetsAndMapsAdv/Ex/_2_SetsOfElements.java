package JavaAdvanced.Advanced.SetsAndMapsAdv.Ex;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class _2_SetsOfElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] sizes = sc.nextLine().split("\\s+");
        int sizeOne = Integer.parseInt(sizes[0]);
        int sizeTwo = Integer.parseInt(sizes[1]);

        Set <Integer> setOne = new LinkedHashSet<>();
        Set <Integer> setTwo = new LinkedHashSet<>();


        for(int i=0; i<sizeOne; i++){
            int num = Integer.parseInt(sc.nextLine());
            setOne.add(num);
        }
        for(int i=0; i<sizeTwo; i++){
            int num = Integer.parseInt(sc.nextLine());

                setTwo.add(num);

        }

        for(int numOne : setOne){
            for(int numTwo : setTwo){
                if(numOne == numTwo){
                    System.out.print(numOne+" ");
                }
            }
        }

    }

}
