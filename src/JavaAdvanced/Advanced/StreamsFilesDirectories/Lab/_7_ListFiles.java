package JavaAdvanced.Advanced.StreamsFilesDirectories.Lab;

import java.io.File;

public class _7_ListFiles {
    public static void main(String[] args) {
            File folder = new File("D:\\GitHub\\softuni-exercises\\src\\JavaAdvanced\\StreamsFilesDirectories\\Lab\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\Files-and-Streams");
            if (folder.exists()) {
                if (folder.isDirectory()) {
                    File[] allFiles = folder.listFiles();
                    for (File file : allFiles) {
                        if (!file.isDirectory()) {
                            System.out.printf("%s: [%s]%n", file.getName(), file.length());
                        }
                    }
                }
            }
        }
}
