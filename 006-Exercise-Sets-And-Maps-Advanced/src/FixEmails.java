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
            String domain = email.toLowerCase();
            if (!domain.endsWith("us") && !domain.endsWith("uk") && !domain.endsWith("com")) {
                emails.put(name, email);
            }
            input = scanner.nextLine();
        }
        emails.forEach((key, value) -> System.out.println(key + " -> " + value));
    }
}

