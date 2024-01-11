package JavaAdvanced.StacksAndQueues.Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class _6_HotPotato {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayDeque<String> queue = new ArrayDeque<>();

        String[] children = sc.nextLine().split(" ");
        int count = Integer.parseInt(sc.nextLine());

        for(String child : children){
            queue.offer(child);
        }

        while(queue.size()>1){
            for(int i=1;i<count;i++) {
            queue.offer((queue.poll()));
            }
            System.out.println("Removed "+queue.poll());
            }

       System.out.println("Last is "+queue.poll());
        }
    }

