package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;

public class ArraysTheme {
    public static void main(String[] args) {
        //1. Реверс значений массива
        System.out.println("1. Реверс значений массива");

        int[] array1 = {1, 7, 4, 5, 2, 6, 3};

        System.out.print("До реверса: [");
        printArray1(array1);
        System.out.print("]");
        System.out.print("\nПосле реверса: [");
        printArray1(getReverseArray(array1));
        System.out.print("]");

        //2.  Произведение элементов массив
        System.out.println("\n\n2. Произведение элементов массива");

        int[] array2 = new int[10];
        int multiplication = 1;

        for (int i = 0; i < 10; i++) {
            array2[i] = i;
        }
        for (int i = 1; i < array2.length - 1; i++) {
            multiplication = multiplication * i;
            System.out.print((i > 1) ? " * " : "");
            System.out.print(i);
        }
        System.out.println(" = " + multiplication);

        //3. Удаление элементов массива
        System.out.println("\n3. Удаление элементов массива");

        double[] array3 = new double[15];
        int len = array3.length;

        fillArrayRndDouble(array3);
        System.out.print("Исходный массив:\n");
        printArray2(array3);
        //перезапись нулями
        for (int i = 0; i < len; i++) {
            if (array3[i] > array3[len / 2]) {
                array3[i] = 0;
            }
        }
        System.out.print("\n\nИзмененный массив:\n");
        printArray2(array3);

        //4. Вывод алфавита лесенкой
        System.out.println("\n\n4. Вывод алфавита лесенкой");

        char[] array4 = new char[26];
        int j = 0;

        //filing array with latin alphabet:
        for (char ch = 'Z'; ch >= 'A'; ch--) {
            array4[j] = ch;
            j++;
        }

        //printing char array
        for (j = 0; j < array4.length; j++) {
            System.out.println();
            for (int i = 0; i <= j; i++) {
                System.out.print(array4[i]);
            }
        }

        //5. Заполнение массива уникальными числами
        System.out.println("\n\n5. Заполнение массива уникальными числами");

        int[] array5 = new int[30];
        len = array5.length;

        for (int i = 0; i < len; i++) {
            int random;
            do {
                random = 60 + (int) (Math.random() * 40);
            } while (isNumberInArray(array5, random));
            array5[i] = random;
        }
        Arrays.sort(array5);
        for (int i = 0; i < len; i++) {
            if (i % 10 == 0 && i > 0) {
                System.out.println();
            }
            System.out.print(array5[i] + " ");
        }
    }

    //methods
    //print int array
    private static void printArray1(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(array[i]);
        }
    }

    // reverse array
    private static int[] getReverseArray(int[] array) {
        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < array.length - i; j++) {
                int temp = array[j];
                array[j] = array[j + 1];
                array[j + 1] = temp;
            }
        }
        return array;
    }

    //fill array with random double numbers
    private static void fillArrayRndDouble(double[] array3) {
        for (int i = 0; i < array3.length; i++) {
            array3[i] = Math.random();
        }
    }

    //check is number in array
    private static boolean isNumberInArray(int[] array, int random) {
        for (int k : array) {
            if (k == random) {
                return true;
            }
        }
        return false;
    }

    // print double array
    private static void printArray2(double[] array3) {
        for (int i = 0; i < array3.length; i++) {
            if (i == array3.length / 2 + 1) {
                System.out.println();
            }
            System.out.printf("%.3f   ", array3[i]);
        }
    }
}









