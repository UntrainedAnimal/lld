package org.example.design_patterns.Iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BookShelf implements Container<Book>{

    List<Book> books ;

    public BookShelf() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book b){
        books.add(b);
    }
    public void removeBook(Book b){
        books.remove(b);
    }
    public Book getBook(String bookName){
        Optional<Book> first = books.stream().filter(b -> b.name.equalsIgnoreCase(bookName)).findFirst();
        return first.orElse(null);
    }

    @Override
    public Iterator<Book> getIterator() {
        return new BookShelfIterator();
    }

    private class BookShelfIterator implements Iterator<Book>{

        private int index;
        @Override
        public boolean hasNext() {
            return index<books.size();
        }

        @Override
        public Book next() {
            if(this.hasNext()){
                return books.get(index++);
            }
            return null;
        }
    }
}
