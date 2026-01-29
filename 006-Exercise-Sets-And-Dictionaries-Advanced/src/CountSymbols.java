package src;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountSymbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<Character, Integer> symbols = new LinkedHashMap<>();
        for (int i = 0; i < input.length(); i++) {
            char symbol = input.charAt(i);
            symbols.putIfAbsent(symbol, 0);
            symbols.put(symbol, symbols.get(symbol) + 1);
        }
        symbols.forEach((key, value) -> System.out.println(key + ": " + value + " time/s"));
    }
}
