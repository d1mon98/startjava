package com.startjava.lesson_2_3_4.bookshelf;

import java.util.Arrays;

public class Bookshelf {

    private int bookQuantity;
    private static final int capacity = 10;
    public Book[] books = new Book[capacity];


    //methods
    public void addBookOnTheShelf(Book book) {
        books[0] = book;

    }
    public Book[] getAll() {
        return Arrays.copyOf(books, 1);
    }


}
