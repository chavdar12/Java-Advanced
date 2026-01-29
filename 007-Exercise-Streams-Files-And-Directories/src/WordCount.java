package src;

import java.io.*;

public class WordCount {
    public static void main(String[] args) {
        String wordsPath = "C:\\Users\\User\\Desktop\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\words.txt";
        String textPath = "C:\\Users\\User\\Desktop\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\text.txt";
        String outputPath = "C:\\Users\\User\\Desktop\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\output.txt";
        try (BufferedReader wordsReader = new BufferedReader(new FileReader(wordsPath));
             BufferedReader textReader = new BufferedReader(new FileReader(textPath));
             PrintWriter writer = new PrintWriter(new FileWriter(outputPath))) {
            String[] words = wordsReader.readLine().split("\\s+");
            String line = textReader.readLine();
            int[] count = new int[words.length];
            while (line != null) {
                for (int i = 0; i < words.length; i++) {
                    if (line.contains(words[i])) {
                        count[i]++;
                    }
                }
                line = textReader.readLine();
            }
            for (int i = 0; i < words.length; i++) {
                writer.println(words[i] + " - " + count[i]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
