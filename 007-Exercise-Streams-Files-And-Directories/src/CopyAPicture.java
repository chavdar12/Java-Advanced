package src;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyAPicture {
    public static void main(String[] args) {
        String path = "C:\\Users\\User\\Desktop\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\Exercises Resources\\picture.jpg";
        String outputPath = "C:\\Users\\User\\Desktop\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\Exercises Resources\\picture-copy.jpg";
        try (FileInputStream reader = new FileInputStream(path);
             FileOutputStream writer = new FileOutputStream(outputPath)) {
            byte[] buffer = new byte[4096];
            int readBytes = reader.read(buffer);
            while (readBytes != -1) {
                writer.write(buffer, 0, readBytes);
                readBytes = reader.read(buffer);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
