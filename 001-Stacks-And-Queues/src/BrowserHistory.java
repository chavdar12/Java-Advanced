package src;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> browserHistory = new ArrayDeque<>();
        String instruction = scanner.nextLine();

        while (!instruction.equals("Home")) {
            if (!instruction.equals("back")) {
                browserHistory.push(instruction);
                System.out.println(browserHistory.peek());
            } else {
                if(browserHistory.size() <= 1) {
                    System.out.println("no previous URLs");
                } else {
                    browserHistory.pop();
                    System.out.println(browserHistory.peek());
                }
            }
            instruction = scanner.nextLine();
        }
    }
}
