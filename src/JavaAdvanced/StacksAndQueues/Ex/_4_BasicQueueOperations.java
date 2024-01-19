package JavaAdvanced.StacksAndQueues.Ex;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.Scanner;

public class _4_BasicQueueOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] numbers=sc.nextLine().split(" ");

        int numberToOffer=Integer.parseInt(numbers[0]);
        int numberToPoll=Integer.parseInt(numbers[1]);
        int isPresent=Integer.parseInt(numbers[2]);

        Deque<Integer> queue = new ArrayDeque<>();

        String[] num = sc.nextLine().split(" ");

        for(int i=0; i<numberToOffer;i++){
            queue.offer(Integer.valueOf(num[i]));
        }
        for(int i=0; i<numberToPoll;i++){
            queue.poll();
        }

        if(queue.isEmpty()){
            System.out.println("0");
        }else{

            if(queue.contains(isPresent)){
                System.out.println(true);
            }else{
                System.out.println(Collections.min(queue));
            }
        }
    }
}
