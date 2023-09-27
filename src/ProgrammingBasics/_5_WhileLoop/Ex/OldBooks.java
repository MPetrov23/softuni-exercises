package ProgrammingBasics._5_WhileLoop.Ex;
import java.util.Scanner;
public class OldBooks {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);

        String book = scan.nextLine();

        int count=0;
        boolean isFound = false;

        String input = scan.nextLine();
        while(!"No More Books".equals(input)){

            if(input.equals(book)){
                isFound=true;
                System.out.printf("You checked %d books and found it.", count);
            break;
            }

            count++;
            input=scan.nextLine();

        }
        if(isFound==false){
            System.out.println("The book you search is not here!");
            System.out.printf("You checked %d books.",count);
        }

    }
}
