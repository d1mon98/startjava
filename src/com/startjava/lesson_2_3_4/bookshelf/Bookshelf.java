package com.startjava.lesson_2_3_4.bookshelf;

import java.util.Arrays;

public class Bookshelf {

    //счетчик кол-ва книг на полке
    private int bookQuantity;
    //максимальная длина записи книги
    private int maxLength;
    //объем полки, шт.
    private static final int capacity = 10;
    //массив объектов типа Book
    private Book[] book = new Book[capacity];

    public int getBookQuantity() {
        return bookQuantity;
    }

    public int getMaxLength() {
        return maxLength;
    }

    public int getCountFreeSpace() {
        return capacity - bookQuantity;
    }

    //methods
    //добавление на полку
    public void addBookOnTheShelf(Book book) {
        if (bookQuantity < capacity) {
            this.book[bookQuantity++] = book;
            System.out.println("\nКнига добавлена на полку");
        } else {
            System.out.println("\nОшибка: книга не сохранена, книжная полка переполнена\n");
        }
        //максимальная длина книги
        if (maxLength < book.getBookInfoLength()) {
            maxLength = book.getBookInfoLength();
        }
    }

    //удаление книги с полки
    public void deleteBookFromTheShelf(String title) {
        for (int i = 0; i < bookQuantity; i++) {
            if (book[i].getTitle().equals(title)) {
                int length = book[i].getBookInfoLength();
                bookQuantity--;
                //удаление книги происходит через перезапись массива со сдвигом самого в себя
                //РАЗОБРАТЬСЯ КАК ОСУЩЕСТВЛЯЕТСЯ КОПИРОВАНИЕ почему длина bookQuantity -i
                // почему позиция массива с которой идет копирование i+1
                System.arraycopy(book, i + 1, book, i, bookQuantity - i);
                //последней книге в массиве присваивается null
                book[bookQuantity] = null;
                System.out.println("Книга удалена.");
                if (length == maxLength) {
                    maxLength = 0;
                    //поиск максимальной длины
                    for (int j = 0; j < bookQuantity; j++) {
                        if (maxLength < book[j].getBookInfoLength()) {
                            maxLength = book[j].getBookInfoLength();
                        }
                    }
                }
                //узнать зачем нужен это return?
                return;
            }
        }
        System.out.println("Ошибка: книга не удалена, т. к. не найдена!");
    }

    //копирует массив book в новый массив длиной bookQuantity
    public Book[] getAllBooks() {
        return Arrays.copyOf(book, bookQuantity);

    }

    public void clearBookshelf() {
        Arrays.fill(book, 0, bookQuantity, null);
        bookQuantity = 0;
        System.out.println("Книжная полка очищена");
    }

    public Book find(String title) {
        for (int i = 0; i < book.length; i++) {
            if (book[i].title.equals(title)) {
                return book[i];
            }
        }
        return null;
    }
}


