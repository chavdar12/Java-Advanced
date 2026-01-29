package src;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixOfPalindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] input = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int rows = input[0];
        int cols = input[1];
        String[][] matrix = new String[rows][cols];
        char firstAndLastLetter = 'a';
        for (int row = 0; row < rows; row++) {
            char middleLetter = firstAndLastLetter;
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = "" + firstAndLastLetter + middleLetter + firstAndLastLetter;
                middleLetter++;
            }
            firstAndLastLetter++;
        }
        for (String[] strings : matrix) {
            for (int col = 0; col < matrix[0].length; col++) {
                System.out.print(strings[col] + " ");
            }
            System.out.println();
        }
    }
}
