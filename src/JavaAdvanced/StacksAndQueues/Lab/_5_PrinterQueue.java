package JavaAdvanced.StacksAndQueues.Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class _5_PrinterQueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayDeque<String> queue = new ArrayDeque<>();

        String input = sc.nextLine();

        while(!"print".equals(input)){
            if(input.equals("cancel")){
                if(queue.isEmpty()){
                    System.out.println("Printer is on standby");
                }else{
                   System.out.printf("Canceled "+queue.pollFirst()+"\n");
                }
            }else{
                queue.offer(input);
            }
            input=sc.nextLine();
        }

        while(!queue.isEmpty()){
            System.out.println(queue.poll());
        }
    }
}
