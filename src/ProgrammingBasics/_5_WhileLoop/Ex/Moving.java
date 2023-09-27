package ProgrammingBasics._5_WhileLoop.Ex;

import java.util.Scanner;

public class Moving {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int w = Integer.parseInt(scanner.nextLine());
        int l = Integer.parseInt(scanner.nextLine());
        int h = Integer.parseInt(scanner.nextLine());

        int freeSpace = w * l * h;
        int boxes = 0;

        String input;
        final String done = "done";

        while (!done.equalsIgnoreCase(input = scanner.nextLine())) {
            int numOfBoxes = Integer.parseInt(input);
            boxes += numOfBoxes;
            if (boxes >= freeSpace) {
                break;
            }
        }

        int result = freeSpace - boxes;

        if (result <= 0) {
            System.out.printf("No more free space! You need %d Cubic meters more.", Math.abs(result));
        } else {
            System.out.printf("%d Cubic meters left.", result);
        }
    }
}
