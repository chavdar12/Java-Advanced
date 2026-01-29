package src;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class CitiesByContinentAndCountry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Set<String> cities = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split(" ");
            String name = tokens[0];
            cities.add(name);
        }
        for (String city : cities) {
            System.out.println(city);
        }
    }
}
