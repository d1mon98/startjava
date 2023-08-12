package com.startjava.lesson_2_3_4.bookshelf_notMine;

import java.util.Scanner;

public class BookshelfTest {

    private static final int EXIT = 5;
    static Bookshelf bs = new Bookshelf();
    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {
        do {
            printBookshelf();
            printMenu();
        } while (selectMenuItem() != EXIT);
    }

    private static void printBookshelf() {
        if (bs.getCountBooks() == 0) {
            System.out.println("\nШкаф пуст. Вы можете добавить в него первую книгу.");
        } else {
            System.out.println("\nВ шкафу книг - " + bs.getCountBooks() +
                    ", свободно полок - " + bs.getCountFreeShelves());

            Book[] books = bs.getAll();
            int maxLength = bs.getMaxLength();
            for (Book book : books) {
                System.out.println("|" + book + " ".repeat(maxLength - book.getLength()) + "|");
                System.out.println("|" + "-".repeat(maxLength) + "|");
            }
            System.out.println("|" + " ".repeat(maxLength) + "|\n");
        }
    }

    public static void printMenu() {
        System.out.println("""
                1. Сохранить книгу
                2. Найти книгу
                3. Удалить книгу
                4. Очистить шкаф
                5. Выйти
                """);

        System.out.print("Введите номер команды: ");
    }

    private static int selectMenuItem() {
        String item = console.nextLine();
        switch (item) {
            case "1" -> saveBook();
            case "2" -> findBook();
            case "3" -> deleteBook();
            case "4" -> bs.clear();
            case "5" -> {
                return EXIT;
            }
            default -> System.out.println("Данная команда не поддерживается. Введите номер из списка.");
        }
        pressEnter();

        return 0;
    }

    private static void saveBook() {
        System.out.print("Введите автора: ");
        String author = console.nextLine();

        String title = inputTitle();

        System.out.print("Введите год издания: ");
        int publicationYear = console.nextInt();
        console.nextLine();

        Book book = new Book(author, title, publicationYear);
        bs.save(book);
    }

    private static void findBook() {
        Book book = bs.find(inputTitle());
        System.out.println(book != null ? book : "Книга не найдена");
    }

    private static void deleteBook() {
        bs.delete(inputTitle());
    }

    private static String inputTitle() {
        System.out.print("Введите название книги: ");
        return console.nextLine();
    }

    private static void pressEnter() {
        System.out.print("\nДля продолжения работы нажмите клавишу <Enter>");
        String key;
        do {
            key = console.nextLine();
        } while (!key.equals(""));
    }
}