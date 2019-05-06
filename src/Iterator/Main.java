package Iterator;

/**
 * Created by huangwenshen 2019/5/6 22:34
 */
public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4) {{
            add(new Book("A"));
            add(new Book("B"));
            add(new Book("C"));
            add(new Book("D"));
        }};
        Iterator iterator = bookShelf.iterator();
        while (iterator.hasNext()) {
            Book book = (Book) iterator.next();
            System.out.println(book.getName());
        }
    }
}
