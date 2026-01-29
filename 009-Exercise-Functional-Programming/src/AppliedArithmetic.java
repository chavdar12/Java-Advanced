package src;

import java.util.Arrays;
import java.util.Scanner;

public class AppliedArithmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        String command = scanner.nextLine();
        while (!command.equals("end")) {
            switch (command) {
                case "add" -> numbers = Arrays.stream(numbers).map(n -> n + 1).toArray();
                case "multiply" -> numbers = Arrays.stream(numbers).map(n -> n * 2).toArray();
                case "subtract" -> numbers = Arrays.stream(numbers).map(n -> n - 1).toArray();
                case "print" -> {
                    Arrays.stream(numbers).forEach(n -> System.out.print(n + " "));
                    System.out.println();
                }
            }
            command = scanner.nextLine();
        }
    }
}
