package src;

import java.util.Scanner;

public class TheHeiganDance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double playerDamage = Double.parseDouble(scanner.nextLine());
        int playerHealth = 18500;
        double heiganHealth = 3000000;
        int playerRow = 7;
        int playerCol = 7;
        boolean isCloud = false;
        String lastSpell = "";
        while (playerHealth > 0) {
            if (isCloud) {
                playerHealth -= 3500;
                isCloud = false;
                if (playerHealth <= 0) {
                    lastSpell = "Plague Cloud";
                    break;
                }
            }
            heiganHealth -= playerDamage;
            if (heiganHealth <= 0) {
                break;
            }
            String[] input = scanner.nextLine().split("\\s+");
            String spell = input[0];
            int targetRow = Integer.parseInt(input[1]);
            int targetCol = Integer.parseInt(input[2]);
            if (isInDamageZone(playerRow, playerCol, targetRow, targetCol)) {
                if (!isInDamageZone(playerRow - 1, playerCol, targetRow, targetCol) && isInside(playerRow - 1)) {
                    playerRow--;
                } else if (!isInDamageZone(playerRow, playerCol + 1, targetRow, targetCol) && isInside(playerCol + 1)) {
                    playerCol++;
                } else if (!isInDamageZone(playerRow + 1, playerCol, targetRow, targetCol) && isInside(playerRow + 1)) {
                    playerRow++;
                } else if (!isInDamageZone(playerRow, playerCol - 1, targetRow, targetCol) && isInside(playerCol - 1)) {
                    playerCol--;
                } else {
                    if (spell.equals("Cloud")) {
                        playerHealth -= 3500;
                        isCloud = true;
                        lastSpell = "Plague Cloud";
                    } else if (spell.equals("Eruption")) {
                        playerHealth -= 6000;
                        lastSpell = "Eruption";
                    }
                }
            }
        }
        if (heiganHealth <= 0) {
            System.out.println("Heigan: Defeated!");
        } else {
            System.out.printf("Heigan: %.2f%n", heiganHealth);
        }
        if (playerHealth <= 0) {
            System.out.printf("Player: Killed by %s %n", lastSpell);
        } else {
            System.out.printf("Player: %d%n", playerHealth);
        }
        System.out.printf("Final position: %d, %d%n", playerRow, playerCol);
    }

    private static boolean isInside(int i) {
        return i >= 0 && i < 15;
    }

    private static boolean isInDamageZone(int playerRow, int playerCol, int targetRow, int targetCol) {
        return playerRow >= targetRow - 1 && playerRow <= targetRow + 1 && playerCol >= targetCol - 1 && playerCol <= targetCol + 1;
    }
}
