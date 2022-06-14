package src;

import java.io.*;

public class Exercise_006 {
    public static void main(String[] args) {
        String path = "input.txt";

        try {
            InputStreamReader reader = new InputStreamReader(new FileInputStream(path));
            PrintWriter writer = new PrintWriter(new FileWriter("output2.txt"));

            long bytes = 0;
            int oneByte = reader.read();
            while (oneByte != -1) {
                if (oneByte != 10 && oneByte != 13) {
                    bytes += oneByte;
                }
                oneByte = reader.read();
            }

            writer.println(bytes);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
