package src;

import java.util.Arrays;
import java.util.Scanner;

public class CustomComparator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        Arrays.sort(numbers);
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
