package src;

import java.util.ArrayDeque;
import java.util.Scanner;

public class SimpleTextEditor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String text = "";
        ArrayDeque<String> history = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {

            String[] cmd = scanner.nextLine().split(" ");

            switch (cmd[0]) {
                case "1" -> {
                    history.push(text);
                    text += cmd[1];
                }
                case "2" -> {
                    history.push(text);
                    int count = Integer.parseInt(cmd[1]);
                    for (int j = 0; j < count; j++) {

                        text = text.substring(0, text.length() - 1);
                    }
                }
                case "3" -> {
                    int index = Integer.parseInt(cmd[1]);
                    System.out.println(text.charAt(index - 1));
                }
                case "4" -> text = history.pop();
            }
        }
    }
}
