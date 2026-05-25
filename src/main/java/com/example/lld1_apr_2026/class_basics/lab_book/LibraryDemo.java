package com.example.lld1_apr_2026.class_basics.lab_book;

public class LibraryDemo {
    public static void main(String[] args) {
        Book book = new Book("Clean Code", "Robert C. Martin", "978-6482682648246", 599.0, 464, true);
        Book book1 = new Book("The Pragmatic Programmer", "David Thomas", "978-6482684342648246", 800.0, 350, true);

        book.displayInfo();
        book.borrow();
        book.returnBook();
        book.borrow();
        book.borrow();

        System.out.println(book.getTitle());
        book.setPrice(699.0);

        // If I have to create 100 books -> 700 lines of code

    }
}
