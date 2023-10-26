package ProgrammingFundamentals._5_Lists.Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _4_ListManipulationBasics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(sc.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String command = sc.nextLine();
        while(!command.equals("end")){
            String[] commandParts=command.split(" ");
            String currentCommand=commandParts[0];
            int number= Integer.parseInt(commandParts[1]);

            switch (currentCommand){
                case "Add":
                    numbers.add(number);
                    break;
                case "Remove":
                    numbers.remove(Integer.valueOf(number));
                    break;
                case "RemoveAt":
                    numbers.remove(number);
                    break;
                case "Insert":
                    int index= Integer.parseInt(commandParts[2]);
                    numbers.add(index,number);
                    break;
                default:
                    break;
            }
            command = sc.nextLine();
        }
        for (int num:numbers) {
            System.out.print(num + " ");
        }
    }
}
