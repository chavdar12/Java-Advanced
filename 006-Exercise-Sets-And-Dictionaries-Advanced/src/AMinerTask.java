import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> resources = new LinkedHashMap<>();
        String input = scanner.nextLine();
        while (!input.equals("stop")) {
            int quantity = Integer.parseInt(scanner.nextLine());
            resources.merge(input, quantity, Integer::sum);
            input = scanner.nextLine();
        }
        resources.forEach((resource, quantity) -> System.out.println(resource + " -> " + quantity));
    }
}
