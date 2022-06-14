package src;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collections;
import java.util.List;

public class Exercise_006 {
    public static void main(String[] args) throws IOException {
        String path = "input.txt";
        List<String> lines = Files.readAllLines(Path.of(path));
        Collections.sort(lines);

        PrintWriter out = new PrintWriter("output.txt");
        for (String line : lines) {
            out.println(line);
        }
        out.close();
    }
}
