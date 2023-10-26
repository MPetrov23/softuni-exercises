package ProgrammingFundamentals._5_Lists.Lab;

import java.util.*;

public class _6_ListOfProducts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows = Integer.parseInt(sc.nextLine());
        List<String> shoppingList = new ArrayList<String>();

        for(int i=0;i< rows;i++){
            String product=sc.nextLine();
            shoppingList.add(i,product);
        }

        Collections.sort(shoppingList);

        for(int i=0;i< rows;i++){
            String product=shoppingList.get(i);
           System.out.printf("%d.%s\n",i+1,product);
        }
    }
}
