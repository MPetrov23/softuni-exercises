package JavaAdvanced.StacksAndQueues.Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class _1_BrowserHistory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayDeque<String> url = new ArrayDeque<>();

        String input = sc.nextLine();

        while(!"Home".equals(input)){

            if("back".equals(input)){
                if(url.size()<=1){
                    System.out.println("no previous URLs");
                }else{
                    url.pop();
                    System.out.println(url.peek());

                }
            }else{
                url.push(input);
                System.out.println(url.peek());

            }

            input=sc.nextLine();
        }
    }
}
