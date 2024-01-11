package JavaAdvanced.StacksAndQueues.Lab;

import java.util.PriorityQueue;
import java.util.Scanner;

public class _7_MathPotato {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PriorityQueue<String> queue = new PriorityQueue<>();

        String[] children = sc.nextLine().split(" ");
        int count = Integer.parseInt(sc.nextLine());

        for(String child : children){
            queue.offer(child);
        }

        int cycle=1;
        while(queue.size()>1){
            for(int i=1;i<count;i++) {
                queue.offer((queue.poll()));
            }
            if(isPrime(cycle)){
                System.out.println("Prime " + queue.peek());
            }
            else {
                System.out.println("Removed " + queue.poll());
            }
            cycle++;
        }
        System.out.println("Last is "+queue.poll());
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
