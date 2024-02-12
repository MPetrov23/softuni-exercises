package JavaAdvanced.SetsAndMapsAdv.Lab;

import java.util.*;
import java.util.stream.Collectors;

public class _3_VoinaNumberGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Set<Integer> firstPlayerDeck = addToDeck(sc);
        Set<Integer> secondPlayerDeck = addToDeck(sc);

        for (int i = 0; i < 50; i++) {
            if (firstPlayerDeck.isEmpty() || secondPlayerDeck.isEmpty()) {
                break;
            }

            Iterator<Integer> firstPlayer = firstPlayerDeck.iterator();
            int firstPlayerCard = firstPlayer.next();
            firstPlayer.remove();

            Iterator<Integer> secondPlayer = secondPlayerDeck.iterator();
            int secondPlayerCard = secondPlayer.next();
            secondPlayer.remove();

            if (firstPlayerCard > secondPlayerCard) {
                firstPlayerDeck.add(firstPlayerCard);
                firstPlayerDeck.add(secondPlayerCard);
            } else if (secondPlayerCard > firstPlayerCard) {
                secondPlayerDeck.add(firstPlayerCard);
                secondPlayerDeck.add(secondPlayerCard);
            }
        }

        if (firstPlayerDeck.size() > secondPlayerDeck.size()) {
            System.out.printf("First player win!%n");
        } else if (firstPlayerDeck.size() < secondPlayerDeck.size()) {
            System.out.printf("Second player win!%n");
        } else {
            System.out.printf("Draw!%n");
        }
    }
    public static Set<Integer> addToDeck(Scanner sc){
        Set<Integer> deck = Arrays.stream(sc.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(LinkedHashSet::new));
        return deck;
    }
}
