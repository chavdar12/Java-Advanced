package src.BookComparator;

import src.Library.Book;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        src.Library.Book bookOne = new src.Library.Book("Animal Farm", 2003, "George Orwell");
        src.Library.Book bookThree = new src.Library.Book("The Documents in the Case", 2002);
        src.Library.Book bookTwo = new src.Library.Book("The Documents in the Case", 1930, "Dorothy Sayers", "Robert Eustace");

        List<src.Library.Book> books = new ArrayList<>();
        books.add(bookOne);
        books.add(bookTwo);
        books.add(bookThree);

        books.sort(new BookComparator());

        for (Book book : books) {
            System.out.println(book.getTitle() + book.getYear());
        }

    }
}
