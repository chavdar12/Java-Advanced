package src.ComparableBook;

import src.Library.Book;

public class Main {
    public static void main(String[] args) {
        src.Library.Book bookOne = new src.Library.Book("Animal Farm", 2003, "George Orwell");
        src.Library.Book bookThree = new src.Library.Book("The Documents in the Case", 2002);
        src.Library.Book bookTwo = new Book("The Documents in the Case", 1930, "Dorothy Sayers", "Robert Eustace");

        if (bookOne.compareTo(bookTwo) > 0) {
            System.out.println(String.format("%s is before %s", bookOne, bookTwo));
        } else if (bookOne.compareTo(bookTwo) < 0) {
            System.out.println(String.format("%s is before %s", bookTwo, bookOne));
        } else {
            System.out.println("Book are equal");
        }
    }
}
