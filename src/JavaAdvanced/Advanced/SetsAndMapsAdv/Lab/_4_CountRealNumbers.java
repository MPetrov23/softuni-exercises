package JavaAdvanced.Advanced.SetsAndMapsAdv.Lab;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class _4_CountRealNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<Double,Integer> numbersMap = new LinkedHashMap();

        double[] numbers = Arrays.stream(sc.nextLine().split("\\s+"))
                .mapToDouble(Double::parseDouble)
                .toArray();

        for(int i=0;i<numbers.length;i++){
            double num = numbers[i];
            if(numbersMap.containsKey(num)){
                numbersMap.put(num, numbersMap.get(num)+1);
            }else{
                numbersMap.put(num,1 );
            }
        }

        for(Double key : numbersMap.keySet()){
            System.out.printf("%.1f -> %d\n",key,numbersMap.get(key));
        }
    }
}
