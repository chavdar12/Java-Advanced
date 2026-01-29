package src;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class UserLogs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, Map<String, Integer>> users = new LinkedHashMap<>();
        while (!input.equals("end")) {
            String[] tokens = input.split(" ");
            String ip = tokens[0].substring(3);
            String username = tokens[2].substring(5);
            users.putIfAbsent(username, new LinkedHashMap<>());
            users.get(username).putIfAbsent(ip, 0);
            users.get(username).put(ip, users.get(username).get(ip) + 1);
            input = scanner.nextLine();
        }
        users.forEach((key, value) -> {
            System.out.println(key + ":");
            value.forEach((k, v) -> {
                if (v == value.size()) {
                    System.out.print(k + " => " + v + ".");
                } else {
                    System.out.print(k + " => " + v + ", ");
                }
            });
            System.out.println();
        });
    }
}
