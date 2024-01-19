package JavaAdvanced.StacksAndQueues.Ex;

import java.util.ArrayDeque;
import java.util.Scanner;

public class _7_SimpleTextEditor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayDeque<String> memoryStack = new ArrayDeque<>();
        StringBuilder text = new StringBuilder();

        int commandsCount = Integer.parseInt(sc.nextLine());

        for(int i=0; i<commandsCount; i++){
           String input=sc.nextLine();

            String command = input.split(" ")[0];
            String argument = "";

            switch (command){
                case "1":
                    argument=input.split(" ")[1];
                    memoryStack.push(String.valueOf(text));
                    text.append(argument);
                    break;
                case "2":
                    argument=input.split(" ")[1];
                    memoryStack.push(text.toString());
                    int length = text.length();
                    int remove = Integer.parseInt(argument);
                        text.delete(length-remove, length);
                    break;
                case "3":
                    argument=input.split(" ")[1];
                    int index= Integer.parseInt(argument)-1;
                    System.out.println(text.charAt(index));
                    break;
                case "4":
                    text.delete(0,text.length());
                    text.append(memoryStack.pop());
                    break;
            }
        }
    }
}
