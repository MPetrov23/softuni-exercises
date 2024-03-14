package JavaAdvanced.OOP.Encapsulation.Ex._3_ShoppingSpree;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Person> personList = new ArrayList<>();
        List<Product> productList = new ArrayList<>();
        String[] peoples = sc.nextLine().split(";");
        String[] products = sc.nextLine().split(";");

        for (String people : peoples) {
            String[] peopleInfo = people.split("=");
            Person person = new Person(peopleInfo[0], Double.parseDouble(peopleInfo[1]));
            personList.add(person);
        }

        for (String product : products) {
            String[] productInfo = product.split("=");
            Product currentProduct = new Product(productInfo[0], Double.parseDouble(productInfo[1]));
            productList.add(currentProduct);
        }

        String command = sc.nextLine();
        while (!command.equals("END")) {
            String[] commandParts = command.split("\\s+");
            for (Person person : personList) {
                if (person.getName().equals(commandParts[0])) {
                    for (Product product : productList) {
                        if (product.getName().equals(commandParts[1])) {
                            person.buyProduct(product);
                        }
                    }
                }
            }
            command = sc.nextLine();
        }

        for (Person person : personList) {
            person.print(person);
        }
    }
}
