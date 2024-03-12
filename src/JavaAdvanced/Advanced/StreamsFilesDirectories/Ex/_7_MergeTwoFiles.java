package JavaAdvanced.Advanced.StreamsFilesDirectories.Ex;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class _7_MergeTwoFiles {
    public static void main(String[] args) {
        try(BufferedReader reader1 = Files.newBufferedReader(Path.of("D:\\GitHub\\softuni-exercises\\src\\JavaAdvanced\\StreamsFilesDirectories\\Ex\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputOne.txt"));
            BufferedReader reader2 = Files.newBufferedReader(Path.of("D:\\GitHub\\softuni-exercises\\src\\JavaAdvanced\\StreamsFilesDirectories\\Ex\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputTwo.txt"));
            BufferedWriter writer = Files.newBufferedWriter(Path.of("D:\\GitHub\\softuni-exercises\\src\\JavaAdvanced\\StreamsFilesDirectories\\Ex\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\output7.txt"))) {
            String line = reader1.readLine();
            while (line != null) {
                writer.write(String.format("%s%n", line));
                line = reader1.readLine();
            }
            line = reader2.readLine();
            while (line != null) {
                writer.write(String.format("%s%n", line));
                line = reader2.readLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
