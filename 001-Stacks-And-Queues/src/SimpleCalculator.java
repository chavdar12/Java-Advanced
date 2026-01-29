package src;

import java.util.ArrayDeque;
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayDeque<String> stack = new ArrayDeque<>();
        String[] input = sc.nextLine().split(" ");
        for (int i = input.length - 1; i >= 0; i--) {
            stack.push(input[i]);
        }
        while (stack.size() > 1) {
            int first = Integer.parseInt(stack.pop());
            String operator = stack.pop();
            int second = Integer.parseInt(stack.pop());
            if (operator.equals("+")) {
                stack.push(String.valueOf(first + second));
            } else {
                stack.push(String.valueOf(first - second));
            }
        }
        System.out.println(stack.pop());
    }
}
