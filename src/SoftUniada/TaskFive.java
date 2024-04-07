package SoftUniada;

import java.util.Arrays;
import java.util.Scanner;

public class TaskFive {
    static final int MAX = 1000001;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = readIntegerArray(sc);
        int progressions = countProgressions(array);
        System.out.println(progressions);
    }

    static int countProgressions(int array[]) {
        int n = array.length;
        int minarr = Integer.MAX_VALUE;
        int maxarr = Integer.MIN_VALUE;


        for (int i = 0; i < n; i++) {
            minarr = Math.min(minarr, array[i]);
            maxarr = Math.max(maxarr, array[i]);
        }

        int dp[] = new int[n];
        int sum[] = new int[MAX];
        int count = n + 1;

        for (int i = (minarr - maxarr); i <= (maxarr - minarr); i++) {
            Arrays.fill(sum, 0);

            for (int j = 0; j < n; j++) {
                dp[j] = 1;
                if (array[j] - i >= 1 &&
                        array[j] - i <= 1000000)
                    dp[j] += sum[array[j] - i];

                count += dp[j] - 1;
                sum[array[j]] += dp[j];
            }
        }
        return count;
    }

    public static int[] readIntegerArray(Scanner sc){
        return Arrays.stream(sc.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
