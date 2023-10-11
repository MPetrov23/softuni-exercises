package ProgrammingFundamentals._3_Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class _10_TheLift {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int waitingPeople = Integer.parseInt(sc.nextLine());
        int[] wagons = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();
        boolean isFull=true;

        for(int i=0; i<wagons.length; i++){
            int space=4-wagons[i];

            if(space>0){
                if(space>waitingPeople){
                    wagons[i]+=waitingPeople;
                    waitingPeople=0;
                    isFull=false;

                }else {
                    wagons[i]=4;
                    waitingPeople-=space;
                }
            }
        }


        if(waitingPeople>0){
            System.out.printf("There isn't enough space! %d people in a queue!%n", waitingPeople);
        } else if (!isFull) {
            System.out.println("The lift has empty spots!");
        }

        for(int wagon : wagons){
            System.out.print(wagon + " ");
        }
    }
}
