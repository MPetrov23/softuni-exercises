package JavaAdvanced.StreamsFilesDirectories.Lab;

import java.io.*;

public class _9_SerializeCustomObject {
    public static void main(String[] args) throws IOException, ClassNotFoundException, IOException {
        Cube cube = new Cube("blue", 1, 5, 6);

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("D:\\GitHub\\softuni-exercises\\src\\JavaAdvanced\\StreamsFilesDirectories\\Lab\\cubeInfo.ser"));
        objectOutputStream.writeObject(cube);
        objectOutputStream.close();

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("D:\\GitHub\\softuni-exercises\\src\\JavaAdvanced\\StreamsFilesDirectories\\Lab\\cubeInfo.ser"));
        Cube cubeOne = (Cube) objectInputStream.readObject();
        System.out.println();;
    }
}
