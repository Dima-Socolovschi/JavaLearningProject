package org.testorg.bookcollectiontask;

public class Book {

    public Book(String title, String author){
        this.author = author;
        this.title = title;
    }
    private String title;
    private String author;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
