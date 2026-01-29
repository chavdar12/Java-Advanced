package src;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistoryUpgrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<String> browserHistory = new ArrayDeque<>();
        ArrayDeque<String> forwardHistory = new ArrayDeque<>();
        String instruction = scanner.nextLine();

        while (!instruction.equals("Home")) {
            if (instruction.equals("back")) {
                if (browserHistory.size() <= 1) {
                    System.out.println("no previous URLs");
                } else {
                    forwardHistory.push(browserHistory.pop());
                    System.out.println(browserHistory.peek());
                }
            } else if (instruction.equals("forward")) {
                if (forwardHistory.isEmpty()) {
                    System.out.println("no next URLs");
                } else {
                    browserHistory.push(forwardHistory.pop());
                    System.out.println(browserHistory.peek());
                }
            } else {
                browserHistory.push(instruction);
                System.out.println(browserHistory.peek());
                forwardHistory.clear();
            }
            instruction = scanner.nextLine();
        }
    }
}
