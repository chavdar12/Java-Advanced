import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SortEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> evens = Arrays.stream(scanner.nextLine().split(", "))
                .map(Integer::parseInt)
                .filter(n -> n % 2 == 0)
                .toList();
        System.out.println(join(evens));
        System.out.println(join(evens.stream().sorted().toList()));
    }

    private static String join(List<Integer> numbers) {
        return numbers.stream().map(String::valueOf).collect(Collectors.joining(", "));
    }
}
