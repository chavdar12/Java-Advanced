import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class AverageStudentsGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, List<Double>> students = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split(" ");
            students.computeIfAbsent(tokens[0], k -> new ArrayList<>()).add(Double.parseDouble(tokens[1]));
        }
        students.forEach((name, grades) -> {
            StringBuilder line = new StringBuilder(name).append(" -> ");
            grades.forEach(grade -> line.append(String.format("%.2f ", grade)));
            double average = grades.stream().mapToDouble(Double::doubleValue).average().orElse(0);
            line.append(String.format("(avg: %.2f)", average));
            System.out.println(line);
        });
    }
}
