package model;

public class Book {
    private static int nextID = 0;
    private final int id;
    private String title;
    private String editor;
    private int year;
    private Subject subject;
    private Author author;

    public Book(String title, Author author, Subject subject, String editor, int year) {
        this.id = nextID++;
        this.title = title;
        this.author = author;
        this.subject = subject;
        this.editor = editor;
        this.year = year;
        author.addBook(this);
    }

    public int getID() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public String getEditor() {
        return editor;
    }
    public int getYear() {
        return year;
    }
    public Subject getSubject() {
        return subject;
    }
    public Author getAuthor() {
        return author;
    }
}