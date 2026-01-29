package src;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> names = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());
        String input = scanner.nextLine();
        while (!input.equals("Party!")) {
            String[] tokens = input.split("\\s+");
            String command = tokens[0];
            String criteria = tokens[1];
            String parameter = tokens[2];
            Predicate<String> predicate = getPredicate(criteria, parameter);
            if (command.equals("Remove")) {
                names.removeIf(predicate);
            } else if (command.equals("Double")) {
                List<String> toAdd = names.stream().filter(predicate).toList();
                for (String name : toAdd) {
                    names.add(names.indexOf(name), name);
                }
            }
            input = scanner.nextLine();
        }
        if (names.isEmpty()) {
            System.out.println("Nobody is going to the party!");
        } else {
            Collections.sort(names);
            System.out.println(names.toString().replaceAll("[\\[\\]]", "") + " are going to the party!");
        }
    }

    private static Predicate<String> getPredicate(String criteria, String parameter) {
        return switch (criteria) {
            case "StartsWith" -> name -> name.startsWith(parameter);
            case "EndsWith" -> name -> name.endsWith(parameter);
            case "Length" -> name -> name.length() == Integer.parseInt(parameter);
            default -> null;
        };
    }
}
