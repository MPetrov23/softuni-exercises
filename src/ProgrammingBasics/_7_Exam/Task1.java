package ProgrammingBasics._7_Exam;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int fatsPercent = Integer.parseInt(scanner.nextLine());
        int proteinsPercent = Integer.parseInt(scanner.nextLine());
        int carbsPercent = Integer.parseInt(scanner.nextLine());
        int totalCalories = Integer.parseInt(scanner.nextLine());
        int waterPercent = Integer.parseInt(scanner.nextLine());

        double fatsGrams = ((double)totalCalories*fatsPercent/100) /9;
        double proteinGrams = ((double)totalCalories*proteinsPercent/100) /4;
        double carbsGrams = ((double)totalCalories*carbsPercent/100) /4;

        double foodGrams= fatsGrams+proteinGrams+carbsGrams;

        double caloriesPerGram = totalCalories/foodGrams;

        double totalCaloriesPerGram = caloriesPerGram-(caloriesPerGram*waterPercent/100);

        System.out.printf("%.4f", totalCaloriesPerGram);


    }
}
