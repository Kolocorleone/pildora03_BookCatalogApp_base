package model;

import java.util.ArrayList;

public class BookCatalog {
    private ArrayList<Book> bookList;
    private ArrayList<Author> authorList;

    public BookCatalog(){
        bookList = new ArrayList();
        authorList = new ArrayList();
    }

    public void addBook(String title, String editor, int year, Subject subject, Author author){
        Book book = new Book(title, author, subject, editor, year);
        bookList.add(book);
    }

    public Book getBook(int index){
        return bookList.get(index);
    }

    public void removeBook(int index){
        bookList.remove(index);
    }

    public int bookCount(){
        return bookList.size();
    }

    public void addAuthor(String name,String surname){
        Author author = new Author(name, surname);
        authorList.add(author);
    }

    public Author getAuthor(int index){
        return authorList.get(index);
    }

    public void removeAuthor(int index){
        authorList.remove(index);
    }
    public int authorCount(){
        return authorList.size();
    }

}
