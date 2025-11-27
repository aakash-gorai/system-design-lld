package BehaviourableDesignPatterns.IteratorPattern;

public class ClientV1 {
    public static void main(String[] args) {
        BooksCollectionV1 booksCollectionV1 = new BooksCollectionV1();
        booksCollectionV1.addBook(new Book("C++"));
        booksCollectionV1.addBook(new Book("Python"));
        booksCollectionV1.addBook(new Book("Java"));

        CustomIterator<Book> iterator = booksCollectionV1.createIterator();
        while(iterator.hasNext()) {
            Book book = iterator.next();
            System.out.println(book);
        }
    }
}
