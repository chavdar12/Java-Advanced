package src;

import java.util.Scanner;

public class RadioactiveMutantVampireBunnies {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int rows = Integer.parseInt(input[0]);
        int cols = Integer.parseInt(input[1]);
        char[][] matrix = new char[rows][cols];
        int playerRow = 0;
        int playerCol = 0;
        for (int row = 0; row < rows; row++) {
            String line = scanner.nextLine();
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = line.charAt(col);
                if (matrix[row][col] == 'P') {
                    playerRow = row;
                    playerCol = col;
                }
            }
        }
        String commands = scanner.nextLine();
        boolean isWon = false;
        boolean isDead = false;
        for (int i = 0; i < commands.length(); i++) {
            char command = commands.charAt(i);
            switch (command) {
                case 'U' -> {
                    if (playerRow - 1 >= 0) {
                        playerRow--;
                    } else {
                        isWon = true;
                    }
                }
                case 'D' -> {
                    if (playerRow + 1 < rows) {
                        playerRow++;
                    } else {
                        isWon = true;
                    }
                }
                case 'L' -> {
                    if (playerCol - 1 >= 0) {
                        playerCol--;
                    } else {
                        isWon = true;
                    }
                }
                case 'R' -> {
                    if (playerCol + 1 < cols) {
                        playerCol++;
                    } else {
                        isWon = true;
                    }
                }
            }
            if (isWon) {
                break;
            }
            int[][] bunnies = new int[rows * cols][2];
            int bunnyIndex = 0;
            for (int row = 0; row < rows; row++) {
                for (int col = 0; col < cols; col++) {
                    if (matrix[row][col] == 'B') {
                        bunnies[bunnyIndex][0] = row;
                        bunnies[bunnyIndex][1] = col;
                        bunnyIndex++;
                    }
                }
            }
            for (int j = 0; j < bunnyIndex; j++) {
                int bunnyRow = bunnies[j][0];
                int bunnyCol = bunnies[j][1];
                if (bunnyRow - 1 >= 0) {
                    if (matrix[bunnyRow - 1][bunnyCol] == 'P') {
                        isDead = true;
                    }
                    matrix[bunnyRow - 1][bunnyCol] = 'B';
                }
                if (bunnyRow + 1 < rows) {
                    if (matrix[bunnyRow + 1][bunnyCol] == 'P') {
                        isDead = true;
                    }
                    matrix[bunnyRow + 1][bunnyCol] = 'B';
                }
                if (bunnyCol - 1 >= 0) {
                    if (matrix[bunnyRow][bunnyCol - 1] == 'P') {
                        isDead = true;
                    }
                    matrix[bunnyRow][bunnyCol - 1] = 'B';
                }
                if (bunnyCol + 1 < cols) {
                    if (matrix[bunnyRow][bunnyCol + 1] == 'P') {
                        isDead = true;
                    }
                    matrix[bunnyRow][bunnyCol + 1] = 'B';
                }
            }
            if (isDead) {
                break;
            }
        }
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                System.out.print(matrix[row][col]);
            }
            System.out.println();
        }
        if (isWon) {
            System.out.printf("won: %d %d", playerRow, playerCol);
        } else if (isDead) {
            System.out.printf("dead: %d %d", playerRow, playerCol);
        }
    }
}
