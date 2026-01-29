package src;

import java.util.*;
import java.util.stream.Collectors;

public class AcademyGraduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, List<Double>> students = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            List<Double> grades = Arrays.stream(scanner.nextLine().split(" ")).map(Double::parseDouble).collect(Collectors.toList());
            students.put(name, grades);
        }
        for (Map.Entry<String, List<Double>> entry : students.entrySet()) {
            double average = entry.getValue().stream().mapToDouble(Double::doubleValue).average().getAsDouble();
            System.out.printf("%s is graduated with %s%n", entry.getKey(), average);
        }
    }
}
