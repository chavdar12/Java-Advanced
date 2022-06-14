package src.Exercise_005;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        DoublyLinkedList<Integer> linkedList = new DoublyLinkedList<>();
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        while (n-- > 0) {
            String[] commands = sc.nextLine().split("\\s+");
            switch (commands[0]) {
                case "Add" -> {
                    int toAdd = Integer.parseInt(commands[1]);
                    linkedList.add(toAdd);
                }
                case "Remove" -> {
                    int toRemove = Integer.parseInt(commands[1]);
                    linkedList.remove(toRemove);
                }
            }
        }
        System.out.println(linkedList.size());
        linkedList.forEach(e -> System.out.print(e + " "));

    }
}
