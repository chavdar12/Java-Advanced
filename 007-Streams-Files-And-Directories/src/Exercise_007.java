package src;

import java.io.*;

public class Exercise_007 {
    public static void main(String[] args) throws IOException {
        String path = "input.txt";
        BufferedReader in = new BufferedReader(new FileReader(path));
        PrintWriter out = new PrintWriter(new FileWriter("output.txt"));

        String line;
        int br = 0;
        while ((line = in.readLine()) != null) {
            if (++br % 3 == 0) {
                out.println(line);
            }
        }
        out.close();

    }
}
