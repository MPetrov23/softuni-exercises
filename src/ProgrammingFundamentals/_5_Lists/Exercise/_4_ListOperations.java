package ProgrammingFundamentals._5_Lists.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _4_ListOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(sc.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String command = sc.nextLine();
        while(!command.equals("End")){
            String[] commandParts=command.split(" ");
            String currentCommand=commandParts[0];

            if(currentCommand.equals("Add")){
                    int number= Integer.parseInt(commandParts[1]);
                    numbers.add(number);
            } else if (currentCommand.equals("Insert")) {
                int number= Integer.parseInt(commandParts[1]);
                int index= Integer.parseInt(commandParts[2]);

                if (index >= 0 && index < numbers.size()) {
                    numbers.add(index,number);
                } else {
                    System.out.println("Invalid index");
                }

            }else if (currentCommand.equals("Remove")) {
                int index = Integer.parseInt(commandParts[1]);

                if (index >= 0 && index < numbers.size()) {
                    numbers.remove(index);
                } else {
                    System.out.println("Invalid index");
                }


            }else if (currentCommand.equals("Shift")) {
                String secondCommand = commandParts[1];
                if(secondCommand.equals("left")){
                    int count= Integer.parseInt(commandParts[2]);
                    for (int i = 0; i < count; i++) {
                        int firstNumber = numbers.remove(0);
                        numbers.add(firstNumber);
                    }
                } else if (secondCommand.equals("right")) {
                    int count= Integer.parseInt(commandParts[2]);
                    for (int i = 0; i < count; i++) {
                        int lastNumber = numbers.remove(numbers.size() - 1);
                        numbers.add(0, lastNumber);
                    }
                }

            }

            command = sc.nextLine();
            }
            for(int num:numbers){
                System.out.print(num+" ");
            }
        }

    }

