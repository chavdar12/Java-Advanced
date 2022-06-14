package src.Exercise_002;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Cat> cats = new LinkedHashMap<>();

        String input = sc.nextLine();
        while (!input.equals("End")) {
            String[] inputArgs = input.split("\\s+");
            Cat cat = switch (inputArgs[0]) {
                case "Siamese" -> new Siamese(inputArgs[1], Double.parseDouble(inputArgs[2]));
                case "Cymric" -> new Cymric(inputArgs[1], Double.parseDouble(inputArgs[2]));
                case "StreetExtraordinaire" -> new StreetExtraordinaire(inputArgs[1], Double.parseDouble(inputArgs[2]));
                default -> null;
            };
            cats.put(inputArgs[1], cat);
            input = sc.nextLine();
        }
        String name = sc.nextLine();
        System.out.println(cats.get(name));
    }
}
