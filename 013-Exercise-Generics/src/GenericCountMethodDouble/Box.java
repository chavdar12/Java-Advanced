package src.GenericCountMethodDouble;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Comparable> {
    private final List<T> collection;

    public Box() {
        this.collection = new ArrayList<>();
    }

    public static <T extends Comparable> int compare(List<T> collection, T element) {
        int countOfGreaterElements = 0;
        for (T currentElement : collection) {
            if (currentElement.compareTo(element) > 0) {
                countOfGreaterElements++;
            }
        }
        return countOfGreaterElements;
    }

    public List<T> getCollection() {
        return collection;
    }
}