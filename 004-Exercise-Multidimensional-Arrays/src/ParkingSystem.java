import java.util.Scanner;

public class ParkingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int rows = Integer.parseInt(input[0]);
        int cols = Integer.parseInt(input[1]);
        boolean[][] parkingLot = new boolean[rows][cols];
        String command = scanner.nextLine();
        while (!command.equals("stop")) {
            String[] tokens = command.split(" ");
            int entryRow = Integer.parseInt(tokens[0]);
            int targetRow = Integer.parseInt(tokens[1]);
            int targetCol = Integer.parseInt(tokens[2]);
            int spot = findSpot(parkingLot[targetRow], targetCol);
            if (spot == -1) {
                System.out.println("Row " + targetRow + " full");
            } else {
                parkingLot[targetRow][spot] = true;
                System.out.println(Math.abs(entryRow - targetRow) + spot + 1);
            }
            command = scanner.nextLine();
        }
    }

    // Column 0 is the road, so spots start at 1; on a tie the spot closer to the entrance (left) wins
    private static int findSpot(boolean[] row, int targetCol) {
        if (!row[targetCol]) {
            return targetCol;
        }
        for (int distance = 1; distance < row.length; distance++) {
            int left = targetCol - distance;
            int right = targetCol + distance;
            if (left >= 1 && !row[left]) {
                return left;
            }
            if (right < row.length && !row[right]) {
                return right;
            }
        }
        return -1;
    }
}
