import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class FindTheSmallestElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        // on ties the rightmost index wins
        Function<int[], Integer> indexOfSmallest = array -> {
            int index = 0;
            for (int i = 1; i < array.length; i++) {
                if (array[i] <= array[index]) {
                    index = i;
                }
            }
            return index;
        };
        System.out.println(indexOfSmallest.apply(numbers));
    }
}
