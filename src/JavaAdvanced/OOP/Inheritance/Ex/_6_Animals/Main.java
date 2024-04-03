package JavaAdvanced.OOP.Inheritance.Ex._6_Animals;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String command = sc.nextLine();

        while (!"Beast!".equals(command)) {
            try {
                String[] info = sc.nextLine().split("\\s+");
                String name = info[0];
                String age = info[1];
                String gender = info[2];

                switch (command) {
                    case "Dog" :
                        Dog dog = new Dog(name, Integer.parseInt(age), gender);
                        System.out.printf("%s\n", dog);
                    break;
                    case "Frog" :
                        Frog frog = new Frog(name, Integer.parseInt(age), gender);
                        System.out.printf("%s\n", frog);
                    break;
                    case "Cat":
                        Cat cat = new Cat(name, Integer.parseInt(age), gender);
                        System.out.printf("%s\n", cat);
                    break;
                    case "Kitten" :
                        Kitten kitten = new Kitten(name, Integer.parseInt(age));
                        System.out.printf("%s\n", kitten);
                    break;
                    case "Tomcat" :
                        Tomcat tomcat = new Tomcat(name, Integer.parseInt(age));
                        System.out.printf("%s\n", tomcat);
                    break;
                }

            } catch (IllegalArgumentException e) {
                System.out.printf("%s\n", e.getMessage());
            }

            command = sc.nextLine();
        }

    }
}
