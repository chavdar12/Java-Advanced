package src;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class PeriodicTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Integer> elements = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");
            for (String element : input) {
                elements.putIfAbsent(element, 0);
                elements.put(element, elements.get(element) + 1);
            }
        }
        elements.forEach((key, value) -> System.out.print(key + " "));
        System.out.println();
    }
}
