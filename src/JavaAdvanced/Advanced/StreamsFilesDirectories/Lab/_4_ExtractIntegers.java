package JavaAdvanced.Advanced.StreamsFilesDirectories.Lab;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class _4_ExtractIntegers {
    public static void main(String[] args) {
        String inputPath = "D:\\GitHub\\softuni-exercises\\src\\JavaAdvanced\\StreamsFilesDirectories\\Lab\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        String outputPath = "D:\\GitHub\\softuni-exercises\\src\\JavaAdvanced\\StreamsFilesDirectories\\Lab\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\04.ExtractIntegersOutput.txt";

        try (FileInputStream in = new FileInputStream(inputPath);
             Scanner scanner = new Scanner(in);

             FileOutputStream out = new FileOutputStream(outputPath);
             PrintWriter writer = new PrintWriter(out)
        ) {

            while (scanner.hasNext()) {
             if(scanner.hasNextInt()){
                 int num = scanner.nextInt();
                 writer.println(num);
             }
             scanner.next();
            }

        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }
}
