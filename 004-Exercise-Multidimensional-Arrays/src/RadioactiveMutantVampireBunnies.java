import java.util.ArrayList;
import java.util.List;
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
        for (int i = 0; i < commands.length() && !isWon && !isDead; i++) {
            int nextRow = playerRow;
            int nextCol = playerCol;
            switch (commands.charAt(i)) {
                case 'U' -> nextRow--;
                case 'D' -> nextRow++;
                case 'L' -> nextCol--;
                case 'R' -> nextCol++;
            }
            matrix[playerRow][playerCol] = '.';
            if (nextRow < 0 || nextRow >= rows || nextCol < 0 || nextCol >= cols) {
                isWon = true;
            } else {
                playerRow = nextRow;
                playerCol = nextCol;
                if (matrix[playerRow][playerCol] == 'B') {
                    isDead = true;
                } else {
                    matrix[playerRow][playerCol] = 'P';
                }
            }
            spreadBunnies(matrix);
            if (!isWon && matrix[playerRow][playerCol] == 'B') {
                isDead = true;
            }
        }
        for (char[] row : matrix) {
            System.out.println(new String(row));
        }
        if (isWon) {
            System.out.printf("won: %d %d%n", playerRow, playerCol);
        } else if (isDead) {
            System.out.printf("dead: %d %d%n", playerRow, playerCol);
        }
    }

    private static void spreadBunnies(char[][] matrix) {
        List<int[]> bunnies = new ArrayList<>();
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] == 'B') {
                    bunnies.add(new int[]{row, col});
                }
            }
        }
        for (int[] bunny : bunnies) {
            infect(matrix, bunny[0] - 1, bunny[1]);
            infect(matrix, bunny[0] + 1, bunny[1]);
            infect(matrix, bunny[0], bunny[1] - 1);
            infect(matrix, bunny[0], bunny[1] + 1);
        }
    }

    private static void infect(char[][] matrix, int row, int col) {
        if (row >= 0 && row < matrix.length && col >= 0 && col < matrix[row].length) {
            matrix[row][col] = 'B';
        }
    }
}
