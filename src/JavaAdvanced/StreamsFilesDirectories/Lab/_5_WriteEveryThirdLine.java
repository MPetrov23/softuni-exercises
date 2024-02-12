package JavaAdvanced.StreamsFilesDirectories.Lab;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class _5_WriteEveryThirdLine {
    public static void main(String[] args) {
        String inputPath = "D:\\GitHub\\softuni-exercises\\src\\JavaAdvanced\\StreamsFilesDirectories\\Lab\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        String outputPath = "D:\\GitHub\\softuni-exercises\\src\\JavaAdvanced\\StreamsFilesDirectories\\Lab\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\05.WriteEveryThirdLineOutput.txt";

        try (FileInputStream in = new FileInputStream(inputPath);
             Scanner scanner = new Scanner(in);

             FileOutputStream out = new FileOutputStream(outputPath);
             PrintWriter writer = new PrintWriter(out)
        ) {
            int count =1;
            String line = scanner.nextLine();
            while (scanner.hasNextLine()) {
                if(count%3==0){
                   writer.println(line);
                }
                count++;
                line=scanner.nextLine();
            }

        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }
}
