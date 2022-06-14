package src;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Set;

public class Exercise_008 {
    public static void main(String[] args) throws IOException {
        String path = "input.txt";
        FileInputStream inputStream = new FileInputStream(path);
        FileOutputStream outputStream = new FileOutputStream("output.txt");
        Set<Character> characterSet = Set.of(',', '.', '!', '?');
        int oneByte = inputStream.read();
        while (oneByte != -1) {
            if (!characterSet.contains((char) oneByte)) {
                outputStream.write((char) oneByte);
            }
            oneByte = inputStream.read();
        }
        outputStream.close();
    }
}
