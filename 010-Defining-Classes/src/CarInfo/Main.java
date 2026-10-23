package CarInfo;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Car> cars = new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] carInfo = scanner.nextLine().split("\\s+");
            Car car = new Car(carInfo[0], carInfo[1], Integer.parseInt(carInfo[2]));
            cars.add(car);
        }
        cars.forEach(car -> System.out.println(car.carInfo()));
    }
}
