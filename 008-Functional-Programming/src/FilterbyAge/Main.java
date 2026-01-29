package src.FilterbyAge;

import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Person[] people = new Person[n];
        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(", ");
            people[i] = new Person(input[0], Integer.parseInt(input[1]));
        }
        String condition = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        String format = scanner.nextLine();
        Predicate<Person> tester = createTester(condition, age);
        Consumer<Person> printer = createPrinter(format);
        printFilteredStudent(people, tester, printer);
    }

    private static void printFilteredStudent(Person[] people, Predicate<Person> tester, Consumer<Person> printer) {
        for (Person person : people) {
            if (tester.test(person)) {
                printer.accept(person);
            }
        }
    }

    private static Consumer<Person> createPrinter(String format) {
        return switch (format) {
            case "name" -> p -> System.out.println(p.getName());
            case "age" -> p -> System.out.println(p.getAge());
            case "name age" -> p -> System.out.println(p.getName() + " - " + p.getAge());
            default -> null;
        };
    }

    private static Predicate<Person> createTester(String condition, int age) {
        return switch (condition) {
            case "younger" -> p -> p.getAge() <= age;
            case "older" -> p -> p.getAge() >= age;
            default -> null;
        };
    }
}
