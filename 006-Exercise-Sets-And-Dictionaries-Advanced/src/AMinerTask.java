package src;

import java.util.Scanner;

public class AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        while (!input.equals("stop")) {
            String resource = input;
            int quantity = Integer.parseInt(scanner.nextLine());
            System.out.println(resource + " -> " + quantity);
            input = scanner.nextLine();
        }
    }
}
