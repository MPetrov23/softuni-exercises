package ProgrammingFundamentals._3_Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class _9_ArrayModifier {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);

        int[] array = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        String command=sc.nextLine();
        while(!command.equals("end")){
            if(command.equals("decrease")){
                    for(int i=0; i <array.length; i++){
                        array[i]=array[i]-1;
                    }
            } else if (command.contains("swap")) {
                int index1=Integer.parseInt(command.split(" ")[1]);
                int index2=Integer.parseInt(command.split(" ")[2]);

                array[index1]=array[index1]+array[index2];
                array[index2]=array[index1]-array[index2];
                array[index1]=array[index1]-array[index2];

            } else if (command.contains("multiply")) {
                int index1=Integer.parseInt(command.split(" ")[1]);
                int index2=Integer.parseInt(command.split(" ")[2]);

                array[index1]=array[index1]*array[index2];
            }
            command = sc.nextLine();
        }
        System.out.println(Arrays.toString(array)
                .replace("[", "")
                .replace("]", "")
        );

    }
}
