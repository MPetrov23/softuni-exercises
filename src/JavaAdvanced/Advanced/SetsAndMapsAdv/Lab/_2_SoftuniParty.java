package JavaAdvanced.Advanced.SetsAndMapsAdv.Lab;


import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class _2_SoftuniParty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Set<String> guestsRegular = new TreeSet<>();
        Set<String> guestsVIP = new TreeSet<>();

        String input=sc.nextLine();

        while(!"PARTY".equals(input)){
            if(isInteger(input)){
                guestsVIP.add(input);
            }else{
                guestsRegular.add(input);
            }
            input= sc.nextLine();
        }

        input=sc.nextLine();
        while(!"END".equals(input)){
                guestsVIP.remove(input);
                guestsRegular.remove(input);

            input= sc.nextLine();
        }

        System.out.println(guestsVIP.size()+ guestsRegular.size());
        for (String guest : guestsVIP) {
            System.out.println(guest);
        }   for (String guest : guestsRegular) {
            System.out.println(guest);
        }

    }

    public static boolean isInteger(String guest){
        char ch = guest.charAt(0);
        return Character.isDigit(ch);
    }
}
