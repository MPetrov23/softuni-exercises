package JavaAdvanced.OOP.WorkingWithAbstraction.Ex._4_TrafficLights;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] colors = sc.nextLine().split("\\s+");
        int n = Integer.parseInt(sc.nextLine());

        List<TrafficLight> trafficLights = new ArrayList<>();
        for (String color : colors) {
            TrafficLight light = new TrafficLight(Color.valueOf(color));
            trafficLights.add(light);
        }

        for (int i = 0; i < n; i++) {
            StringBuilder stringBuilder = new StringBuilder();
            for (TrafficLight trafficLight : trafficLights) {
                trafficLight.switchColor();
                stringBuilder.append(String.format("%s ",trafficLight.getColor()));
            }

            System.out.printf("%s%n", stringBuilder);
        }
    }
}
