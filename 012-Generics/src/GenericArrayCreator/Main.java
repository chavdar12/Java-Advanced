package src.GenericArrayCreator;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] strings = ArrayCreator.create(10, "none");
        System.out.println(Arrays.toString(strings));
        Integer[] integers = ArrayCreator.create(Integer.class, 10, 0);
        System.out.println(Arrays.toString(integers));
    }
}
