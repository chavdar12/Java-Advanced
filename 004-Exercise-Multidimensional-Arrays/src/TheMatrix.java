import java.util.Scanner;

public class TheMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int rows = Integer.parseInt(input[0]);
        char[][] matrix = new char[rows][];
        for (int row = 0; row < rows; row++) {
            matrix[row] = scanner.nextLine().replace(" ", "").toCharArray();
        }
        // last line: "<fillChar> <row> <col>"
        String[] tokens = scanner.nextLine().split(" ");
        char fillChar = tokens[0].charAt(0);
        int startRow = Integer.parseInt(tokens[1]);
        int startCol = Integer.parseInt(tokens[2]);
        char symbol = matrix[startRow][startCol];
        if (symbol != fillChar) {
            fillMatrix(matrix, startRow, startCol, symbol, fillChar);
        }
        for (char[] row : matrix) {
            System.out.println(new String(row));
        }
    }

    private static void fillMatrix(char[][] matrix, int row, int col, char symbol, char fillChar) {
        if (row < 0 || row >= matrix.length || col < 0 || col >= matrix[row].length || matrix[row][col] != symbol) {
            return;
        }
        matrix[row][col] = fillChar;
        fillMatrix(matrix, row - 1, col, symbol, fillChar);
        fillMatrix(matrix, row + 1, col, symbol, fillChar);
        fillMatrix(matrix, row, col - 1, symbol, fillChar);
        fillMatrix(matrix, row, col + 1, symbol, fillChar);
    }
}
