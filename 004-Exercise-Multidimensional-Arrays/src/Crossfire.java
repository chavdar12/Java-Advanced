import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Crossfire {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int rows = Integer.parseInt(input[0]);
        int cols = Integer.parseInt(input[1]);
        // rows shrink as cells are destroyed, so the matrix is jagged
        List<List<Integer>> matrix = new ArrayList<>();
        int counter = 1;
        for (int row = 0; row < rows; row++) {
            List<Integer> line = new ArrayList<>();
            for (int col = 0; col < cols; col++) {
                line.add(counter++);
            }
            matrix.add(line);
        }
        String command = scanner.nextLine();
        while (!command.equals("Nuke it from orbit")) {
            String[] tokens = command.split(" ");
            int row = Integer.parseInt(tokens[0]);
            int col = Integer.parseInt(tokens[1]);
            int radius = Integer.parseInt(tokens[2]);
            for (int r = row - radius; r <= row + radius; r++) {
                destroy(matrix, r, col);
            }
            for (int c = col - radius; c <= col + radius; c++) {
                destroy(matrix, row, c);
            }
            matrix.forEach(line -> line.removeIf(Objects::isNull));
            matrix.removeIf(List::isEmpty);
            command = scanner.nextLine();
        }
        for (List<Integer> line : matrix) {
            System.out.println(line.stream().map(String::valueOf).collect(Collectors.joining(" ")));
        }
    }

    private static void destroy(List<List<Integer>> matrix, int row, int col) {
        if (row >= 0 && row < matrix.size() && col >= 0 && col < matrix.get(row).size()) {
            matrix.get(row).set(col, null);
        }
    }
}
