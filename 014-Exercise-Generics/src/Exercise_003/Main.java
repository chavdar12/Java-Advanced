package src.Exercise_003;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Tuple> tupleList = new ArrayList<>();

        String[] firstLine = sc.nextLine().split("\\s+");
        String[] secondLine = sc.nextLine().split("\\s+");
        String[] thirdLine = sc.nextLine().split("\\s+");

        Tuple<String, String> firstTuple = new Tuple<>(firstLine[0] + " " + firstLine[1], firstLine[2]);
        Tuple<String, Integer> secondTuple = new Tuple<>(secondLine[0], Integer.parseInt(secondLine[1]));
        Tuple<String, Double> thirdTuple = new Tuple<>(thirdLine[0], Double.parseDouble(thirdLine[1]));

        tupleList.add(firstTuple);
        tupleList.add(secondTuple);
        tupleList.add(thirdTuple);

        tupleList.forEach(System.out::println);
    }
}
