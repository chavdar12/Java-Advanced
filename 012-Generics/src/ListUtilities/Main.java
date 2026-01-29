package src.ListUtilities;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ListUtils listUtils = new ListUtils();
        System.out.println(ListUtils.getMax(List.of(1, 2, 3, 4, 5)));
        System.out.println(ListUtils.getMin(List.of(1, 2, 3, 4, 5)));
    }
}
