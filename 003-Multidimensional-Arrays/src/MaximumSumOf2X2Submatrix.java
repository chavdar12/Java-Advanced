package src;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumSumOf2X2Submatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimensions = Arrays.stream(scanner.nextLine().split(", "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int rows = dimensions[0];
        int cols = dimensions[1];

        int[][] matrix = new int[rows][cols];

        for (int row = 0; row < rows; row++) {
            String[] line = scanner.nextLine().split(", ");
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = Integer.parseInt(line[col]);
            }
        }

        int maxSum = Integer.MIN_VALUE;
        int maxRow = 0;
        int maxCol = 0;

        for (int row = 0; row < rows - 1; row++) {
            for (int col = 0; col < cols - 1; col++) {
                int sum = matrix[row][col] + matrix[row][col + 1] +
                        matrix[row + 1][col] + matrix[row + 1][col + 1];

                if (sum > maxSum) {
                    maxSum = sum;
                    maxRow = row;
                    maxCol = col;
                }
            }
        }

        System.out.println(matrix[maxRow][maxCol] + " " + matrix[maxRow][maxCol + 1]);
        System.out.println(matrix[maxRow + 1][maxCol] + " " + matrix[maxRow + 1][maxCol + 1]);
        System.out.println(maxSum);
    }
}
