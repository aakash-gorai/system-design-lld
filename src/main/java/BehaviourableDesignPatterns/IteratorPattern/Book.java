package BehaviourableDesignPatterns.IteratorPattern;

public class Book {
    private String title;

    Book(String title) {
        this.title = title;
    }

    public String getBookTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Book " + title;
    }
}
