import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ListOfPredicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Predicate<Integer>> divisibleBy = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .<Predicate<Integer>>map(divisor -> number -> number % divisor == 0)
                .toList();
        System.out.println(IntStream.rangeClosed(1, n).boxed()
                .filter(number -> divisibleBy.stream().allMatch(predicate -> predicate.test(number)))
                .map(String::valueOf)
                .collect(Collectors.joining(" ")));
    }
}
