package JavaAdvanced.StreamsFilesDirectories.Lab;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class _2_WriteToFile {
    public static void main(String[] args) {
        String inputPath = "D:\\GitHub\\softuni-exercises\\src\\JavaAdvanced\\StreamsFilesDirectories\\Lab\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        String outputPath = "D:\\GitHub\\softuni-exercises\\src\\JavaAdvanced\\StreamsFilesDirectories\\Lab\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\02.WriteToFileOutput.txt.txt";

        Character[] chars = {'.',',','!','?'};
        Set<Character> punctuation= new HashSet<>(List.of(chars));

        try(FileInputStream in = new FileInputStream(inputPath);
            FileOutputStream out = new FileOutputStream(outputPath)){

               int currentByte = in.read();
               while(currentByte>=0){
                   char currentSymbol = (char) currentByte;

                   if(!punctuation.contains(currentSymbol)){
                       out.write(currentByte);
                   }
                   currentByte=in.read();
               }

        }catch (IOException e){
            e.printStackTrace();
        }
    }

}
