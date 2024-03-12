package JavaAdvanced.Advanced.StreamsFilesDirectories.Lab;

import java.io.File;
import java.util.ArrayDeque;

public class _8_NestedFolders {
    public static void main(String[] args) {
        File root = new File("D:\\GitHub\\softuni-exercises\\src\\JavaAdvanced\\StreamsFilesDirectories\\Lab\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\Files-and-Streams");
        int count = 0;
        ArrayDeque<File> queue = new ArrayDeque<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            File file = queue.poll();
            File[] files = file.listFiles();
            System.out.printf("%s%n", file.getName());
            count++;
            if (files != null) {
                for (File f : files) {
                    if (f.isDirectory()) {
                        queue.offer(f);
                    }
                }
            }
        }
        System.out.printf("%d folders", count);
    }
}
