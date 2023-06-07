package org.testorg.bookcollectiontask;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> bookList = new ArrayList<>();
    private String name;
    public Library(String name){
        this.name = name;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addBook(Book book){
        bookList.add(book);
    }

    public void deleteBook(String bookName, String authorName){
        boolean bookNotExist = false;

        for (Book book:bookList) {
            if(book.getTitle().equals(bookName) && book.getAuthor().equals(authorName)){
                bookList.remove(book);
                bookNotExist = false;
                System.out.println("The book is deleted.");
                break;
            }
            else{
                bookNotExist = true;
            }
        }
        if(bookNotExist){
            System.out.println("This book does not exist.");
        }
    }

    public void doesBookExists(String bookName, String authorName){
        boolean bookNotExist = false;

        for (Book book:bookList) {
            if(book.getTitle().equals(bookName) && book.getAuthor().equals(authorName)){
                bookNotExist = false;
                System.out.println("The book exists in library archive.");
                break;
            }
            else{
                bookNotExist = true;
            }
        }
        if(bookNotExist){
            System.out.println("This book does not exist.");
        }
    }

    public void returnNumberOfBooks(){
        System.out.println("In " + name + " library are " + bookList.size() + " books.");
    }

    public void returnAllBooksInLibrary(){
        for (Book book: bookList) {
            System.out.println("Book number - " + (bookList.indexOf(book) + 1));
            System.out.println("Book name - " + book.getTitle());
            System.out.println("Book author - " + book.getAuthor());
        }
    }
}
