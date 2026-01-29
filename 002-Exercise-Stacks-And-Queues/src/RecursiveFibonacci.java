package src;

import java.util.ArrayDeque;
import java.util.Scanner;

public class RecursiveFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        ArrayDeque<Long> stack = new ArrayDeque<>();
        stack.push(1L);
        stack.push(1L);
        for (int i = 0; i < n - 1; i++) {
            long first = stack.pop();
            long second = stack.pop();
            stack.push(first);
            stack.push(first + second);
        }
        System.out.println(stack.pop());
    }
}
