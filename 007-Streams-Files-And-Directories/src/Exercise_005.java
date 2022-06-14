package src;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Exercise_005 {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream("input.txt");
        PrintStream outputStream = new PrintStream("output1.txt");
        int value = inputStream.read();
        while (value != -1) {
            outputStream.print(Integer.toBinaryString(value) + " ");
            value = inputStream.read();
        }
        outputStream.close();
    }
}
