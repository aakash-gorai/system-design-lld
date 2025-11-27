package BehaviourableDesignPatterns.IteratorPattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BooksCollectionV2 implements Iterable<Book> {
    private List<Book> bookList = new ArrayList<>();

    public void addBook(Book book) {
        bookList.add(book);
    }

    public List<Book> getBookList() {
        return bookList;
    }

    @Override
    public Iterator<Book> iterator() {
        return bookList.iterator();
    }
}
