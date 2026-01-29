package src;

import java.util.*;

public class HandsOfCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Set<String>> players = new LinkedHashMap<>();
        String input = scanner.nextLine();
        while (!input.equals("JOKER")) {
            String[] tokens = input.split(": ");
            String name = tokens[0];
            String[] cards = tokens[1].split(", ");
            players.putIfAbsent(name, new HashSet<>());
            players.get(name).addAll(Arrays.asList(cards));
            input = scanner.nextLine();
        }
        players.forEach((key, value) -> {
            int sum = 0;
            for (String card : value) {
                int power = 0;
                switch (card.charAt(0)) {
                    case '2' -> power = 2;
                    case '3' -> power = 3;
                    case '4' -> power = 4;
                    case '5' -> power = 5;
                    case '6' -> power = 6;
                    case '7' -> power = 7;
                    case '8' -> power = 8;
                    case '9' -> power = 9;
                    case '1' -> power = 10;
                    case 'J' -> power = 11;
                    case 'Q' -> power = 12;
                    case 'K' -> power = 13;
                    case 'A' -> power = 14;
                }
                int type = 0;
                switch (card.charAt(card.length() - 1)) {
                    case 'S' -> type = 4;
                    case 'H' -> type = 3;
                    case 'D' -> type = 2;
                    case 'C' -> type = 1;
                }
                sum += power * type;
            }
            System.out.println(key + ": " + sum);
        });
    }
}
