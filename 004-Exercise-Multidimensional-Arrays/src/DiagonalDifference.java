package src;

import java.util.Arrays;
import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[size][size];
        for (int row = 0; row < size; row++) {
            matrix[row] = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }
        int primaryDiagonalSum = 0;
        int secondaryDiagonalSum = 0;
        for (int i = 0; i < size; i++) {
            primaryDiagonalSum += matrix[i][i];
            secondaryDiagonalSum += matrix[i][size - 1 - i];
        }
        System.out.println(Math.abs(primaryDiagonalSum - secondaryDiagonalSum));
    }
}
