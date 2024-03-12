package JavaAdvanced.Advanced.SetsAndMapsAdv.Lab;

import java.util.*;

public class _7_CitiesByContinentAndCountry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int citiesCount = Integer.parseInt(sc.nextLine());

        Map<String, Map<String, List<String>>> map = new LinkedHashMap<>();

        for(int i=0; i<citiesCount; i++){
            String[] data = sc.nextLine().split("\\s+");
            String continent = data[0];
            String country = data[1];
            String city = data[2];

            map.putIfAbsent(continent,new LinkedHashMap<>());
            map.get(continent).putIfAbsent(country,new ArrayList<>());
            map.get(continent).get(country).add(city);
        }

        map.forEach((continent,nestedMap) ->{
            System.out.println(continent+":");
            nestedMap.forEach((country, cities) ->{
                System.out.println(String.format("  %s -> %s"
                        ,country,String.join(", ", cities)));
            });
        });
    }
}
