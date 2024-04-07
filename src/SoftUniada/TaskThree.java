package SoftUniada;

import java.util.Arrays;
import java.util.Scanner;

public class TaskThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = readIntegerArray(sc);
        int k = Integer.parseInt(sc.nextLine());
        int[]largestNumbers = findLargestNums(numbers,k);

      for(int num : largestNumbers){
          System.out.println(num);
      }
    }

    public static int[] findLargestNums(int[] arr, int k) {
        int largest[] = new int[k];

        Arrays.sort(arr);

        for (int i = 0; i < k; i++) {
            largest[i] = arr[arr.length - 1 - i];

        }

        Arrays.sort(largest);
        return largest;
    }

        public static int[] readIntegerArray (Scanner sc){
            return Arrays.stream(sc.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }
    }

