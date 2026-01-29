package src;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class LineNumbers {
    public static void main(String[] args) {
        Path path = Path.of("C:\\Users\\User\\Desktop\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\inputLineNumbers.txt");
        try {
            List<String> lines = Files.readAllLines(path);
            PrintWriter writer = new PrintWriter(new FileWriter("C:\\Users\\User\\Desktop\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\output.txt"));
            for (int i = 0; i < lines.size(); i++) {
                writer.println((i + 1) + ". " + lines.get(i));
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
