package BehaviourableDesignPatterns.IteratorPattern;

import java.util.Iterator;

public class ClientV2 {
    public static void main(String[] args) {
        BooksCollectionV2 booksCollectionV2 = new BooksCollectionV2();
        booksCollectionV2.addBook(new Book("C++"));
        booksCollectionV2.addBook(new Book("Python"));
        booksCollectionV2.addBook(new Book("Java"));

        Iterator<Book> iterator = booksCollectionV2.iterator();
        while(iterator.hasNext()) {
            Book book = iterator.next();
            System.out.println(book);
        }
    }
}
