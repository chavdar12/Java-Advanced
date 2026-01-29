package src;

import java.text.DecimalFormat;
import java.util.*;

public class ParkingLot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(", ");
        int rows = Integer.parseInt(input[0]);
        int cols = Integer.parseInt(input[1]);
        char[][] parkingLot = new char[rows][cols];
        for (int i = 0; i < rows; i++) {
            String[] line = scanner.nextLine().split(", ");
            for (int j = 0; j < cols; j++) {
                parkingLot[i][j] = line[j].charAt(0);
            }
        }
        String command = scanner.nextLine();
        while (!command.equals("stop")) {
            String[] tokens = command.split(" ");
            int entryRow = Integer.parseInt(tokens[0]);
            int desiredRow = Integer.parseInt(tokens[1]);
            int desiredCol = Integer.parseInt(tokens[2]);
            if (parkingLot[desiredRow][desiredCol] == 'O') {
                System.out.println("Row " + desiredRow + " full");
            } else {
                int distance = Math.abs(desiredRow - entryRow) + desiredCol + 1;
                System.out.println(distance);
                parkingLot[desiredRow][desiredCol] = 'O';
            }
            command = scanner.nextLine();
        }
    }
}
