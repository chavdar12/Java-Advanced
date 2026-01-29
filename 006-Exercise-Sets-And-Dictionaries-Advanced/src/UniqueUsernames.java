package src;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class UniqueUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Integer> usernames = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String username = scanner.nextLine();
            usernames.putIfAbsent(username, 0);
            usernames.put(username, usernames.get(username) + 1);
        }
        usernames.forEach((key, value) -> System.out.println(key));
    }
}
