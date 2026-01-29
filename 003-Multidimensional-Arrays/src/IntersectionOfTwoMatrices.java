package src;

import java.util.Scanner;

import static java.lang.Math.max;
import static java.util.Collections.min;

public class IntersectionOfTwoMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());
        int cols = Integer.parseInt(scanner.nextLine());

        char[][] firstMatrix = new char[rows][cols];
        char[][] secondMatrix = new char[rows][cols];

        for (int row = 0; row < rows; row++) {
            String[] line = scanner.nextLine().split("\\s+");
            for (int col = 0; col < cols; col++) {
                firstMatrix[row][col] = line[col].charAt(0);
            }
        }

        for (int row = 0; row < rows; row++) {
            String[] line = scanner.nextLine().split("\\s+");
            for (int col = 0; col < cols; col++) {
                secondMatrix[row][col] = line[col].charAt(0);
            }
        }

        char[][] intersectionMatrix = new char[rows][cols];

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (firstMatrix[row][col] == secondMatrix[row][col]) {
                    intersectionMatrix[row][col] = firstMatrix[row][col];
                } else {
                    intersectionMatrix[row][col] = '*';
                }
            }
        }

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                System.out.print(intersectionMatrix[row][col] + " ");
            }
            System.out.println();
        }
    }
}