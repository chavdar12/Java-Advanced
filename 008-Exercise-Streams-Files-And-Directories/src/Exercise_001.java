package src;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Exercise_001 {
    public static void main(String[] args) {
        String path = "input.txt";

        try {
            List<String> lines = Files.readAllLines(Path.of(path));
            lines.forEach(line -> System.out.println(line.toUpperCase()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
