import java.util.Scanner;

public class FindTheRealQueen {
    private static final int SIZE = 8;
    private static final int[][] DIRECTIONS = {{-1, -1}, {-1, 0}, {-1, 1}, {0, -1}, {0, 1}, {1, -1}, {1, 0}, {1, 1}};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] board = new char[SIZE][];
        for (int row = 0; row < SIZE; row++) {
            board[row] = scanner.nextLine().replaceAll("\\s+", "").toCharArray();
        }
        for (int row = 0; row < SIZE; row++) {
            for (int col = 0; col < SIZE; col++) {
                if (board[row][col] == 'q' && !isAttacked(board, row, col)) {
                    System.out.println(row + " " + col);
                    return;
                }
            }
        }
    }

    private static boolean isAttacked(char[][] board, int row, int col) {
        for (int[] direction : DIRECTIONS) {
            int r = row + direction[0];
            int c = col + direction[1];
            while (r >= 0 && r < SIZE && c >= 0 && c < SIZE) {
                if (board[r][c] == 'q') {
                    return true;
                }
                r += direction[0];
                c += direction[1];
            }
        }
        return false;
    }
}
