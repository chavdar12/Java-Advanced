package src;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(", ");
        List<Integer> numbers = Arrays.stream(input)
                .map(Integer::parseInt)
                .toList();
        int sum = numbers.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Count = " + numbers.size());
        System.out.println("Sum = " + sum);
    }
}
