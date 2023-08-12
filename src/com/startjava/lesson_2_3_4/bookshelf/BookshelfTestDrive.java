package com.startjava.lesson_2_3_4.bookshelf;

import java.util.Arrays;
import java.util.Scanner;

public class BookshelfTestDrive {

    static Bookshelf bs = new Bookshelf();
    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {

        collectBookInfo();
        System.out.println();
        printBookShelf();



    }

    public static void collectBookInfo() {
        System.out.println("Введите имя автора:");
        String author = console.nextLine();
        System.out.println("Введите название:");
        String title = console.nextLine();
        System.out.println("Введите год публикации книги:");
        int year = console.nextInt();
        Book book = new Book(author, title, year);
        bs.addBookOnTheShelf(book);
    }

    public static void printBookShelf() {

        Book[] books = bs.getAll();
        System.out.println(books[0]);
           }

}
