package JavaAdvanced.SetsAndMapsAdv.Ex;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class _3_PeriodicTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int lines  = Integer.parseInt(sc.nextLine());

        Set<String> elements = new TreeSet<>();

        for(int i=0; i<lines; i++){
            String[] compound = sc.nextLine().split("\\s+");
            for(String c : compound){
                elements.add(c);
            }
        }

        for(String element : elements){
            System.out.print(element+" ");
        }
    }
}
