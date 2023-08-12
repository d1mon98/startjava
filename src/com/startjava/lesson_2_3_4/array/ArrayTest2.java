/*
В одномерном массиве найти сумму элементов,
находящихся между минимальным и максимальным элементами.
Сами минимальный и максимальный элементы в сумму не включать.
*/

package com.startjava.lesson_2_3_4.array;

public class ArrayTest2 {
//methods

    static int sumNumbersInArrayBetweenMinMax(int[] array) {
        int indexMin = intFindMinElementIndex(array);
        int indexMax = intFindMaxElementIndex(array);
        int sum = 0;
        if (indexMin < indexMax) {
            for (int i = indexMin + 1; i < indexMax; i++) {
                sum += array[i];
            }
        } else if (indexMin > indexMax) {
            for (int i = indexMax + 1; i < indexMin; i++) {
                sum += array[i];
            }
        }
        return sum;
    }


    private static int intFindMinElementIndex(int[] array) {
        int i;
        for (i = 0; i < array.length; i++) {
            if (array[i] == arrayGetMin(array)) {
                break;
            }
        }
        return i;
    }

    private static int intFindMaxElementIndex(int[] array) {
        int i;
        for (i = 0; i < array.length; i++) {
            if (array[i] == arrayGetMax(array)) {
                break;
            }
        }
        return i;
    }


    private static int arrayGetMin(int[] array) {
        int min = array[0];
        for (int j : array) {
            if (j < min) {
                min = j;
            }
        }
        return min;
    }

    private static int arrayGetMax(int[] array) {
        int max = array[0];
        for (int j : array) {
            if (j > max) {
                max = j;
            }
        }
        return max;
    }


    public static void printArray(int[] array) {
        for (int element : array
        ) {
            System.out.print(element + " ");

        }
    }

    public static void fillArrayWithUniqueNumbers(int[] array) {

        for (int i = 0; i < array.length; i++) {
            int random;
            do {
                random = (int) (Math.random() * 210);
            }
            while (isInArray(array, random));
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

    public static void main(String[] args) {
        int[] array = new int[10];

        fillArrayWithUniqueNumbers(array);
        printArray(array);
        System.out.println();
        System.out.println();
        System.out.println("Мин. элемент = " + arrayGetMin(array));
        System.out.println("Индекс мин. элемента = " + intFindMinElementIndex(array));
        System.out.println();
        System.out.println("Макс. элемент = " + arrayGetMax(array));
        System.out.println("Индекс макс. элемента = " + intFindMaxElementIndex(array));


        System.out.println();
        System.out.println("Сумма элементов между минимальным и максимальным элементами массива  = " + sumNumbersInArrayBetweenMinMax(array));

    }

}
