import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CustomComparator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Comparator<Integer> evensFirst = Comparator.<Integer, Boolean>comparing(n -> n % 2 != 0)
                .thenComparing(Comparator.naturalOrder());
        System.out.println(Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .sorted(evensFirst)
                .map(String::valueOf)
                .collect(Collectors.joining(" ")));
    }
}
