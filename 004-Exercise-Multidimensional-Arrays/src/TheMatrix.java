package src;

import java.util.Scanner;

public class TheMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int rows = Integer.parseInt(input[0]);
        int cols = Integer.parseInt(input[1]);
        char[][] matrix = new char[rows][cols];
        for (int row = 0; row < rows; row++) {
            String line = scanner.nextLine();
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = line.charAt(col);
            }
        }
        String[] coordinates = scanner.nextLine().split(" ");
        int startRow = Integer.parseInt(coordinates[0]);
        int startCol = Integer.parseInt(coordinates[1]);
        char symbol = matrix[startRow][startCol];
        fillMatrix(matrix, startRow, startCol, symbol);
        printMatrix(matrix);
    }

    private static void fillMatrix(char[][] matrix, int startRow, int startCol, char symbol) {
        if (startRow < 0 || startRow >= matrix.length || startCol < 0 || startCol >= matrix[startRow].length) {
            return;
        }
        if (matrix[startRow][startCol] != symbol) {
            return;
        }
        matrix[startRow][startCol] = '*';
        fillMatrix(matrix, startRow - 1, startCol, symbol);
        fillMatrix(matrix, startRow + 1, startCol, symbol);
        fillMatrix(matrix, startRow, startCol - 1, symbol);
        fillMatrix(matrix, startRow, startCol + 1, symbol);
    }

    private static void printMatrix(char[][] matrix) {
        for (char[] chars : matrix) {
            for (char aChar : chars) {
                System.out.print(aChar);
            }
            System.out.println();
        }
    }
}
