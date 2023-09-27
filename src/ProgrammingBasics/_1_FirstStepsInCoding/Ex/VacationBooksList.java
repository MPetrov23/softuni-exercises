package ProgrammingBasics._1_FirstStepsInCoding.Ex;

import java.util.Scanner;

public class VacationBooksList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pages = Integer.parseInt(scanner.nextLine());
        int pagesPerHour = Integer.parseInt(scanner.nextLine());
        int daysToFinish = Integer.parseInt(scanner.nextLine());

        int totalReadingTime = pages/pagesPerHour;
        int hoursPerDay = totalReadingTime/daysToFinish;

        System.out.print(hoursPerDay);
    }
}
