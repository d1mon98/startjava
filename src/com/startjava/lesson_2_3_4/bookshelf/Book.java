package com.startjava.lesson_2_3_4.bookshelf;

public class Book {

    public String author;
    public String title;
    public int yearOfPublishing;
    private int bookInfoLength;

    //constructors

    public Book(String author, String title, int yearOfPublishing) {
        this.author = author;
        this.title = title;
        this.yearOfPublishing = yearOfPublishing;
        //длина символов записи книги (автор + название + год)
        bookInfoLength = getBookInfo().length();
    }

    //methods
    public String getBookInfo() {
        return author + ", " + title + ", " + yearOfPublishing;
    }
    public int getBookInfoLength() {
        return bookInfoLength;
    }
    public String getTitle() {
        return title;
    }
}

