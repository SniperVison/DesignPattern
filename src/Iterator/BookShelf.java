package Iterator;

/**
 * Created by huangwenshen 2019/5/6 22:24
 */
public class BookShelf implements Aggregate {

    private Book[] books;

    private int last = 0;

    public BookShelf(int maxSize) {
        this.books = new Book[maxSize];
    }

    public Iterator iterator() {
        return new BookShelfIterator(this);
    }

    public Book getAt(int index) {
        return this.books[index];
    }

    public int size() {
        return last;
    }

    public void add(Book book) {
        this.books[last] = book;
        last++;
    }
}
