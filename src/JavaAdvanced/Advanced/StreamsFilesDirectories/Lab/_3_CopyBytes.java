package JavaAdvanced.Advanced.StreamsFilesDirectories.Lab;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class _3_CopyBytes {
    public static void main(String[] args) {

        String inputPath = "D:\\GitHub\\softuni-exercises\\src\\JavaAdvanced\\StreamsFilesDirectories\\Lab\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        String outputPath = "D:\\GitHub\\softuni-exercises\\src\\JavaAdvanced\\StreamsFilesDirectories\\Lab\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\03.CopyBytesOutput.txt";

        Character[] chars = {'.', ',', '!', '?'};
        Set<Character> punctuation = new HashSet<>(List.of(chars));


        try (FileInputStream in = new FileInputStream(inputPath);
             FileOutputStream out = new FileOutputStream(outputPath)) {

            int currentByte = in.read();
            while (currentByte >= 0) {
                if(currentByte==32 || currentByte==10){
                    out.write(currentByte);
                }else{
                    String digit=String.valueOf(currentByte);
                    for(int i =0; i<digit.length(); i++){
                        out.write(digit.charAt(i));
                    }
                }

                currentByte = in.read();
            }

        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }
}
