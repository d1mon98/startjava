package com.startjava.lesson_2_3_4.guess;

public class Test {


    public static void main(String[] args) {

        int[] array;
        array = new int[4];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;

        }
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
    }
}
