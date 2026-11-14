import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ThePartyReservationFilterModule {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> guests = Arrays.asList(scanner.nextLine().split("\\s+"));
        // filters are only applied on Print, so a removed filter brings its guests back
        Map<String, Predicate<String>> filters = new LinkedHashMap<>();
        String input = scanner.nextLine();
        while (!input.equals("Print")) {
            String[] tokens = input.split(";");
            String key = tokens[1] + ";" + tokens[2];
            if (tokens[0].equals("Add filter")) {
                filters.put(key, createFilter(tokens[1], tokens[2]));
            } else {
                filters.remove(key);
            }
            input = scanner.nextLine();
        }
        System.out.println(guests.stream()
                .filter(guest -> filters.values().stream().noneMatch(filter -> filter.test(guest)))
                .collect(Collectors.joining(" ")));
    }

    private static Predicate<String> createFilter(String type, String parameter) {
        return switch (type) {
            case "Starts with" -> name -> name.startsWith(parameter);
            case "Ends with" -> name -> name.endsWith(parameter);
            case "Length" -> name -> name.length() == Integer.parseInt(parameter);
            case "Contains" -> name -> name.contains(parameter);
            default -> name -> false;
        };
    }
}
