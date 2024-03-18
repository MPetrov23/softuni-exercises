package JavaAdvanced.OOP.InterfacesAndAbstraction.Ex._7_CollectionHierarchy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        AddCollection addCollection = new AddCollection();
        AddRemovableCollection addRemovableCollection = new AddRemovableCollection();
        MyListImpl myList = new MyListImpl();

        String[] input = sc.nextLine().split("\\s+");

        indexPrint(addCollection, input);
        indexPrint(addRemovableCollection, input);
        indexPrint(myList, input);

        int removeCount = Integer.parseInt(sc.nextLine());

        removedPrint(addRemovableCollection, removeCount);
        removedPrint(myList, removeCount);
    }
    private static void removedPrint(AddRemovable collection, int rotation) {
        for (int i = 0; i < rotation; i++) {
            System.out.print(collection.remove() + " ");
        }
        System.out.println();
    }
    private static void indexPrint(Addable addCollection, String[] input) {
        for (String item : input) {
            System.out.print(addCollection.add(item) + " ");
        }
        System.out.println();
    }
}
