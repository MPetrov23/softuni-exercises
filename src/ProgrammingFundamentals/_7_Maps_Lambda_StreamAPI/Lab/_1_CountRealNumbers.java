package ProgrammingFundamentals._7_Maps_Lambda_StreamAPI.Lab;

import java.text.DecimalFormat;
import java.util.*;
import java.util.stream.Collectors;

public class _1_CountRealNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Double> numbers = Arrays.stream(sc.nextLine().split(" "))
                .map(Double::parseDouble)
                .collect(Collectors.toList());
        TreeMap<Double, Integer> count = new TreeMap<>();

        for(double num:numbers){
            if(!count.containsKey(num)){
                count.put(num,0);
            }
            count.put(num, count.get(num)+1);
        }

        for(Map.Entry<Double, Integer> entry : count.entrySet()){
            DecimalFormat decimalFormat = new DecimalFormat("#.####");
            System.out.printf("%s -> %d\n",decimalFormat.format(entry.getKey()),entry.getValue());

        }
    }
}
