package JavaAdvanced.Advanced.StreamsFilesDirectories.Lab;

import java.io.FileInputStream;
import java.io.IOException;

public class _1_ReadFile {
    public static void main(String[] args) {
        String path = "D:\\GitHub\\softuni-exercises\\src\\JavaAdvanced\\StreamsFilesDirectories\\Lab\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";

       readFromFile(path);
    }

    public static void readFromFile(String path){
        try(FileInputStream fileStream = new FileInputStream(path)){
            int oneByte = fileStream.read();
            while(oneByte>=0){
                System.out.printf("%s ", Integer.toBinaryString(oneByte));
                oneByte=fileStream.read();
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
