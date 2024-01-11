package JavaAdvanced.StacksAndQueues.Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class _2_SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayDeque<String> stack = new ArrayDeque<>();
        String[] tokens=sc.nextLine().split("\\s");

        for(int i= tokens.length-1; i>=0; i--){
            String token = tokens[i];
            stack.push(token);
        }

        while(stack.size()>1){
            int firstNum = Integer.parseInt(stack.pop());
            String operator = stack.pop();
            int secondNum = Integer.parseInt(stack.pop());


            if("+".equals(operator)){
                stack.push(String.valueOf(firstNum+secondNum));
            }else if("-".equals(operator)){
                stack.push(String.valueOf(firstNum-secondNum));
            }

        }


        System.out.println(stack.pop());

    }
}
