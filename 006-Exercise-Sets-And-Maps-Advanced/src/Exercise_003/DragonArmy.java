package src.Exercise_003;

import java.util.*;

public class DragonArmy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Map<String, Stats>> map = new LinkedHashMap<>();
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            String[] inputArgs = sc.nextLine().split("\\s+");
            String type = inputArgs[0];
            String name = inputArgs[1];
            String damageS = inputArgs[2];
            String healthS = inputArgs[3];
            String armorS = inputArgs[4];
            int damage, health, armor;

            if (damageS.equals("null")) {
                damage = 45;
            } else {
                damage = Integer.parseInt(damageS);
            }

            if (healthS.equals("null")) {
                health = 250;
            } else {
                health = Integer.parseInt(healthS);
            }

            if (armorS.equals("null")) {
                armor = 10;
            } else {
                armor = Integer.parseInt(armorS);
            }
            map.putIfAbsent(type, new TreeMap<>());
            map.get(type).put(name, new Stats(damage, health, armor));
        }
        map.forEach((key, value) -> {
            System.out.printf("%s::%s%n", key, getAverageStats(value));
            value.forEach((key1, value1) -> System.out.printf("-%s -> %s%n", key1, value1));
        });
    }

    private static String getAverageStats(Map<String, Stats> map) {
        double averageDamage = 0;
        double averageHealth = 0;
        double averageArmor = 0;

        for (Stats d : map.values()) {
            averageDamage += d.getDamage();
            averageHealth += d.getHealth();
            averageArmor += d.getArmor();
        }
        averageDamage /= map.size();
        averageHealth /= map.size();
        averageArmor /= map.size();
        return String.format("(%.2f/%.2f/%.2f)", averageDamage, averageHealth, averageArmor);
    }
}
