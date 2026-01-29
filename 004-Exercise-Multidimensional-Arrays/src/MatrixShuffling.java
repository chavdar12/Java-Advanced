package src;

import java.util.Scanner;

public class MatrixShuffling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int rows = Integer.parseInt(input[0]);
        int cols = Integer.parseInt(input[1]);
        String[][] matrix = new String[rows][cols];
        for (int row = 0; row < rows; row++) {
            matrix[row] = scanner.nextLine().split(" ");
        }
        String command = scanner.nextLine();
        while (!command.equals("END")) {
            String[] tokens = command.split(" ");
            if (tokens.length != 5 || !tokens[0].equals("swap")) {
                System.out.println("Invalid input!");
            } else {
                int row1 = Integer.parseInt(tokens[1]);
                int col1 = Integer.parseInt(tokens[2]);
                int row2 = Integer.parseInt(tokens[3]);
                int col2 = Integer.parseInt(tokens[4]);
                if (row1 < 0 || row1 >= rows || row2 < 0 || row2 >= rows || col1 < 0 || col1 >= cols || col2 < 0 || col2 >= cols) {
                    System.out.println("Invalid input!");
                } else {
                    String temp = matrix[row1][col1];
                    matrix[row1][col1] = matrix[row2][col2];
                    matrix[row2][col2] = temp;
                    for (String[] strings : matrix) {
                        for (int col = 0; col < matrix[0].length; col++) {
                            System.out.print(strings[col] + " ");
                        }
                        System.out.println();
                    }
                }
            }
            command = scanner.nextLine();
        }
    }
}
