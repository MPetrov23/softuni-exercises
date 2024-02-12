package JavaAdvanced.StreamsFilesDirectories.Ex;

import java.io.*;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class _12_CreateZipArchive {
    public static void main(String[] args){
        String path1 = "D:\\GitHub\\softuni-exercises\\src\\JavaAdvanced\\StreamsFilesDirectories\\Ex\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";
        String path2 = "D:\\GitHub\\softuni-exercises\\src\\JavaAdvanced\\StreamsFilesDirectories\\Ex\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputLineNumbers.txt";
        String path3 = "D:\\GitHub\\softuni-exercises\\src\\JavaAdvanced\\StreamsFilesDirectories\\Ex\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputOne.txt";
        String path4 = "D:\\GitHub\\softuni-exercises\\src\\JavaAdvanced\\StreamsFilesDirectories\\Ex\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputTwo.txt";
        List<String> paths = List.of(path1, path2, path3, path4);

        try(FileOutputStream fileOutputStream = new FileOutputStream("D:\\GitHub\\softuni-exercises\\src\\JavaAdvanced\\StreamsFilesDirectories\\Ex\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\files.zip");
            ZipOutputStream zipOutputStream = new ZipOutputStream(fileOutputStream)) {

            for (String path : paths) {
                File file = new File(path);
                FileInputStream fileInputStream = new FileInputStream(file);
                ZipEntry zipEntry = new ZipEntry(file.getName());
                zipOutputStream.putNextEntry(zipEntry);
                int read = fileInputStream.read();
                while (read != -1) {
                    zipOutputStream.write(read);
                    read = fileInputStream.read();
                }
                fileInputStream.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
