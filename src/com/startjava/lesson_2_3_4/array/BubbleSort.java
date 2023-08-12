package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;

import static com.startjava.lesson_2_3_4.array.ArrayTest2.*;

public class BubbleSort {


    //methods
    public static int[] bubbleSort(int[] array) {
        int temp;
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {

        int[] array = new int[20];
        fillArrayWithUniqueNumbers(array);
        System.out.print("Массив до сортировки:\n ");
        printArray(array);
        System.out.println();
        System.out.println(Arrays.toString(array));
        System.out.println();
        System.out.println();
        System.out.print("Массив после сортировки:\n ");
        printArray(bubbleSort(array));
        System.out.println();
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array).replaceAll("\\[|\\]|\\,", ""));
    }
}
