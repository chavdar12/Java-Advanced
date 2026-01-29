package src;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class CountCharacterTypes {
    public static void main(String[] args) {
        Path path = Path.of("C:\\Users\\User\\Desktop\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt");
        try {
            List<String> lines = Files.readAllLines(path);
            AtomicInteger vowels = new AtomicInteger();
            AtomicInteger consonants = new AtomicInteger();
            AtomicInteger punctuation = new AtomicInteger();
            for (String line : lines) {
                for (int i = 0; i < line.length(); i++) {
                    if (line.charAt(i) == 'a' || line.charAt(i) == 'e' || line.charAt(i) == 'i' || line.charAt(i) == 'o' || line.charAt(i) == 'u') {
                        vowels.addAndGet(1);
                    } else if (line.charAt(i) == '!' || line.charAt(i) == ',' || line.charAt(i) == '.' || line.charAt(i) == '?') {
                        punctuation.addAndGet(1);
                    } else if (line.charAt(i) != ' ') {
                        consonants.addAndGet(1);
                    }
                }
            }
            System.out.println("Vowels: " + vowels);
            System.out.println("Consonants: " + consonants);
            System.out.println("Punctuation: " + punctuation);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
