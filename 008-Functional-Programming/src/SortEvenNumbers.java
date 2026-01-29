package src;

import java.util.Arrays;
import java.util.Scanner;

public class SortEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(", ");
        int[] numbers = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }
        Arrays.stream(numbers)
                .filter(n -> n % 2 == 0)
                .sorted()
                .forEach(n -> System.out.print(n + ", "));

    }
}
