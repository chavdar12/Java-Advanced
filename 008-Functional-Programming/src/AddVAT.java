package src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AddVAT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Double> numbers = Arrays.stream(scanner.nextLine().split(", "))
                .map(Double::parseDouble)
                .toList();
        System.out.println("Prices with VAT:");
        numbers.stream()
                .map(n -> n * 1.2)
                .forEach(n -> System.out.printf("%.2f%n", n));
    }
}
