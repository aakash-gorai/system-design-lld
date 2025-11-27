package BehaviourableDesignPatterns.IteratorPattern;

import java.util.ArrayList;
import java.util.List;

public class BooksCollectionV1 {
    private List<Book> bookList = new ArrayList<>();

    public void addBook(Book book) {
        bookList.add(book);
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public CustomIterator<Book> createIterator() {
        return new BooksIterator(this.bookList);
    }

    //nested books iterator
    private class BooksIterator implements CustomIterator<Book> {

        private List<Book> books;

        int position = 0;

        BooksIterator(List<Book> books) {
            this.books = books;
        }

        @Override
        public boolean hasNext() {
            return position < books.size();
        }

        @Override
        public Book next() {
            return books.get(position++);
        }
    }
}
