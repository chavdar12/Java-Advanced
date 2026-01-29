package src;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class DragonArmy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Map<String, int[]>> dragons = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split(" ");
            String type = tokens[0];
            String name = tokens[1];
            int damage = tokens[2].equals("null") ? 45 : Integer.parseInt(tokens[2]);
            int health = tokens[3].equals("null") ? 250 : Integer.parseInt(tokens[3]);
            int armor = tokens[4].equals("null") ? 10 : Integer.parseInt(tokens[4]);
            dragons.putIfAbsent(type, new LinkedHashMap<>());
            dragons.get(type).putIfAbsent(name, new int[3]);
            dragons.get(type).put(name, new int[]{damage, health, armor});
        }
        dragons.forEach((key, value) -> {
            double averageDamage = value.values().stream().mapToInt(x -> x[0]).average().orElse(0);
            double averageHealth = value.values().stream().mapToInt(x -> x[1]).average().orElse(0);
            double averageArmor = value.values().stream().mapToInt(x -> x[2]).average().orElse(0);
            System.out.printf("%s::(%.2f/%.2f/%.2f)%n", key, averageDamage, averageHealth, averageArmor);
            value.forEach((k, v) -> System.out.printf("-%s -> damage: %d, health: %d, armor: %d%n", k, v[0], v[1], v[2]));
        });
    }
}
