package src;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ProductShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Map<String, Double>> shops = new TreeMap<>();
        String input = scanner.nextLine();
        while (!input.equals("Revision")) {
            String[] tokens = input.split(", ");
            String shop = tokens[0];
            String product = tokens[1];
            double price = Double.parseDouble(tokens[2]);
            if (!shops.containsKey(shop)) {
                shops.put(shop, new LinkedHashMap<>());
            }
            shops.get(shop).put(product, price);
            input = scanner.nextLine();
        }
        for (Map.Entry<String, Map<String, Double>> entry : shops.entrySet()) {
            System.out.println(entry.getKey() + "->");
            for (Map.Entry<String, Double> product : entry.getValue().entrySet()) {
                System.out.printf("Product: %s, Price: %.1f%n", product.getKey(), product.getValue());
            }
        }
    }
}
