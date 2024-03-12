package JavaAdvanced.Advanced.StreamsFilesDirectories.Ex;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class _4_CountCharacterTypes {
    public static void main(String[] args) {
        String readPath = "D:\\GitHub\\softuni-exercises\\src\\JavaAdvanced\\StreamsFilesDirectories\\Ex\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";
        String writePath = "D:\\GitHub\\softuni-exercises\\src\\JavaAdvanced\\StreamsFilesDirectories\\Ex\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\output4.txt";

        int vowels = 0;
        int other = 0;
        int punctuation = 0;

        try(BufferedReader reader = Files.newBufferedReader(Path.of(readPath));
            BufferedWriter writer = Files.newBufferedWriter(Path.of(writePath))){

            String line = reader.readLine();
            while (line != null){
                for (int i = 0; i < line.length(); i++) {
                    char ch = line.charAt(i);
                    if (isVowel(ch)){
                        vowels++;
                    } else if (ch == '!' || ch == ',' || ch == '.' || ch == '?') {
                        punctuation++;
                    } else if (ch != ' ') {
                        other++;
                    }
                }
                line = reader.readLine();
            }

            String vowelsPrint = String.format("Vowels: %d%n", vowels);
            String otherSymbolsPrint = String.format("Other symbols: %d%n", other);
            String punctuationPrint = String.format("Punctuation: %d%n", punctuation);
            writer.write(vowelsPrint);
            writer.write(otherSymbolsPrint);
            writer.write(punctuationPrint);

        }catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static boolean isVowel(char ch){
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
    public static boolean isPunctuation(char ch){
        return ch == '.' || ch == ',' || ch == '!' || ch == '?' ;

    }

}
