package src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PrintDiagonalsOfSquareMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[rows][rows];

        for (int row = 0; row < rows; row++) {
            int[] line = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            System.arraycopy(line, 0, matrix[row], 0, rows);
        }

        List<Integer> firstDiagonal = new ArrayList<>();
        List<Integer> secondDiagonal = new ArrayList<>();

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < rows; col++) {
                if (row == col) {
                    firstDiagonal.add(matrix[row][col]);
                }
                if (row + col == rows - 1) {
                    secondDiagonal.add(matrix[row][col]);
                }
            }
        }

        System.out.println(firstDiagonal.toString().replaceAll("[\\[\\],]", ""));
        System.out.println(secondDiagonal.toString().replaceAll("[\\[\\],]", ""));
    }
}
