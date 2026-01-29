package src;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FillTheMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(", ");
        int size = Integer.parseInt(input[0]);
        String pattern = input[1];
        int[][] matrix = new int[size][size];
        int counter = 1;
        if (pattern.equals("A")) {
            for (int col = 0; col < matrix[0].length; col++) {
                for (int row = 0; row < matrix.length; row++) {
                    matrix[row][col] = counter;
                    counter++;
                }
            }
        } else if (pattern.equals("B")) {
            for (int col = 0; col < matrix[0].length; col++) {
                if (col % 2 == 0) {
                    for (int row = 0; row < matrix.length; row++) {
                        matrix[row][col] = counter;
                        counter++;
                    }
                } else {
                    for (int row = matrix.length - 1; row >= 0; row--) {
                        matrix[row][col] = counter;
                        counter++;
                    }
                }
            }
        }
        for (int[] ints : matrix) {
            for (int col = 0; col < matrix[0].length; col++) {
                System.out.print(ints[col] + " ");
            }
            System.out.println();
        }
    }
}
