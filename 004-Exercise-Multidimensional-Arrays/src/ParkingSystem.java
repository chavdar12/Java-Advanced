package src;

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
            if (parkingLot[targetRow][targetCol]) {
                int distance = 1;
                boolean foundPlace = false;
                for (int i = 1; i < parkingLot[targetRow].length; i++) {
                    if (targetCol - i >= 0 && !parkingLot[targetRow][targetCol - i]) {
                        targetCol -= i;
                        distance += i;
                        foundPlace = true;
                        break;
                    } else if (targetCol + i < parkingLot[targetRow].length && !parkingLot[targetRow][targetCol + i]) {
                        targetCol += i;
                        distance += i;
                        foundPlace = true;
                        break;
                    }
                }
                if (foundPlace) {
                    parkingLot[targetRow][targetCol] = true;
                    System.out.println(distance + (targetRow + targetCol + entryRow));
                } else {
                    System.out.println("Row " + targetRow + " full");
                }
            } else {
                parkingLot[targetRow][targetCol] = true;
                System.out.println(targetRow + 1 + targetCol + entryRow);
            }
            command = scanner.nextLine();
        }
    }
}
