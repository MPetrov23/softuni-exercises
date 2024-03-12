package JavaAdvanced.Advanced.StacksAndQueues.Ex;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.Scanner;

public class _3_MaximumElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numberOfCommands = Integer.parseInt(sc.nextLine());

        Deque<Integer> stack = new ArrayDeque<>();


        for(int i=0; i< numberOfCommands; i++){
            String[] command = sc.nextLine().split("\\s+");

            switch (command[0]) {
                case "1" :
                    stack.push(Integer.parseInt(command[1]));
                    break;
                case "2" :
                    stack.pop();
                    break;
                case "3" :
                    System.out.println(Collections.max(stack));
                    break;
            }
        }
    }
}
