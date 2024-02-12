package JavaAdvanced.StreamsFilesDirectories.Ex;

import java.io.*;
import java.util.List;

public class _10_SerializeArrayList {
    public static void main(String[] args) {
        List<Double> list = List.of(4.5, 3.7, 1.0, 8.8);

        try(FileOutputStream fileOutputStream = new FileOutputStream("D:\\GitHub\\softuni-exercises\\src\\JavaAdvanced\\StreamsFilesDirectories\\Ex\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\list.ser");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        FileInputStream fileInputStream = new FileInputStream("D:\\GitHub\\softuni-exercises\\src\\JavaAdvanced\\StreamsFilesDirectories\\Ex\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\list.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)){

        objectOutputStream.writeObject(list);

        List<Double> deserializedList = (List<Double>) objectInputStream.readObject();
        deserializedList.forEach(e -> System.out.printf("%s ", e));
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}
