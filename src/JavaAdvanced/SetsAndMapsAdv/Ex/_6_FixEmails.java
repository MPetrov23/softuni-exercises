package JavaAdvanced.SetsAndMapsAdv.Ex;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class _6_FixEmails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String,String> emails = new LinkedHashMap<>();

        String input=sc.nextLine();
        while(!"stop".equals(input)){
            String email = sc.nextLine();

            if(!email.contains("uk") && !email.contains("us") && !email.contains( "com")){
                emails.putIfAbsent(input,email);
            }

            input=sc.nextLine();
        }

        for(String name : emails.keySet()){
            System.out.println(name+ " -> " + emails.get(name));
        }
    }
}
