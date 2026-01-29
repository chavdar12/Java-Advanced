package src;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class PopulationCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, Map<String, Long>> countries = new LinkedHashMap<>();
        while (!input.equals("report")) {
            String[] tokens = input.split("\\|");
            String city = tokens[0];
            String country = tokens[1];
            long population = Long.parseLong(tokens[2]);
            countries.putIfAbsent(country, new LinkedHashMap<>());
            countries.get(country).putIfAbsent(city, 0L);
            countries.get(country).put(city, countries.get(country).get(city) + population);
            input = scanner.nextLine();
        }
        countries.entrySet().stream()
                .sorted((a, b) -> {
                    long firstPopulation = a.getValue().values().stream().mapToLong(e -> e).sum();
                    long secondPopulation = b.getValue().values().stream().mapToLong(e -> e).sum();
                    return Long.compare(secondPopulation, firstPopulation);
                })
                .forEach(country -> {
                    long totalPopulation = country.getValue().values().stream().mapToLong(e -> e).sum();
                    System.out.printf("%s (total population: %d)%n", country.getKey(), totalPopulation);
                    country.getValue().entrySet().stream()
                            .sorted((a, b) -> b.getValue().compareTo(a.getValue()))
                            .forEach(city -> System.out.printf("=>%s: %d%n", city.getKey(), city.getValue()));
                });
    }
}
