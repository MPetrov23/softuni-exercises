package ProgrammingFundamentals._5_Lists.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _1_Train {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> wagons = Arrays.stream(sc.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int maxCapacity = Integer.parseInt(sc.nextLine());

        String input= sc.nextLine();

        while(!input.equals("end")){
            if(input.contains("Add")){
                String[] splitInput= input.split(" ");
                int newWagon = Integer.parseInt(splitInput[1]);
                wagons.add(newWagon);
            }else{
                int newPassengers=Integer.parseInt(input);
                for(int i=0;i<wagons.size();i++){
                    if(wagons.get(i)+newPassengers<=maxCapacity){
                        int newWagon=wagons.get(i)+newPassengers;
                        wagons.set(i,newWagon);
                        break;
                    }
                }
            }
            input=sc.nextLine();
        }

        for (int wag:wagons) {
            System.out.print(wag + " ");
        }
    }
}
