package CustomListSorter;


import java.util.List;

public class Sorter {
    public static <T extends Comparable<T>> void sort(CustomList<T> list) {
        List<T> sortedCollection = list.getCollection();
        sortedCollection.sort(null);
        list.setCollection(sortedCollection);
    }
}