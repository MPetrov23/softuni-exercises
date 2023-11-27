package ProgrammingFundamentals._5_Lists.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _6_CardsGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> playerOne = Arrays.stream(sc.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        List<Integer> playerTwo = Arrays.stream(sc.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());


        while (!playerOne.isEmpty() && !playerTwo.isEmpty()) {
            int firstPlayerCard = playerOne.get(0);
            int secondPlayerCard = playerTwo.get(0);
            playerOne.remove(0);
            playerTwo.remove(0);

            if (firstPlayerCard > secondPlayerCard) {
                playerOne.add(firstPlayerCard);
                playerOne.add(secondPlayerCard);
            } else if (firstPlayerCard < secondPlayerCard) {
                playerTwo.add(firstPlayerCard);
                playerTwo.add(secondPlayerCard);
            }
        }


        if (playerOne.size() != 0) {
            System.out.printf("First player wins! Sum: %d", cardsSum(playerOne));
        } else {

            System.out.printf("Second player wins! Sum: %d", cardsSum(playerTwo));
        }
    }


    private static int cardsSum(List<Integer> cards) {
        int sum = 0;
        for (int card : cards) {
            sum += card;
        }
        return sum;
    }

}