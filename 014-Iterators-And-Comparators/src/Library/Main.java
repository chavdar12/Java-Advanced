package src.Library;


public class Main {
    public static void main(String[] args) {
        src.Library.Book bookOne = new src.Library.Book("Animal Farm", 2003, "George Orwell");
        src.Library.Book bookThree = new src.Library.Book("The Documents in the Case", 2002);
        src.Library.Book bookTwo = new src.Library.Book("The Documents in the Case", 1930, "Dorothy Sayers", "Robert Eustace");

        Library<src.Library.Book> library = new Library<src.Library.Book>(bookOne, bookTwo, bookThree);

        for (Book book : library) {
            System.out.println(book.getTitle());
        }
    }
}
