package src;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class SetsOfElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        Map<Integer, Integer> firstSet = new TreeMap<>();
        Map<Integer, Integer> secondSet = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            firstSet.putIfAbsent(number, 0);
            firstSet.put(number, firstSet.get(number) + 1);
        }
        for (int i = 0; i < m; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            secondSet.putIfAbsent(number, 0);
            secondSet.put(number, secondSet.get(number) + 1);
        }
        firstSet.forEach((key, value) -> {
            if (secondSet.containsKey(key)) {
                System.out.print(key + " ");
            }
        });
    }
}
