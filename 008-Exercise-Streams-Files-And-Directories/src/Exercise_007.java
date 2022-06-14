package src;

import java.io.*;

public class Exercise_007 {
    public static void main(String[] args) {
        String path = "input.txt";

        try {
            BufferedReader bf = new BufferedReader(new FileReader(path));
            PrintWriter writer = new PrintWriter(new FileWriter("output1.txt"));

            String line = bf.readLine();
            while (line != null) {
                int lines = 0;
                for (char c : line.toCharArray()) {
                    lines += c;
                }
                writer.println(lines);
                line = bf.readLine();
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
