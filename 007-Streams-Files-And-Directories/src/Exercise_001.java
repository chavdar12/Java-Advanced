package src;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Exercise_001 {
    public static void main(String[] args) throws IOException {
        String path = "input.txt";
        FileInputStream inputStream = new FileInputStream(path);
        PrintStream outputStream = new PrintStream("output3.txt");

        int oneByte = inputStream.read();
        while (oneByte != -1) {
            if ((char) oneByte != ' ' && (char) oneByte != '\n') {
                outputStream.print(oneByte);
            } else {
                outputStream.print((char) oneByte);
            }
            oneByte = inputStream.read();
        }
    }
}
