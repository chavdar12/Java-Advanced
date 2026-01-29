package src;

import java.util.Scanner;

public class Crossfire {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int rows = Integer.parseInt(input[0]);
        int cols = Integer.parseInt(input[1]);
        int[][] matrix = new int[rows][cols];
        int counter = 1;
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = counter;
                counter++;
            }
        }
        String command = scanner.nextLine();
        while (!command.equals("Nuke it from orbit")) {
            String[] tokens = command.split(" ");
            int row = Integer.parseInt(tokens[0]);
            int col = Integer.parseInt(tokens[1]);
            int radius = Integer.parseInt(tokens[2]);
            for (int i = row - radius; i <= row + radius; i++) {
                if (isInBounds(matrix, i, col)) {
                    matrix[i][col] = 0;
                }
            }
            for (int i = col - radius; i <= col + radius; i++) {
                if (isInBounds(matrix, row, i)) {
                    matrix[row][i] = 0;
                }
            }
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[0].length; j++) {
                    if (matrix[i][j] == 0) {
                        for (int k = i; k > 0; k--) {
                            matrix[k][j] = matrix[k - 1][j];
                        }
                        matrix[0][j] = 0;
                    }
                }
            }
            command = scanner.nextLine();
        }
        for (int[] ints : matrix) {
            for (int col = 0; col < matrix[0].length; col++) {
                if (ints[col] != 0) {
                    System.out.print(ints[col] + " ");
                }
            }
            System.out.println();
        }
    }

    private static boolean isInBounds(int[][] matrix, int i, int col) {
        return i >= 0 && i < matrix.length && col >= 0 && col < matrix[0].length;
    }
}

