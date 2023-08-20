package com.startjava.lesson_1._final;

public class GuessNumber {

    public static void main(String[] args) {
        int computerNum = 22;
        int playerNum = 5;

        for (int i = 0; i < 100; i++) {
            if (playerNum > computerNum) {
                System.out.println("Число " + playerNum + " больше того, что загадал компьютер");
                playerNum -= 5;
            } else if (playerNum < computerNum) {
                System.out.println("Число " + playerNum + " меньше того, что загадал компьютер");
                playerNum += 2;
            } else {
                System.out.println("Вы победили!");
                break;
            }
        }
    }
}

