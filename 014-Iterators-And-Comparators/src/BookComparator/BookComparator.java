package src.BookComparator;

import src.Library.Book;

import java.util.Comparator;

public class BookComparator implements Comparator<src.Library.Book> {
    @Override
    public int compare(src.Library.Book o1, Book o2) {
        if (o1.getTitle().compareTo(o2.getTitle()) == 0) {
            return Integer.compare(o1.getYear(), o2.getYear());
        }
        return o1.getTitle().compareTo(o2.getTitle());
    }
}
