package src;

import java.util.ArrayDeque;
import java.util.Scanner;

public class WarNumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] firstPlayerCards = scanner.nextLine().split(" ");
        String[] secondPlayerCards = scanner.nextLine().split(" ");
        ArrayDeque<Integer> firstPlayer = new ArrayDeque<>();
        ArrayDeque<Integer> secondPlayer = new ArrayDeque<>();
        for (String card : firstPlayerCards) {
            firstPlayer.offer(Integer.parseInt(card));
        }
        for (String card : secondPlayerCards) {
            secondPlayer.offer(Integer.parseInt(card));
        }
        int rounds = 50;
        while (rounds-- > 0 && !firstPlayer.isEmpty() && !secondPlayer.isEmpty()) {
            int firstPlayerCard = firstPlayer.poll();
            int secondPlayerCard = secondPlayer.poll();
            if (firstPlayerCard > secondPlayerCard) {
                firstPlayer.offer(firstPlayerCard);
                firstPlayer.offer(secondPlayerCard);
            } else if (secondPlayerCard > firstPlayerCard) {
                secondPlayer.offer(secondPlayerCard);
                secondPlayer.offer(firstPlayerCard);
            }
        }
        if (firstPlayer.size() > secondPlayer.size()) {
            System.out.println("First player wins! Sum: " + firstPlayer.stream().mapToInt(Integer::intValue).sum());
        } else if (secondPlayer.size() > firstPlayer.size()) {
            System.out.println("Second player wins! Sum: " + secondPlayer.stream().mapToInt(Integer::intValue).sum());
        } else {
            System.out.println("Draw!");
        }
    }
}
