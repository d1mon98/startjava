/*
Заполнить массив случайными положительными и отрицательными числами таким образом,
чтобы все числа по модулю были разными. Это значит, что в массиве не может быть
ни только двух равных чисел, но не может быть двух равных по модулю.
В полученном массиве найти наибольшее по модулю число.
   */

package com.startjava.lesson_2_3_4.array;

public class ArrayTest1 {

    //methods

    private static void showArray(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
    }

    private static void fillArray(int[] array, int boundary) {
        for (int i = 0; i < array.length; i++) {
            int random;

            do {
                random = -1 * (int) (Math.random() * boundary) + (int) (Math.random() * boundary + 1);
            } while (isInArray(array, random));
            array[i] = random;
        }
    }


    static boolean isInArray(int[] array, int random) {
        for (int element : array) {
            if (Math.abs(element) == Math.abs(random)) {
                return true;
            }
        }
        return false;
    }

    private static int findMax(int[] array) {

        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (Math.abs(max) < Math.abs(array[i])) {
                max = array[i];
            }
        }
        return max;
    }


    public static void main(String[] args) {

        int[] array = new int[40];

        fillArray(array,100);

        showArray(array);

        System.out.println("\n\nНаибольшее по модулю число = " + findMax(array));
    }
}
