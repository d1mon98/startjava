package com.startjava.lesson_2_3_4.bookshelf;

import java.util.Scanner;

public class BookshelfTestDrive {
    //переменные, испольщующиеся в классе TestDrive
    static final int EXIT = 6;
    static Bookshelf bs = new Bookshelf();
    static Scanner console = new Scanner(System.in);

    //запускающий метод main
    public static void main(String[] args) {
        do {
            printBookShelf();
            System.out.println();
            printMenu();
        } while (choseMenu() != EXIT);
    }

    //метод печатающий все книги на книжной полке + графическое оторбражение полки
    public static void printBookShelf() {
        if (bs.getBookQuantity() == 0) {
            System.out.println("Книжная полка пуста, вы можете положить туда " + bs.getCountFreeSpace() + " книгу(и)");
        } else {
            System.out.println("\nНа книжной полке " + bs.getBookQuantity() + " книг(а/и), " + "свободно " + bs.getCountFreeSpace() + " мест(а/о)\n");

            int maxLength = bs.getMaxLength();
            Book[] books = bs.getAllBooks();
            for (Book book : books) {
                System.out.println("|" + book.author + ", " + book.title + ", " + book.yearOfPublishing + " ".repeat(maxLength - book.getBookInfoLength()) + "|");
                System.out.println("|" + "-".repeat(maxLength) + "|");
            }
            System.out.println("|" + " ".repeat(maxLength) + "|");
        }
    }

    //многострочный String для отображения меню
    public static void printMenu() {
        System.out.println("""
                1. Добавить книгу
                2. Найти книгу
                3. Удалить книгу
                4. Очистить полку
                5. Выйти
                """);
        System.out.print("Введите пункт меню: ");
    }

    //метод выбора пунктов меню
    public static int choseMenu() {
        Scanner console = new Scanner(System.in);
        String year = console.nextLine();
        switch (year) {
            case "1" -> collectBookInfo();
            case "2" -> findBook();
            case "3" -> deleteBook();
            case "4" -> bs.clearBookshelf();
            case "5" -> {
                return EXIT;
            }
            default ->
                    System.out.println("Даная команда не поддерживается, введите номер из списка");
        }
        pressEnter();
        return 0;
    }

    //сбор информации о книгах
    public static void collectBookInfo() {
        System.out.println();
        Scanner console = new Scanner(System.in);
        System.out.print("Введите имя автора: ");
        String author = console.nextLine();
        System.out.print("Введите название: ");
        String title = console.nextLine();
        System.out.print("Введите год публикации книги: ");
        int year = console.nextInt();
        Book books = new Book(author, title, year);
        bs.addBookOnTheShelf(books);
    }

    //поиск книгаи
    private static void findBook() {
        Book book = bs.find(inputTitle());
        //разобраться в этом операторе
        if (book.title != null) {
            System.out.println("Найденая книга:\n" + book.author + ", "
                    + book.title + ", " + book.yearOfPublishing);
        } else {
            System.out.println("Книга не найдена");
        }
    }

    //метод получения названия книги с клавиатуры
    private static String inputTitle() {
        System.out.print("Введите название книги: ");
        return console.nextLine();
    }

    // метод подающий название удаляемой книги полученное с консоли на вход метода, который
    // удаляет книгу
    private static void deleteBook() {
        bs.deleteBookFromTheShelf(inputTitle());
    }
    //Разобраться как работает метод
    private static void pressEnter() {
        System.out.print("\nДля продолжения работы нажмите клавишу <Enter>");
        String key;
        do {
            key = console.nextLine();
        } while (!key.isEmpty());
    }
}







