package src;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ReverseAndExclude {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int n = Integer.parseInt(scanner.nextLine());
        Function<List<Integer>, List<Integer>> reverse = list -> {
            Collections.reverse(list);
            return list;
        };
        Function<List<Integer>, List<Integer>> exclude = list -> list.stream()
                .filter(num -> num % n != 0)
                .collect(Collectors.toList());
        numbers = reverse.apply(numbers);
        numbers = exclude.apply(numbers);
        numbers.forEach(num -> System.out.print(num + " "));
    }
}
