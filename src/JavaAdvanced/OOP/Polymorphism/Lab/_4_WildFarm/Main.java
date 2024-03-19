package JavaAdvanced.OOP.Polymorphism.Lab._4_WildFarm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Animal> animals = new ArrayList<>();

        String command = sc.nextLine();
        while (!"End".equals(command)) {
            Animal animal = createAnimal(command);

            command = sc.nextLine();
            Food food = createFood(command);
            animal.makeSound();
            animal.eat(food);
            animals.add(animal);

            command = sc.nextLine();
        }
        for (Animal animal : animals) {
            System.out.printf("%s%n",animal.toString());
        }
    }

    private static Animal createAnimal(String command) {
        String[] commandParts = command.split("\\s+");
        String type = commandParts[0];
        Animal animal = null;
        if (type.equals("Cat")) {
            animal = new Cat(commandParts[1], commandParts[0], Double.parseDouble(commandParts[2]), commandParts[3], commandParts[4]);
        } else if (type.equals("Mouse")) {
            animal = new Mouse(commandParts[1], commandParts[0], Double.parseDouble(commandParts[2]), commandParts[3]);
        } else if (type.equals("Tiger")) {
            animal = new Tiger(commandParts[1], commandParts[0], Double.parseDouble(commandParts[2]), commandParts[3]);
        }  else if (type.equals("Zebra")) {
            animal = new Zebra(commandParts[1], commandParts[0], Double.parseDouble(commandParts[2]), commandParts[3]);
        }
        return animal;
    }

    private static Food createFood(String command) {
        String[] commandParts = command.split("\\s+");
        String foodType = commandParts[0];
        Food food = null;
        if (foodType.equals("Meat")) {
            food = new Meat(Integer.parseInt(commandParts[1]));
        } else if (foodType.equals("Vegetable")) {
            food = new Vegetable(Integer.parseInt(commandParts[1]));
        }
        return food;
    }
}
