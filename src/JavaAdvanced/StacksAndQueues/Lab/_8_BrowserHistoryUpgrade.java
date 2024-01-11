package JavaAdvanced.StacksAndQueues.Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class _8_BrowserHistoryUpgrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayDeque<String> back = new ArrayDeque<>();
        ArrayDeque<String> next = new ArrayDeque<>();

        String input = sc.nextLine();

        while(!"Home".equals(input)){

            if("back".equals(input)){
                if(back.size()<=1){
                    System.out.println("no previous URLs");
                }else{
                    next.push(back.pop());
                    System.out.println(back.peek());

                }
            }else if("forward".equals(input)){
                if(next.isEmpty()){
                    System.out.println("no next URLs");
                }else{
                    System.out.println(next.peek());
                    back.push(next.poll());
                }
            }
            else{
                back.push(input);
                System.out.println(back.peek());
                next.clear();
            }

            input=sc.nextLine();
        }
    }
}
