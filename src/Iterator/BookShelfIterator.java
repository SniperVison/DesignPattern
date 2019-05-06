package Iterator;

/**
 * Created by huangwenshen 2019/5/6 22:22
 */
public class BookShelfIterator implements Iterator {
    private BookShelf bookShelf;

    private int index;

    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        if (bookShelf.size() > index) {
            return true;
        }
        return false;
    }

    @Override
    public Object next() {
        Book book = bookShelf.getAt(index);
        index++;
        return book;
    }
}
