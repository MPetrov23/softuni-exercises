package ProgrammingFundamentals._6_ObjectsAndClasses.Exercise;

import java.util.Scanner;

public class _1_AdvertisementMessage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] phrases = {"Excellent product.","Such a great product.","I always use that product.",
                "Best product of its category.", "Exceptional product.", "I can’t live without this product."};
        String[] events = {"Now I feel good.", "I have succeeded with this product.",
                "Makes miracles. I am happy of the results!", "I cannot believe but now I feel awesome.",
                "Try it yourself, I am very satisfied.", "I feel great!"};
        String[] authors = {"Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva"};
        String[] cities ={"Burgas","Sofia","Plovdiv"};

        int rows= Integer.parseInt(sc.nextLine());

        for(int i=0;i<rows;i++){
            String message="";
            message+=phrases[randomNumber(phrases.length)]+" ";
            message+=events[randomNumber(events.length)]+" ";
            message+=authors[randomNumber(authors.length)]+ " - ";
            message+=cities[randomNumber(cities.length)];
            System.out.println(message);
        }
    }

    private static int randomNumber(int max){
        int randomNum = (int)Math.floor(Math.random() * (max - 1 + 1) + 1);
        return randomNum-1;
    }
}
