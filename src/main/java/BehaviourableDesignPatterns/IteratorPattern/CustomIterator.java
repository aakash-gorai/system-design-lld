package BehaviourableDesignPatterns.IteratorPattern;

public interface CustomIterator<T> {
    boolean hasNext();
    T next();
}
