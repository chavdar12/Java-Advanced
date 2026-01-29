package src;

import java.util.Arrays;
import java.util.Scanner;

public class FindTheRealQueen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[][] matrix = new char[8][8];

        for (int row = 0; row < 8; row++) {
            matrix[row] = scanner.nextLine().replaceAll("\\s+", "").toCharArray();
        }

        int[] queenPosition = new int[2];

        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                if (matrix[row][col] == 'q') {
                    queenPosition[0] = row;
                    queenPosition[1] = col;
                    break;
                }
            }
        }

        boolean isQueen = true;

        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                if (matrix[row][col] == 'q' && (row != queenPosition[0] || col != queenPosition[1])) {
                    isQueen = false;
                    break;
                }
            }
        }

        if (isQueen) {
            for (int row = 0; row < 8; row++) {
                for (int col = 0; col < 8; col++) {
                    if (row == queenPosition[0] || col == queenPosition[1]) {
                        if (matrix[row][col] == 'q' && (row != queenPosition[0] || col != queenPosition[1])) {
                            isQueen = false;
                            break;
                        }
                    }
                }
            }
        }

        if (isQueen) {
            for (int row = 0; row < 8; row++) {
                for (int col = 0; col < 8; col++) {
                    if (Math.abs(row - queenPosition[0]) == Math.abs(col - queenPosition[1])) {
                        if (matrix[row][col] == 'q' && (row != queenPosition[0] || col != queenPosition[1])) {
                            isQueen = false;
                            break;
                        }
                    }
                }
            }
        }

        if (isQueen) {
            System.out.println(Arrays.toString(queenPosition).replaceAll("[\\[\\],]", ""));
        } else {
            System.out.println("The queen is not alone");
        }
    }
}
