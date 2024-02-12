package JavaAdvanced.StreamsFilesDirectories.Ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class _2_SumBytes {
    public static void main(String[] args) {
        String readPath = "D:\\GitHub\\softuni-exercises\\src\\JavaAdvanced\\StreamsFilesDirectories\\Ex\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";
        try(BufferedReader reader = Files.newBufferedReader(Path.of(readPath))){
            String line = reader.readLine();
            long sum=0;

            while (line != null){
                char[] chars = line.toCharArray();

                for(char ch: chars){
                    sum +=ch;
                }
                line=reader.readLine();
            }
            System.out.println(sum);

        }catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
