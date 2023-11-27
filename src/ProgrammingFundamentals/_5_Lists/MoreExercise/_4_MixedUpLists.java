package ProgrammingFundamentals._5_Lists.MoreExercise;

import java.util.*;
import java.util.stream.Collectors;

public class _4_MixedUpLists {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List <Integer> firstNumbers = Arrays.stream(sc.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        List <Integer> secondNumbers = Arrays.stream(sc.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        List <Integer> numbers = new ArrayList<>();
        int low,high=0;

            while(firstNumbers.size()+secondNumbers.size()>2){
                numbers.add(firstNumbers.get(0));
                firstNumbers.remove(0);

                numbers.add(secondNumbers.get(secondNumbers.size()-1));
                secondNumbers.remove(secondNumbers.size()-1);
            }

            if(firstNumbers.size()==0){
                low=secondNumbers.get(0);
                high=secondNumbers.get(1);
            }else{
                low=firstNumbers.get(0);
                high=firstNumbers.get(1);
            }

            if(low>high){
                low=low+high;
                high=low-high;
                low=low-high;
            }

            List <Integer> result= new ArrayList<>();

            for(int i=0;i<numbers.size();i++){
                if(numbers.get(i)>low && numbers.get(i)<high){
                    result.add(numbers.get(i));
                }
            }

        Collections.sort(result);
            for(int num:result){
                System.out.print(num + " ");
            }
    }
}
