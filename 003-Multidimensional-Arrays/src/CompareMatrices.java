package src;

import java.util.Arrays;
import java.util.Scanner;

public class CompareMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] firstMatrix = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[] secondMatrix = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        boolean areEqual = true;

        if (firstMatrix.length == secondMatrix.length) {
            for (int i = 0; i < firstMatrix.length; i++) {
                if (firstMatrix[i] != secondMatrix[i]) {
                    areEqual = false;
                    break;
                }
            }
        } else {
            areEqual = false;
        }

        if (areEqual) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }
    }
}
