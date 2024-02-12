package JavaAdvanced.StreamsFilesDirectories.Ex;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class _9_CopyAPicture {
    public static void main(String[] args) {
        try (FileInputStream fileInputStream = new FileInputStream("D:\\GitHub\\softuni-exercises\\src\\JavaAdvanced\\StreamsFilesDirectories\\Ex\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\cat.jpg");
             FileOutputStream fileOutputStream = new FileOutputStream("D:\\GitHub\\softuni-exercises\\src\\JavaAdvanced\\StreamsFilesDirectories\\Ex\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\cat_copy.jpg")) {
            int readByte = fileInputStream.read();
            while (readByte != -1) {
                fileOutputStream.write(readByte);
                readByte = fileInputStream.read();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

}
