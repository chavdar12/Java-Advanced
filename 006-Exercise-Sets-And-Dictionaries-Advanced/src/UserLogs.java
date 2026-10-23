import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class UserLogs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, Map<String, Integer>> users = new TreeMap<>();
        while (!input.equals("end")) {
            String[] tokens = input.split(" ");
            String ip = tokens[0].substring(3);
            String username = tokens[tokens.length - 1].substring(5);
            users.putIfAbsent(username, new LinkedHashMap<>());
            users.get(username).putIfAbsent(ip, 0);
            users.get(username).put(ip, users.get(username).get(ip) + 1);
            input = scanner.nextLine();
        }
        users.forEach((key, value) -> {
            System.out.println(key + ":");
            System.out.println(value.entrySet().stream()
                    .map(e -> e.getKey() + " => " + e.getValue())
                    .collect(Collectors.joining(", ", "", ".")));
        });
    }
}
