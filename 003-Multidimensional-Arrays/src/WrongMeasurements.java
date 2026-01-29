package src;

import java.util.Arrays;
import java.util.Scanner;

public class WrongMeasurements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());
        int cols = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[rows][cols];

        for (int row = 0; row < rows; row++) {
            matrix[row] = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }

        int[] wrongValue = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int wrongValueRow = wrongValue[0];
        int wrongValueCol = wrongValue[1];

        int wrongValueReal = matrix[wrongValueRow][wrongValueCol];

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (matrix[row][col] == wrongValueReal) {
                    int sum = 0;

                    if (row - 1 >= 0 && matrix[row - 1][col] != wrongValueReal) {
                        sum += matrix[row - 1][col];
                    }

                    if (row + 1 < rows && matrix[row + 1][col] != wrongValueReal) {
                        sum += matrix[row + 1][col];
                    }

                    if (col - 1 >= 0 && matrix[row][col - 1] != wrongValueReal) {
                        sum += matrix[row][col - 1];
                    }

                    if (col + 1 < cols && matrix[row][col + 1] != wrongValueReal) {
                        sum += matrix[row][col + 1];
                    }

                    matrix[row][col] = sum;
                }
            }
        }

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
}
