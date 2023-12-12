package ProgrammingFundamentals._7_Maps_Lambda_StreamAPI.Lab;


import java.util.*;
public class _2_WordSynonyms {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());

        LinkedHashMap<String, ArrayList<String>> words = new LinkedHashMap<>();

    for(int i=0; i<num; i++){
        String word = sc.nextLine();
        String synonym = sc.nextLine();

        words.putIfAbsent(word,new ArrayList<>());
        words.get(word).add(synonym);
    }

        for(Map.Entry<String, ArrayList<String>> entry : words.entrySet()){
            String word = entry.getKey();
            List<String> synonyms = entry.getValue();

            System.out.printf("%s - %s\n",word,String.join(", ",synonyms));
        }
    }

}
