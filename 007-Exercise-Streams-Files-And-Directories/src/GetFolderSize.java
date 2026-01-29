package src;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class GetFolderSize {
    public static void main(String[] args) {
        Path path = Path.of("C:\\Users\\User\\Desktop\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\Exercises Resources");
        try {
            List<String> files = Files.readAllLines(path);
            int sum = 0;
            for (String file : files) {
                sum += Files.size(Path.of(file));
            }
            System.out.println("Folder size: " + sum);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
