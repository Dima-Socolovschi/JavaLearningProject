package org.testorg.bookcollectiontask;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Library lib1 = new Library("Library One");
        Library lib2 = new Library("Library Two");

        lib1.addBook(new Book("Book 1", "Author 1"));
        lib1.addBook(new Book("Book 2", "Author 2"));
        lib1.addBook(new Book("Book 3", "Author 3"));

        lib1.returnAllBooksInLibrary();
        lib1.returnNumberOfBooks();

        lib1.deleteBook("Book 2", "Author 2");

        lib1.returnAllBooksInLibrary();
        lib1.returnNumberOfBooks();

        lib1.doesBookExists("Book 1", "Author 1");

        lib1.doesBookExists("Book 2", "Author 2");

        lib2.addBook(new Book("Book 1", "Author 1"));
        lib2.addBook(new Book("Book 2", "Author 2"));
        lib2.addBook(new Book("Book 3", "Author 3"));

        Map<String, Library> libraryList = new HashMap<>();

        libraryList.put("Address 1", lib1);
        libraryList.put("Address 2", lib2);

        libraryList.get("Address 2").returnAllBooksInLibrary();

        int[] testArray = {-1, 0, 2, 10, -8, 7, 5, -3, 3};

        IntNumberArrayService.findMin(testArray);
        IntNumberArrayService.findMed(testArray);
    }
}
