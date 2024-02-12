package JavaAdvanced.StreamsFilesDirectories.Ex;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class _5_LineNumbers {
    public static void main(String[] args) {
        String readPath = "D:\\GitHub\\softuni-exercises\\src\\JavaAdvanced\\StreamsFilesDirectories\\Ex\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputLineNumbers.txt";
        String writePath = "D:\\GitHub\\softuni-exercises\\src\\JavaAdvanced\\StreamsFilesDirectories\\Ex\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\output5.txt";

        try(BufferedReader reader = Files.newBufferedReader(Path.of(readPath));
            BufferedWriter writer = Files.newBufferedWriter(Path.of(writePath))){

            String line = reader.readLine();
            int num =1;
            while (line != null){
                writer.write(num+". "+line);
                writer.write(System.lineSeparator());

                num++;
                line = reader.readLine();
            }

        }catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
