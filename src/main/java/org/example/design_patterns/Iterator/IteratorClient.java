package org.example.design_patterns.Iterator;

public class IteratorClient {
    public static void main(String[] args) {
        BookShelf bs = new BookShelf();
        bs.addBook(new Book("Physics"));
        bs.addBook(new Book("Chemistry"));
        bs.addBook(new Book("Math"));
        bs.addBook(new Book("Biology"));


        Iterator<Book> iterator = bs.getIterator();

        while(iterator.hasNext()){
            Book book = iterator.next();
            System.out.println(book.name);
            bs.removeBook(bs.getBook("Chemistry"));

        }

    }
}
