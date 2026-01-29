package src;

import java.util.ArrayDeque;
import java.util.Scanner;

public class InfixToPostfix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");
        ArrayDeque<String> stack = new ArrayDeque<>();
        for (String s : input) {
            if (Character.isDigit(s.charAt(0)) || Character.isLetter(s.charAt(0))) {
                System.out.print(s + " ");
            } else if (s.equals("(")) {
                stack.push(s);
            } else if (s.equals(")")) {
                while (!stack.peek().equals("(")) {
                    System.out.print(stack.pop() + " ");
                }
                stack.pop();
            } else {
                while (!stack.isEmpty() && getPriority(s) <= getPriority(stack.peek())) {
                    System.out.print(stack.pop() + " ");
                }
                stack.push(s);
            }
        }
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }

    private static int getPriority(String s) {
        switch (s) {
            case "+", "-" -> {
                return 1;
            }
            case "*", "/" -> {
                return 2;
            }
        }
        return 0;
    }
}
