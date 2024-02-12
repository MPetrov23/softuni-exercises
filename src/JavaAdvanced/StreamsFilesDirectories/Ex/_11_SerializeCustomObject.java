package JavaAdvanced.StreamsFilesDirectories.Ex;

import java.io.*;

public class _11_SerializeCustomObject {
    public static void main(String[] args)  {
        Person person = new Person("Mitko", 30,"08930");

        try(FileOutputStream fileOutputStream = new FileOutputStream("D:\\GitHub\\softuni-exercises\\src\\JavaAdvanced\\StreamsFilesDirectories\\Ex\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\person.ser");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        FileInputStream fileInputStream = new FileInputStream("D:\\GitHub\\softuni-exercises\\src\\JavaAdvanced\\StreamsFilesDirectories\\Ex\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\person.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {

            objectOutputStream.writeObject(person);
            Person deserializedPerson = (Person) objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
