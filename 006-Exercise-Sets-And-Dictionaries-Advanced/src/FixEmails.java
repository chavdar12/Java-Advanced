package src;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FixEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, String> emails = new LinkedHashMap<>();
        while (!input.equals("stop")) {
            String name = input;
            String email = scanner.nextLine();
            emails.putIfAbsent(name, email);
            emails.put(name, emails.get(name) + email);
            input = scanner.nextLine();
        }
        emails.forEach((key, value) -> System.out.println(key + " -> " + value));
    }
}

