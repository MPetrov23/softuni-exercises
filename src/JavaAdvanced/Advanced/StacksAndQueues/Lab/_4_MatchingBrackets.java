package JavaAdvanced.Advanced.StacksAndQueues.Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class _4_MatchingBrackets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayDeque<Integer> stack = new ArrayDeque<>();
        String expression = sc.nextLine();
        char[] chars =expression.toCharArray();

        for(int i=0;i< chars.length; i++){
            char ch=chars[i];
            if(ch == '('){
                stack.push(i);
            }else if(ch == ')'){
                int startIndex=stack.pop();
                String content = expression.substring(startIndex,i+1);
                System.out.println(content);
            }
        }
    }
}
