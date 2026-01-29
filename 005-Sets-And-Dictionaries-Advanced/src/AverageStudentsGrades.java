package src;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class AverageStudentsGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Set<String> students = new LinkedHashSet<>();
        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split(" ");
            String name = tokens[0];
            students.add(name);
        }
        for (String student : students) {
            System.out.println(student);
        }
    }
}
