package SoftUniada;

import java.util.Arrays;
import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = readIntegerArray(sc);

        int peakElement = findPeakElement(numbers);

        System.out.println(peakElement);
    }

    public static int[] readIntegerArray(Scanner sc){
        return Arrays.stream(sc.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
    public static int findPeakElement(int[] arr) {
        int peak = arr[0];

        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1] && arr[i]>peak) {
                peak = arr[i];
            }
        }

        if (arr[arr.length - 1] > arr[arr.length - 2] && arr[arr.length - 1]>peak) {
            peak = arr[arr.length - 1];
        }

        return peak;
    }
}
