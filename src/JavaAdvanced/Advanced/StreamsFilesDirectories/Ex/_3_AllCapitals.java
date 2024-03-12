package JavaAdvanced.Advanced.StreamsFilesDirectories.Ex;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class _3_AllCapitals {
    public static void main(String[] args) {
        String readPath = "D:\\GitHub\\softuni-exercises\\src\\JavaAdvanced\\StreamsFilesDirectories\\Ex\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";
        String writePath = "D:\\GitHub\\softuni-exercises\\src\\JavaAdvanced\\StreamsFilesDirectories\\Ex\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\output3.txt";

        try(BufferedReader reader = Files.newBufferedReader(Path.of(readPath));
            BufferedWriter writer = Files.newBufferedWriter(Path.of(writePath))){

            String line = reader.readLine();
            while (line != null){
                writer.write(line.toUpperCase());
                writer.write(System.lineSeparator());
                line = reader.readLine();
            }

        }catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
