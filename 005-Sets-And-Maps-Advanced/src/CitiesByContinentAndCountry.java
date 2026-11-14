import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class CitiesByContinentAndCountry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Map<String, List<String>>> continents = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split(" ");
            continents.computeIfAbsent(tokens[0], k -> new LinkedHashMap<>())
                    .computeIfAbsent(tokens[1], k -> new ArrayList<>())
                    .add(tokens[2]);
        }
        continents.forEach((continent, countries) -> {
            System.out.println(continent + ":");
            countries.forEach((country, cities) ->
                    System.out.println("  " + country + " -> " + String.join(", ", cities)));
        });
    }
}
