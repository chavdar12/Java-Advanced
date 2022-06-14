package src;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Exercise_005 {
    public static void main(String[] args) throws IOException {
        String path = "inputOne.txt";
        String path2 = "inputTwo.txt";

        List<String> lines1 = Files.readAllLines(Path.of(path));
        List<String> lines2 = Files.readAllLines(Path.of(path2));
        PrintWriter writer = new PrintWriter(new FileWriter("output7.txt"));

        lines1.forEach(writer::println);
        lines2.forEach(writer::println);
        writer.close();

    }
}
