package src;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;

public class CountUppercaseWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        Predicate<String> isUppercase = s -> Character.isUpperCase(s.charAt(0));
        Arrays.stream(input)
                .filter(isUppercase)
                .forEach(System.out::println);
    }
}
