package ProgrammingFundamentals._4_Methods.MoreExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class _6_ArrayManipulator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(e ->Integer.parseInt(e))
                .toArray();
        String command= sc.nextLine();

        while(!command.equals("end")){
            String[] commandParts=command.split(" ");
            String manipulation=commandParts[0];
            switch (manipulation) {
                case "exchange":
                    array = exchange(Integer.parseInt(commandParts[1]),array);
                    break;
                case "max":
                    String maxType=commandParts[1];
                    max(maxType,array);
                    break;
                case "min":
                    String minType=commandParts[1];
                    min(minType,array);
                    break;
                case "first":
                    int firstCount=Integer.parseInt(commandParts[1]);
                    String firstType=commandParts[2];
                    first(firstCount,firstType,array);
                    break;
                case "last":
                    int lastCount=Integer.parseInt(commandParts[1]);
                    String lastType=commandParts[2];
                    last(lastCount,lastType,array);
                    break;
            }
            command=sc.nextLine();
        }
        System.out.println(Arrays.toString(array));
    }
    private static int[] exchange(int index, int[] array){
        if (index < 0 || index >= array.length) {
            System.out.println("Invalid index");
            return array;
        }

        int[] firstSubarray = Arrays.copyOfRange(array, 0, index + 1);
        int[] secondSubarray = Arrays.copyOfRange(array, index + 1, array.length);

        int[] resultArray = new int[array.length];
        System.arraycopy(secondSubarray, 0, resultArray, 0, secondSubarray.length);
        System.arraycopy(firstSubarray, 0, resultArray, secondSubarray.length, firstSubarray.length);

        return resultArray;
    }
    private static void max(String evenOrOdd, int[] array){
        int maxIndex = -1;
        int maxElement = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            int currentElement = array[i];

            if ((evenOrOdd.equals("even") && currentElement % 2 == 0) ||
                    (evenOrOdd.equals("odd") && currentElement % 2 != 0)) {
                if (currentElement >= maxElement) {
                    maxElement = currentElement;
                    maxIndex = i;
                }
            }
        }

        if (maxIndex == -1) {
            System.out.println("No matches");
        } else {
            System.out.println(maxIndex);
        }
    }
    private static void min(String evenOrOdd, int[] array){
        int minIndex = -1;
        int minElement = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            int currentElement = array[i];

            if ((evenOrOdd.equals("even") && currentElement % 2 == 0) ||
                    (evenOrOdd.equals("odd") && currentElement % 2 != 0)) {
                if (currentElement <= minElement) {
                    minElement = currentElement;
                    minIndex = i;
                }
            }
        }

        if (minIndex == -1) {
            System.out.println("No matches");
        } else {
            System.out.println(minIndex);
        }
    }
    private static void first(int count,String evenOrOdd, int[] array){
        if (count < 0 || count > array.length) {
            System.out.println("Invalid count");
            return;
        }

        System.out.print("[");
        boolean firstElementPrinted = false;

        for (int i = 0; i < array.length; i++) {
            int currentElement = array[i];

            if ((evenOrOdd.equals("even") && currentElement % 2 == 0) ||
                    (evenOrOdd.equals("odd") && currentElement % 2 != 0)) {
                if (firstElementPrinted) {
                    System.out.print(", ");
                }

                System.out.print(currentElement);
                firstElementPrinted = true;

                count--;
                if (count == 0) {
                    break;
                }
            }
        }

        System.out.println("]");
    }
    private static void last(int count, String evenOrOdd, int[] array){
        if (count < 0 || count > array.length) {
            System.out.println("Invalid count");
            return;
        }

        System.out.print("[");
        boolean lastElementPrinted = false;

        for (int i = array.length - 1; i >= 0; i--) {
            int currentElement = array[i];

            if ((evenOrOdd.equals("even") && currentElement % 2 == 0) ||
                    (evenOrOdd.equals("odd") && currentElement % 2 != 0)) {
                if (lastElementPrinted) {
                    System.out.print(", ");
                }

                System.out.print(currentElement);
                lastElementPrinted = true;

                count--;
                if (count == 0) {
                    break;
                }
            }
        }
        System.out.println("]");

    }
}
