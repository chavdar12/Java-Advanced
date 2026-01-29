package src;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ListOfPredicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .toList();
        List<Integer> result = numbers.stream()
                .filter(number -> {
                    for (int i = 2; i <= n; i++) {
                        if (number % i != 0) {
                            return false;
                        }
                    }
                    return true;
                }).sorted().toList();
        result.forEach(number -> System.out.print(number + " "));
    }
}
