package src;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class Exercise_008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayDeque<String> stack = new ArrayDeque<>();

        Arrays.stream(sc.nextLine().split("\\s+"))
                .forEach(stack::push);

        stack.forEach(e -> System.out.print(e + " "));
    }
}
