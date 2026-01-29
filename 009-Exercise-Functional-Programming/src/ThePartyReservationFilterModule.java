package src;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ThePartyReservationFilterModule {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> names = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());
        String input = scanner.nextLine();
        while (!input.equals("Print")) {
            String[] tokens = input.split(";");
            String command = tokens[0];
            String filterType = tokens[1];
            String filterParameter = tokens[2];
            switch (command) {
                case "Add filter" -> {
                    switch (filterType) {
                        case "Starts with" ->
                                names = names.stream().filter(name -> !name.startsWith(filterParameter)).collect(Collectors.toList());
                        case "Ends with" ->
                                names = names.stream().filter(name -> !name.endsWith(filterParameter)).collect(Collectors.toList());
                        case "Length" ->
                                names = names.stream().filter(name -> name.length() != Integer.parseInt(filterParameter)).collect(Collectors.toList());
                        case "Contains" ->
                                names = names.stream().filter(name -> !name.contains(filterParameter)).collect(Collectors.toList());
                    }
                }
                case "Remove filter" -> names = switch (filterType) {
                    case "Starts with" ->
                            names.stream().filter(name -> name.startsWith(filterParameter)).collect(Collectors.toList());
                    case "Ends with" ->
                            names.stream().filter(name -> name.endsWith(filterParameter)).collect(Collectors.toList());
                    case "Length" ->
                            names.stream().filter(name -> name.length() == Integer.parseInt(filterParameter)).collect(Collectors.toList());
                    case "Contains" ->
                            names.stream().filter(name -> name.contains(filterParameter)).collect(Collectors.toList());
                    default -> names;
                };
            }
            input = scanner.nextLine();
        }
        Collections.reverse(names);
        names.forEach(System.out::println);
    }
}
