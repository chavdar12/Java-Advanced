package src;

import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;

public class Exercise_004 {

    public static void main(String[] args) throws IOException {
        File file = new File("04. Java-Advanced-Files-and-Streams-Lab-Resources");

        ArrayDeque<File> queue = new ArrayDeque<>();
        queue.offer(file);
        int count = 0;

        while (!queue.isEmpty()) {
            File[] files = queue.poll().listFiles();

            for (File f : files) {
                if (f.isDirectory()) {
                    queue.offer(f);
                    System.out.println(f.getName());
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
