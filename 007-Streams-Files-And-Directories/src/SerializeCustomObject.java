import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializeCustomObject {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Cube cube = new Cube("green", 15.3, 12.4, 3.0);

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(args[0]))) {
            out.writeObject(cube);
        }
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(args[0]))) {
            System.out.println(in.readObject());
        }
    }
}
