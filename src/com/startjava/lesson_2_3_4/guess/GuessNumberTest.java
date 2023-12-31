package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;


public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in, "utf-8");

        System.out.print("Введите имя игрока 1: ");
        String name1 = console.nextLine();

        System.out.print("Введите имя игрока 2: ");
        String name2 = console.nextLine();

        GuessNumber game = new GuessNumber(name1, name2);
        String option = "yes";

        do {
            if ("yes".equals(option)) {
                game.start();
            }
            System.out.print("Хотите продолжить игру? [yes/no]: ");
            option = console.nextLine();
        } while (!"no".equals(option));
    }
}