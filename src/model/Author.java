package model;

import java.util.ArrayList;
import java.util.List;

public class Author {
    private String name;
    private String surname;
    private List<Book> books;

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.books = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
    public String getFullName() {
        return name + " " + surname;
    }
    public void addBook(Book book) {
        this.books.add(book);
    }
    public int bookCount() {
        return this.books.size();
    }
    public Book getBook(int index) {
        return this.books.get(index);
    }
}
