package ProgrammingFundamentals._7_Maps_Lambda_StreamAPI.Lab;

import java.util.*;
import java.util.stream.Collectors;

public class _3_OddOccurrences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> words = inputToList(sc.nextLine()," ");

        LinkedHashMap<String, Integer> count = new LinkedHashMap<>();

        for(String word: words){
            String wordLowerCase = word.toLowerCase();
            if(count.containsKey(wordLowerCase)){
                count.put(wordLowerCase, count.get(wordLowerCase)+1);
            }else{
                count.put(wordLowerCase,1);
            }
        }

        ArrayList<String> odds = new ArrayList<>();
        for(var entry: count.entrySet()){
            if(entry.getValue()%2==1){
                odds.add(entry.getKey());
            }
        }

        for(int i=0;i< odds.size(); i++){
            System.out.print(odds.get(i));
            if(i< odds.size()-1){
                System.out.print(", ");
            }
        }

    }

    private static List<String> inputToList(String input, String regex ){
        List<String> result = Arrays.stream(input.split(regex))
                .collect(Collectors.toList());
        return result;
    }
}
