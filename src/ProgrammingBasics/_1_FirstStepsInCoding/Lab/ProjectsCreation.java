package ProgrammingBasics._1_FirstStepsInCoding.Lab;

import java.util.Scanner;

public class ProjectsCreation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int projects = Integer.parseInt(scanner.nextLine());
        int hours = projects*3;
        System.out.print("The architect " + name + " will need " + hours + " hours to complete " + projects + " project/s.");

    }
}
