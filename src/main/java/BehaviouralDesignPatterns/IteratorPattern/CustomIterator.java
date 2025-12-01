package BehaviouralDesignPatterns.IteratorPattern;

public interface CustomIterator<T> {
    boolean hasNext();
    T next();
}
