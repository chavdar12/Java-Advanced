package src;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class LogsAggregator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Set<String> logs = new LinkedHashSet<>();
        for (int i = 0; i < n; i++) {
            logs.add(scanner.nextLine());
        }
        logs.forEach(System.out::println);
    }
}
