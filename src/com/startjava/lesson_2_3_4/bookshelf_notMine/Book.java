package com.startjava.lesson_2_3_4.bookshelf_notMine;

public class Book {

    private final String author;
    private final String title;
    private final int publicationYear;
    private final int length;

    public Book(String author, String title, int publicationYear) {
        this.author = author;
        this.title = title;
        this.publicationYear = publicationYear;
        length = toString().length();
    }

    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }

    public String toString() {
        return author + ", " + title + ", " + publicationYear;
    }
}