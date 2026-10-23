import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringMatrixRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // input looks like "Rotate(90)"; any multiple of 90 is allowed
        int degrees = Integer.parseInt(scanner.nextLine().replaceAll("\\D", "")) % 360;
        List<String> lines = new ArrayList<>();
        String line = scanner.nextLine();
        while (!line.equals("END")) {
            lines.add(line);
            line = scanner.nextLine();
        }
        int rows = lines.size();
        int cols = lines.stream().mapToInt(String::length).max().orElse(0);
        StringBuilder output = new StringBuilder();
        switch (degrees) {
            case 90 -> {
                for (int col = 0; col < cols; col++) {
                    for (int row = rows - 1; row >= 0; row--) {
                        output.append(charAt(lines, row, col));
                    }
                    output.append(System.lineSeparator());
                }
            }
            case 180 -> {
                for (int row = rows - 1; row >= 0; row--) {
                    for (int col = cols - 1; col >= 0; col--) {
                        output.append(charAt(lines, row, col));
                    }
                    output.append(System.lineSeparator());
                }
            }
            case 270 -> {
                for (int col = cols - 1; col >= 0; col--) {
                    for (int row = 0; row < rows; row++) {
                        output.append(charAt(lines, row, col));
                    }
                    output.append(System.lineSeparator());
                }
            }
            default -> {
                for (int row = 0; row < rows; row++) {
                    for (int col = 0; col < cols; col++) {
                        output.append(charAt(lines, row, col));
                    }
                    output.append(System.lineSeparator());
                }
            }
        }
        System.out.print(output);
    }

    // shorter lines are padded with spaces to the longest line
    private static char charAt(List<String> lines, int row, int col) {
        String line = lines.get(row);
        return col < line.length() ? line.charAt(col) : ' ';
    }
}
