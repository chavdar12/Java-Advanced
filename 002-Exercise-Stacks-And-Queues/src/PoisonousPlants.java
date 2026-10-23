import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class PoisonousPlants {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] plants = Arrays.stream(scanner.nextLine().trim().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        // days[i] = the day plant i dies (0 = never); the stack holds indexes of plants still alive to the left
        int[] days = new int[n];
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        int maxDays = 0;
        for (int i = 0; i < n; i++) {
            int dayOfDeath = 0;
            while (!stack.isEmpty() && plants[stack.peek()] >= plants[i]) {
                dayOfDeath = Math.max(dayOfDeath, days[stack.pop()]);
            }
            if (!stack.isEmpty()) {
                days[i] = dayOfDeath + 1;
            }
            maxDays = Math.max(maxDays, days[i]);
            stack.push(i);
        }
        System.out.println(maxDays);
    }
}
