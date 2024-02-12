package JavaAdvanced.SetsAndMapsAdv.Ex;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class _7_HandsOfCards {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Map<String, Set<Integer>>> players = new LinkedHashMap<>();

        String input = sc.nextLine();

        while (!"JOKER".equals(input)) {
            String[] parts = input.split(":\\s+");
            String player = parts[0];
            String[] playerCards = parts[1].split(",\\s+");
            for (int i = 0; i < playerCards.length; i++) {
                int cardPower = cardPower(playerCards[i]);
                String cardType = playerCards[i].substring(playerCards[i].length() - 1);
                if(players.containsKey(player)){
                   if(players.get(player).containsKey(cardType)){
                       players.get(player).get(cardType).add(cardPower);

                   }else{
                       Set<Integer> cardsType = new TreeSet<>();
                       cardsType.add(cardPower);
                       players.get(player).put(cardType,cardsType);
                   }
               }else{
                   Map<String, Set<Integer>> newPlayer = new LinkedHashMap<>();
                   Set<Integer> cardsType = new TreeSet<>();
                   cardsType.add(cardPower);
                   newPlayer.put(cardType,cardsType);
                   players.put(player,newPlayer);

               }
            }

            input = sc.nextLine();
        }

        players.entrySet().forEach(entry -> {
            System.out.printf("%s: ", entry.getKey());
            AtomicInteger totalSum = new AtomicInteger();
            entry.getValue().entrySet().forEach(entry2 -> {
                int sumForcurrentType = 0;
                if (entry2.getKey().equals("S")) {
                    int sum = 0;
                    for (Integer i : entry2.getValue()) {
                        sum += i * 4;
                    }
                    sumForcurrentType += sum;
                } else if (entry2.getKey().equals("H")) {
                    int sum = 0;
                    for (Integer i : entry2.getValue()) {
                        sum += i * 3;
                    }
                    sumForcurrentType += sum;
                } else if (entry2.getKey().equals("D")) {
                    int sum = 0;
                    for (Integer i : entry2.getValue()) {
                        sum += i * 2;
                    }
                    sumForcurrentType += sum;
                } else if (entry2.getKey().equals("C")) {
                    int sum = 0;
                    for (Integer i : entry2.getValue()) {
                        sum += i;
                    }
                    sumForcurrentType += sum;
                }
                totalSum.addAndGet(sumForcurrentType);
            });
            System.out.printf("%d%n", totalSum.get());
        });

    }
    public static int cardPower (String card){
        String cardPower=card.substring(0,card.length()-1);
        int power;

        switch (cardPower){
            case "J":
                power = 11;
                break;
            case "Q":
                power = 12;
                break;
            case "K":
                power = 13;
                break;
            case "A":
                power = 14;
                break;
            default:
                power =  Integer.parseInt(cardPower);
                break;
        }
    return power;
    }

}
