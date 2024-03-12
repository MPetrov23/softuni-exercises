package JavaAdvanced.Advanced.SetsAndMapsAdv.Ex;


import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class _4_CountSymbols {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        Map<Character,Integer> countMap = new TreeMap<>();

        for(int i=0; i<text.length(); i++){
            char ch = text.charAt(i);
            if(countMap.containsKey(ch)){
                countMap.put(ch, countMap.get(ch)+1);
            }else{
                countMap.put(ch,1);
            }
        }


        for(char ch : countMap.keySet()){
            System.out.printf("%c: %d time/s\n",ch,countMap.get(ch));
        }    }
}
