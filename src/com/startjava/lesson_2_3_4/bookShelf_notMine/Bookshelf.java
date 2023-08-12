package com.startjava.lesson_2_3_4.bookShelf_notMine;
import java.util.Arrays;

public class Bookshelf {

    private static final int CAPACITY = 10;
    private Book[] books = new Book[CAPACITY];
    private int countBooks;
    private int maxLength;

    public int getCountBooks() {
        return countBooks;
    }

    public int getCountFreeShelves() {
        return CAPACITY - countBooks;
    }

    public int getMaxLength() {
        return maxLength;
    }

    public void save(Book book) {
        if (countBooks < CAPACITY) {
            books[countBooks++] = book;
            System.out.println("Книга сохранена.");
        } else {
            System.out.println("Ошибка: книга не сохранена - в шкафу не осталось свободных полок!");
        }

        if (maxLength < book.getLength()) {
            maxLength = book.getLength();
        }
    }

    public Book find(String title) {
        for (int i = 0; i < countBooks; i++) {
            if (books[i].getTitle().equals(title)) {
                return books[i];
            }
        }
        return null;
    }

    public void delete(String title) {
        for (int i = 0; i < countBooks; i++) {
            if (books[i].getTitle().equals(title)) {
                int length = books[i].getLength();
                countBooks--;
                System.arraycopy(books, i + 1, books, i, countBooks - i);
                books[countBooks] = null;
                System.out.println("Книга удалена.");

                if (length == maxLength) {
                    maxLength = 0;
                    for (int j = 0; j < countBooks; j++) {
                        if (maxLength < books[j].getLength()) {
                            maxLength = books[j].getLength();
                        }
                    }
                }
                return;
            }
        }
        System.out.println("Ошибка: книга не удалена, т. к. не найдена!");
    }

    public Book[] getAll() {
        return Arrays.copyOf(books, countBooks);
    }

    public void clear() {
        Arrays.fill(books, 0, countBooks, null);
        countBooks = 0;
        System.out.println("Шкаф очищен.");
    }
}