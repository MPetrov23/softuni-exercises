package JavaAdvanced.SetsAndMapsAdv.Lab;

import java.util.*;

public class _6_ProductShop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Map<String,Double>> stores = new TreeMap();

        String input=sc.nextLine();
        while (!"Revision".equals(input)){
            String[] data = input.split(",\\s+");
            String store = data[0];
            String product = data[1];
            Double price = Double.valueOf(data[2]);

            if(stores.containsKey(store)){
                    stores.get(store).put(product,price);
            }else{
                stores.put(store,new LinkedHashMap<>());
                stores.get(store).put(product,price);
            }

            input=sc.nextLine();
        }

            for(String store : stores.keySet()) {
                System.out.println(store + "->");
                Map<String,Double> currStore = stores.get(store);
                for (String key : currStore.keySet()) {
                    System.out.printf("Product: %s, Price: %.1f\n", key, currStore.get(key));
                }
            }
    }
}
