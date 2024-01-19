package JavaAdvanced.StacksAndQueues.Ex;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.Scanner;

public class _2_BasicStackOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] numbers=sc.nextLine().split(" ");

        int numberToPush=Integer.parseInt(numbers[0]);
        int numberToPop=Integer.parseInt(numbers[1]);
        int isPresent=Integer.parseInt(numbers[2]);

        Deque<Integer> stack = new ArrayDeque<>();

        String[] num = sc.nextLine().split(" ");

        for(int i=0; i<numberToPush;i++){
            stack.push(Integer.valueOf(num[i]));
        }
        for(int i=0; i<numberToPop;i++){
            stack.pop();
        }

        if(stack.isEmpty()){
            System.out.println("0");
        }else{

            if(stack.contains(isPresent)){
                System.out.println(true);
            }else{
                System.out.println(Collections.min(stack));
            }
        }
    }

}
