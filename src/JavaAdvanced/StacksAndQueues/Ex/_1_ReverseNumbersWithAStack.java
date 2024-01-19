package JavaAdvanced.StacksAndQueues.Ex;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class _1_ReverseNumbersWithAStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Deque<Integer> stack = new ArrayDeque<>();

        String[] numbers = sc.nextLine().split(" ");
        for(String num: numbers){
            stack.push(Integer.parseInt(num));
        }

        while(stack.size()>0){
            System.out.print(stack.pop()+" ");
        }
    }
}
