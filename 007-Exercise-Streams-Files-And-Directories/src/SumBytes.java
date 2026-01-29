package src;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

public class SumBytes {
    public static void main(String[] args) {
        Path path = Path.of("C:\\Users\\User\\Desktop\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt");
        try {
            List<String> lines = Files.readAllLines(path);
            Set<Character> punctuation = Set.of(',', '.', '!', '?');
            AtomicInteger sum = new AtomicInteger();
            for (String line : lines) {
                for (int i = 0; i < line.length(); i++) {
                    if (!punctuation.contains(line.charAt(i))) {
                        sum.addAndGet(line.charAt(i));
                    }
                }
            }
            PrintWriter writer = new PrintWriter(new FileWriter("C:\\Users\\User\\Desktop\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\output.txt"));
            writer.println(sum);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
