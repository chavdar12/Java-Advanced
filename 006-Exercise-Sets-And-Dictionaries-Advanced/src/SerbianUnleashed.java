import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SerbianUnleashed {
    // "{singer} @{venue} {ticketsPrice} {ticketsCount}", singer and venue are one to three words
    private static final Pattern CONCERT = Pattern.compile(
            "^(?<singer>[A-Za-z]+(?: [A-Za-z]+){0,2}) @(?<venue>[A-Za-z]+(?: [A-Za-z]+){0,2}) (?<price>\\d+) (?<count>\\d+)$");

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Map<String, Long>> venues = new LinkedHashMap<>();
        String input = scanner.nextLine();
        while (!input.equals("End")) {
            Matcher matcher = CONCERT.matcher(input);
            if (matcher.matches()) {
                long money = Long.parseLong(matcher.group("price")) * Long.parseLong(matcher.group("count"));
                venues.computeIfAbsent(matcher.group("venue"), k -> new LinkedHashMap<>())
                        .merge(matcher.group("singer"), money, Long::sum);
            }
            input = scanner.nextLine();
        }
        venues.forEach((venue, singers) -> {
            System.out.println(venue);
            singers.entrySet().stream()
                    .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                    .forEach(singer -> System.out.printf("#  %s -> %d%n", singer.getKey(), singer.getValue()));
        });
    }
}
