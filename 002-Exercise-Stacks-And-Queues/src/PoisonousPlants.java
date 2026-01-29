package src;

import java.util.ArrayDeque;
import java.util.Scanner;

public class PoisonousPlants {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String[] input = scanner.nextLine().split("\\s+");
        ArrayDeque<Integer> plants = new ArrayDeque<>();
        for (String s : input) {
            plants.push(Integer.parseInt(s));
        }
        int days = 0;
        while (true) {
            boolean isDead = false;
            ArrayDeque<Integer> temp = new ArrayDeque<>();
            int previous = plants.pop();
            temp.push(previous);
            while (!plants.isEmpty()) {
                int current = plants.pop();
                if (current < previous) {
                    isDead = true;
                } else {
                    temp.push(current);
                }
                previous = current;
            }
            if (isDead) {
                days++;
            } else {
                break;
            }
            while (!temp.isEmpty()) {
                plants.push(temp.pop());
            }
        }
        System.out.println(days);
    }
}
