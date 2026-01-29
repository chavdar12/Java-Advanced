package src;

import java.util.Scanner;

public class ReverseMatrixDiagonals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int rows = Integer.parseInt(input[0]);
        int cols = Integer.parseInt(input[1]);
        int[][] matrix = new int[rows][cols];
        for (int row = 0; row < rows; row++) {
            String[] line = scanner.nextLine().split(" ");
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = Integer.parseInt(line[col]);
            }
        }
        int row = rows - 1;
        int col = cols - 1;
        while (row >= 0) {
            int currentRow = row;
            int currentCol = col;
            while (currentRow < rows && currentCol < cols) {
                System.out.print(matrix[currentRow][currentCol] + " ");
                currentRow++;
                currentCol++;
            }
            System.out.println();
            if (col > 0) {
                col--;
            } else {
                row--;
            }
        }
    }
}
