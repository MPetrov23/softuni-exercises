package ProgrammingFundamentals._5_Lists.MoreExercise;

import java.util.*;
import java.util.stream.Collectors;

public class _1_Messaging {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> indexes = Arrays.stream(sc.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<String> message = stringToListOfString(sc.nextLine());
        String output = "";

        for(int i =0; i< indexes.size(); i ++ ){
            int index= modifyIndex(indexes.get(i),message.size());
            output+=message.get(index);
            message.remove(index);
        }

        System.out.println(output);
        }

    private static List<String> stringToListOfString(String inputString) {
        List<String> stringList = new ArrayList<>();

        for (int i = 0; i < inputString.length(); i++) {
            stringList.add(String.valueOf(inputString.charAt(i)));
        }

        return stringList;
    }

    private static int modifyIndex(int index, int size){
        int newIndex=0;

        while (index > 0) {
            int digit = index % 10;
            newIndex += digit;
            index /= 10;
        }

        while(newIndex>size){
            newIndex-=size;
        }
        return newIndex;
    }
}
