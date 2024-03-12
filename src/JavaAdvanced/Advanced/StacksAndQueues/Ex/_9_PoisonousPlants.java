package JavaAdvanced.Advanced.StacksAndQueues.Ex;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _9_PoisonousPlants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        List<Integer> pesticides = Arrays.stream(sc.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        System.out.println(calculateDays(n, pesticides));
    }

    private static int calculateDays(int n, List<Integer> pesticides) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        int days=0;

        for(int i = 0 ; i < n; i ++){

            for(int j= pesticides.size()-1;j>=0;j--) {
                if(j>0){
                    if (pesticides.get(j) > pesticides.get(j - 1)) {
                       stack.offer(pesticides.get(j));
                    }
                 }
            }

            if(stack.isEmpty()){
                break;
            }else{
                days++;
                while(!stack.isEmpty()){
                    pesticides.remove(stack.poll());
                }
            }
        }
            return days;
    }
}

