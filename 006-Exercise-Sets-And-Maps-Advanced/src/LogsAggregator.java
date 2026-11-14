import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class LogsAggregator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Integer> durations = new TreeMap<>();
        Map<String, Set<String>> ips = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split(" ");
            String ip = tokens[0];
            String user = tokens[1];
            durations.merge(user, Integer.parseInt(tokens[2]), Integer::sum);
            ips.computeIfAbsent(user, k -> new TreeSet<>()).add(ip);
        }
        durations.forEach((user, duration) ->
                System.out.printf("%s: %d [%s]%n", user, duration, String.join(", ", ips.get(user))));
    }
}
