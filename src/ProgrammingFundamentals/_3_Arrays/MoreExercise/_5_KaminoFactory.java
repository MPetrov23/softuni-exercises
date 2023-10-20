package ProgrammingFundamentals._3_Arrays.MoreExercise;


import java.util.Arrays;
import java.util.Scanner;

public class _5_KaminoFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        int bestSequenceIndex = 0;
        int bestSequenceSum = 0;
        int bestSequenceOnesCount = 0;
        int bestSequenceIndexInInput = 0;
        int currentSequenceIndex = 1;
        String bestSequence = "";

        while (!input.equals("Clone them!")) {
            String[] sequence = input.split("!");

            int maxOnesCount = 0;
            int currentOnesCount = 0;
            int currentSum = 0;
            int currentIndex = 0;

            for (int i = 0; i < sequence.length; i++) {
                if (sequence[i].equals("1")) {
                    currentOnesCount++;
                    currentSum++;
                } else {
                    currentOnesCount = 0;
                }

                if (currentOnesCount > maxOnesCount) {
                    maxOnesCount = currentOnesCount;
                    currentIndex = i - maxOnesCount +1;
                } else if (currentOnesCount == maxOnesCount && currentIndex > i - maxOnesCount + 1) {
                    currentIndex = i - maxOnesCount +1 ;
                }
            }

            if (maxOnesCount > bestSequenceOnesCount
                    || (maxOnesCount == bestSequenceOnesCount && currentIndex < bestSequenceIndexInInput)
                    || (maxOnesCount == bestSequenceOnesCount && currentIndex == bestSequenceIndexInInput && currentSum > bestSequenceSum)) {
                bestSequence = String.join(" ", sequence);
                bestSequenceSum = currentSum;
                bestSequenceOnesCount = maxOnesCount;
                bestSequenceIndex = currentSequenceIndex;
                bestSequenceIndexInInput = currentIndex;
            }

            input = scanner.nextLine();
            currentSequenceIndex++;
        }

        System.out.println("Best DNA sample " + bestSequenceIndex + " with sum: " + bestSequenceSum + ".");
        System.out.println(bestSequence);
    }
}







