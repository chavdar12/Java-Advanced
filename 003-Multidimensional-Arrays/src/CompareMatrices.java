import java.util.Arrays;
import java.util.Scanner;

public class CompareMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] firstMatrix = readMatrix(scanner);
        int[][] secondMatrix = readMatrix(scanner);
        System.out.println(Arrays.deepEquals(firstMatrix, secondMatrix) ? "equal" : "not equal");
    }

    private static int[][] readMatrix(Scanner scanner) {
        int rows = Integer.parseInt(scanner.nextLine().trim().split("\\s+")[0]);
        int[][] matrix = new int[rows][];
        for (int row = 0; row < rows; row++) {
            matrix[row] = Arrays.stream(scanner.nextLine().trim().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }
        return matrix;
    }
}
