package src;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Phonebook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, String> phonebook = new TreeMap<>();
        while (!input.equals("END")) {
            String[] tokens = input.split(" ");
            String command = tokens[0];
            String name = tokens[1];
            switch (command) {
                case "A" -> {
                    String number = tokens[2];
                    phonebook.put(name, number);
                }
                case "S" -> {
                    if (phonebook.containsKey(name)) {
                        System.out.println(name + " -> " + phonebook.get(name));
                    } else {
                        System.out.println("Contact " + name + " does not exist.");
                    }
                }
            }
            input = scanner.nextLine();
        }
    }
}
