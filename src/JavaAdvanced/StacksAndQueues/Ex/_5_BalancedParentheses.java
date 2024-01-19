package JavaAdvanced.StacksAndQueues.Ex;

import java.util.*;
import java.util.stream.Collectors;

public class _5_BalancedParentheses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> parenthesis = Arrays.stream(sc.nextLine().split(""))
                .collect(Collectors.toList());

        if(isBalanced(parenthesis)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }

    }
    private static boolean isBalanced (List<String> braces){

        Deque<String> openBraces= new ArrayDeque<>();
        String openBrace="";

        for(String brace : braces){
            switch (brace){
                case ")":
                    if(openBraces.isEmpty()){
                        return false;
                    }
                    openBrace=openBraces.pop();
                    if(!openBrace.equals("(")){
                        return false;
                    }
                    break;
                case "]":
                    if(openBraces.isEmpty()){
                        return false;
                    }
                    openBrace=openBraces.pop();
                    if(!openBrace.equals("[")){
                        break;
                    }
                    break;
                case "}":
                    if(openBraces.isEmpty()){
                        return false;
                    }
                    openBrace=openBraces.pop();
                    if(!openBrace.equals("{")){
                        break;
                    }
                    break;
                default:
                    openBraces.push(brace);
                    break;
            }


        }

    return openBraces.isEmpty();
    }
}
