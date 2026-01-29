package src.CarSalesman;

import src.RawData.Engine;
import src.SpeedRacing.Car;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Main {
    private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static final List<src.SpeedRacing.Car> cars = new ArrayList<>();
    private static final Map<String, src.RawData.Engine> engines = new LinkedHashMap<>();

    public static void main(String[] args) throws IOException {

        getEngines();
        getCars();

        cars.forEach(System.out::println);
    }

    private static void getCars() throws IOException {
        int m = Integer.parseInt(reader.readLine());
        while (m-- > 0) {
            String[] tokens = reader.readLine().split("\\s+");
            String model = tokens[0];
            src.RawData.Engine engine = engines.get(tokens[1]);
            switch (tokens.length) {
                case 4 -> cars.add(new Car(model, engine, tokens[2], tokens[3]));
                case 3 -> cars.add(new Car(model, engine, tokens[2]));
                case 2 -> cars.add(new Car(model, engine));
            }
        }
    }

    private static void getEngines() throws IOException {
        int n = Integer.parseInt(reader.readLine());
        while (n-- > 0) {
            String[] tokens = reader.readLine().split(" ");
            String model = tokens[0];
            String power = tokens[1];
            switch (tokens.length) {
                case 2 -> engines.put(model, new Engine(model, power));
                case 3 -> engines.put(model, new Engine(model, power, tokens[2]));
                case 4 -> engines.put(model, new Engine(model, power, tokens[2], tokens[3]));
            }
        }
    }
}
