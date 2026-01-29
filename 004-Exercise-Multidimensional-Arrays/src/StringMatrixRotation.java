package src;

import java.util.Scanner;

public class StringMatrixRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("[()]+");
        int degrees = Integer.parseInt(input[1]);
        String command = scanner.nextLine();
        int maxLength = 0;
        while (!command.equals("END")) {
            if (command.length() > maxLength) {
                maxLength = command.length();
            }
            command = scanner.nextLine();
        }
        char[][] matrix = new char[command.length()][maxLength];
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                matrix[row][col] = ' ';
            }
        }
        command = scanner.nextLine();
        int row = 0;
        while (!command.equals("END")) {
            for (int col = 0; col < command.length(); col++) {
                matrix[row][col] = command.charAt(col);
            }
            row++;
            command = scanner.nextLine();
        }
        if (degrees == 90) {
            for (int col = 0; col < matrix[0].length; col++) {
                for (int row1 = matrix.length - 1; row1 >= 0; row1--) {
                    System.out.print(matrix[row1][col]);
                }
                System.out.println();
            }
        } else if (degrees == 180) {
            for (int row1 = matrix.length - 1; row1 >= 0; row1--) {
                for (int col = matrix[0].length - 1; col >= 0; col--) {
                    System.out.print(matrix[row1][col]);
                }
                System.out.println();
            }
        } else if (degrees == 270) {
            for (int col = matrix[0].length - 1; col >= 0; col--) {
                for (char[] chars : matrix) {
                    System.out.print(chars[col]);
                }
                System.out.println();
            }
        } else {
            for (char[] chars : matrix) {
                for (int col = 0; col < matrix[0].length; col++) {
                    System.out.print(chars[col]);
                }
                System.out.println();
            }
        }
    }
}
