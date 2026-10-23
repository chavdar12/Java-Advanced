import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

// Usage: CountCharacterTypes <input file>
public class CountCharacterTypes {
    public static void main(String[] args) throws IOException {
        int vowels = 0;
        int consonants = 0;
        int punctuation = 0;
        for (String line : Files.readAllLines(Path.of(args[0]))) {
            for (char symbol : line.toCharArray()) {
                if ("aeiou".indexOf(symbol) >= 0) {
                    vowels++;
                } else if ("!,.?".indexOf(symbol) >= 0) {
                    punctuation++;
                } else if (!Character.isWhitespace(symbol)) {
                    consonants++;
                }
            }
        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Punctuation: " + punctuation);
    }
}
