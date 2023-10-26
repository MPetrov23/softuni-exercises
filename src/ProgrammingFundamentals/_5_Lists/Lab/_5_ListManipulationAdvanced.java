package ProgrammingFundamentals._5_Lists.Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _5_ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(sc.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String command = sc.nextLine();
        while(!command.equals("end")){



            if(command.contains("Contains")) {
                String[] commandParts=command.split(" ");
                int number = Integer.parseInt(commandParts[1]);
                if (numbers.contains(number)) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No such number");
                }
            }else if(command.contains("Print even")) {
                for (int i = 0; i < numbers.size(); i++) {
                    if (numbers.get(i) % 2 == 0) {
                        System.out.print(numbers.get(i) + " ");
                    }
                }
                System.out.println();
            }else if(command.contains("Print odd")) {
                for (int i = 0; i < numbers.size(); i++) {
                    if (numbers.get(i) % 2 != 0) {
                        System.out.print(numbers.get(i) + " ");
                    }
                }
                System.out.println();
            }else if(command.contains("Get sum")){
                int sum=0;
                for (int i = 0; i < numbers.size(); i++) {
                    sum+=numbers.get(i);
                }
                System.out.println(sum);
            }else if(command.contains("Filter")){
                String[] commandParts=command.split(" ");
                String condition =commandParts[1];
                int num =Integer.parseInt(commandParts[2]);

                switch (condition){
                    case "<":
                        for(int i=0;i<numbers.size();i++){
                            if(numbers.get(i)<num){
                                System.out.print(numbers.get(i)+" ");
                            }
                        }
                        break;
                    case ">":
                        for(int i=0;i<numbers.size();i++){
                            if(numbers.get(i)>num){
                                System.out.print(numbers.get(i)+" ");
                            }
                        }
                        break;
                    case ">=":
                        for(int i=0;i<numbers.size();i++){
                            if(numbers.get(i)>=num){
                                System.out.print(numbers.get(i)+" ");
                            }
                        }
                        break;
                    case "<=":
                        for(int i=0;i<numbers.size();i++){
                            if(numbers.get(i)<=num){
                                System.out.print(numbers.get(i)+" ");
                            }
                        }
                        break;
                }
                System.out.println();
            }
            command = sc.nextLine();
        }

    }
}
