package src;

import java.util.Scanner;
import java.util.function.Predicate;

public class FindEvensOrOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int lowerBound = Integer.parseInt(input[0]);
        int upperBound = Integer.parseInt(input[1]);
        String condition = scanner.nextLine();
        Predicate<Integer> tester = createTester(condition);
        printNumbers(lowerBound, upperBound, tester);
    }

    private static void printNumbers(int lowerBound, int upperBound, Predicate<Integer> tester) {
        for (int i = lowerBound; i <= upperBound; i++) {
            if (tester.test(i)) {
                System.out.print(i + " ");
            }
        }
    }

    private static Predicate<Integer> createTester(String condition) {
        return switch (condition) {
            case "even" -> n -> n % 2 == 0;
            case "odd" -> n -> n % 2 != 0;
            default -> null;
        };
    }
}
