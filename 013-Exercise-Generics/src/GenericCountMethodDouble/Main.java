package src.GenericCountMethodDouble;

import src.GenericBox.Box;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        Box<Double> box = new Box<>();

        while (n-- > 0) {
            box.addElement(Double.parseDouble(reader.readLine()));
        }

        double element = Double.parseDouble(reader.readLine());

        System.out.println(box.countGreaterElements(element));
    }
}
