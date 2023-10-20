package ProgrammingFundamentals._5_Lists.Lab;

import java.text.DecimalFormat;
import java.util.*;
import java.util.stream.Collectors;

public class _2_GaussTrick {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(sc.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int center = 0;
        int size=numbers.size()-1;

        List<Integer> result=new ArrayList<>();

        if(numbers.size()%2==0){
            center=numbers.size()/2;
        }else{
            center=numbers.size()/2+1;
        }

        for(int i=0; i< center; i++) {
            if(i==size){
                result.add(numbers.get(i));
            }else {
                int sum = numbers.get(i) + numbers.get(size);
                result.add(sum);
            }
            size--;
        }
        String output = joinElementsByDelimeter(result," ");
        System.out.print(output);
    }
    private static String joinElementsByDelimeter(List<Integer> items, String delimeter) {
        String output="";

        for(Integer item : items)
            output+= (new DecimalFormat("0.#").format(item)+delimeter);

        return output;
    }
}

