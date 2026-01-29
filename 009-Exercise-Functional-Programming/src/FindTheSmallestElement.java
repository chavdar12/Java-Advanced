package src;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class FindTheSmallestElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        Predicate<Integer> isSmallest = num -> IntStream.of(numbers).min().getAsInt() == num;
        for (int i = 0; i < numbers.length; i++) {
            if (isSmallest.test(numbers[i])) {
                System.out.println(i);
                break;
            }
        }
    }
}
