package ProgrammingFundamentals._3_Arrays.MoreExercise;

import java.util.Arrays;
import java.util.Scanner;

public class _4_LongestIncreasingSubsequenceLis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array= Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(e->Integer.parseInt(e))
                .toArray();
        int n =array.length;
        int[] lisLength = new int[n];
        int[] previousIndex = new int[n];

        for (int i = 0; i < n; i++) {
            lisLength[i] = 1;
            previousIndex[i] = -1;
            for (int j = 0; j < i; j++) {
                if (array[i] > array[j] && lisLength[i] < lisLength[j] + 1) {
                    lisLength[i] = lisLength[j] + 1;
                    previousIndex[i] = j;
                }
            }
        }

        int maxLength = 0;
        int endIndex = 0;

        for (int i = 0; i < n; i++) {
            if (lisLength[i] > maxLength) {
                maxLength = lisLength[i];
                endIndex = i;
            }
        }

        int[] lis = new int[maxLength];
        int currentIndex = endIndex;

        for (int i = maxLength - 1; i >= 0; i--) {
            lis[i] = array[currentIndex];
            currentIndex = previousIndex[currentIndex];
        }


        for (int num : lis) {
            System.out.print(num + " ");
        }
    }
}
