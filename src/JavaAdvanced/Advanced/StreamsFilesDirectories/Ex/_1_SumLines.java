package JavaAdvanced.Advanced.StreamsFilesDirectories.Ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class _1_SumLines {
    public static void main(String[] args) {
        String readPath = "D:\\GitHub\\softuni-exercises\\src\\JavaAdvanced\\StreamsFilesDirectories\\Ex\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";

        try(BufferedReader reader = Files.newBufferedReader(Path.of(readPath))){
        String line = reader.readLine();
        while (line != null){
            char[] chars = line.toCharArray();
            long sum=0;
            for(char ch: chars){
                sum +=ch;
            }
            System.out.println(sum);
            line=reader.readLine();
        }

        }catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
