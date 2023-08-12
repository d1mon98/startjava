package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;

public class ArraysTheme {

    //methods


    //check is number in Array
    private static boolean isNumberInArrayCheck(int[] array, int random) {
        for (int k : array) {
            if (k == random) {
                return true;
            }
        }
        return false;
    }


    //fill array with random double numbers
    private static void fillArrayRandomDouble(double[] array3) {
        for (int i = 0; i < array3.length; i++) {
            array3[i] = Math.random();
        }
    }


    //printIntArray
    private static void printIntArray(int[] array) {
        for (int i = 0; i < array.length; i++
        ) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(array[i]);
        }
    }

    //printCharArray
    private static void printCharArray(char[] array) {
        for (char c : array) {
            System.out.print(c);
        }
    }

    // printArray2
    private static void printArray2(double[] array3) {
        int middleCellIndex = array3.length / 2 + 1;
        for (int i = 0; i < array3.length; i++) {
            if (i == middleCellIndex) {
                System.out.println();
            }
            System.out.printf("%.3f   ", array3[i]);
        }
    }

    //arrayReverse
    private static void arrayReverse(int[] array) {
        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < array.length - i; j++) {
                int buffer = array[j];
                array[j] = array[j + 1];
                array[j + 1] = buffer;
            }
        }
    }


    public static void main(String[] args) {

        int[] array1 = {1, 7, 4, 5, 2, 6, 3};
        int result = 1;

        System.out.println("1. Реверс значений массива");
        System.out.print("До реверса: [");
        printIntArray(array1);
        System.out.print("]");

        arrayReverse(array1);
        System.out.print("\nПосле реверса: [");
        printIntArray(array1);
        System.out.print("]");

        System.out.println("\n\n2. Произведение элементов массива");
        int[] array2 = new int[10];
        for (int i = 0; i < 10; i++) {
            array2[i] = i;
        }

        for (int i = 1; i < array2.length - 1; i++) {
            result = result * i;
            System.out.print((i > 1) ? " * " : "");
            System.out.print(i);
        }
        System.out.println(" = " + result);

        System.out.println("\n3. Удаление элементов массива");

        double[] array3 = new double[15];
        fillArrayRandomDouble(array3);
        int middleCellIndex = array3.length / 2 + 1;

        System.out.print("Исходный массив:\n");
        printArray2(array3);

        System.out.print("\n\nИндекс средней ячейки массива: " + middleCellIndex);
        System.out.print("\nЗначение в средней ячейке масива: ");
        System.out.printf("%.3f   ", array3[array3.length / 2]);


        //перезапись нулями
        for (int i = 0; i < array3.length; i++) {
            if (array3[i] > array3[middleCellIndex]) {
                array3[i] = 0;
            }
        }

        System.out.print("\n\nИзмененный массив:\n");
        printArray2(array3);

        System.out.println("\n\n4. Вывод алфавита лесенкой");

        char[] array4 = new char[26];
        int j = 0;
        int counter = 0;

        //filing array with latin alphabet:
        for (char ch = 'Z'; ch >= 'A'; ch--) {
            array4[j] = ch;
            j++;
        }

        //   printCharArray(array4);
        for (j = 0; j < array4.length; j++) {
            System.out.println();
            for (int i = 0; i <= j; i++) {
                System.out.print(array4[i]);
            }
        }

        System.out.println("\n\n5. Заполнение массива уникальными числами");

        int[] array5 = new int[30];

        for (int i = 0; i < array5.length; i++) {
            int random;
            do {
                random = 60 + (int) (Math.random() * 40);
            }
            while (isNumberInArrayCheck(array5, random));
            array5[i] = random;
        }
        Arrays.sort(array5);
        printIntArray(array5);
    }


}









