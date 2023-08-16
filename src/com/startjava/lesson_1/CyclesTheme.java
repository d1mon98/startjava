package com.startjava.lesson_1;

public class CyclesTheme {
    public static void main(String[] args) {
        //1.Подсчет суммы четных и нечетных чисел
        System.out.println("1. Подсчет суммы четных и нечетных чисел\n");

        int evenSum = 0;
        int oddSum = 0;
        int counter1 = -10;

        do {
            if (counter1 % 2 == 0) {
                evenSum += counter1;
            } else {
                oddSum += counter1;
            }
            counter1++;
        } while (counter1 <= 21);
        System.out.println("В отрезке [-10, 21] сумма четных чисел = " + evenSum + ", а нечетных = " + oddSum);

        //2. Вывод чисел в порядке убывания
        System.out.println("\n\n2. Вывод чисел в порядке убывания\n");

        int num1 = -1;
        int num2 = 10;
        int num3 = 5;
        int min = num1;
        int max = num2;

        if (num1 > max) {
            max = num1;
        }
        if (num3 > max) {
            max = num3;
        }
        if (num2 < min) {
            min = num2;
        }
        if (num3 < min) {
            min = num3;
        }
        System.out.println("min = " + min + "\nmax = " + max);
        System.out.print("Интервал (" + min + ";" + max + "): ");
        for (int i1 = min + 1; i1 < max; i1++) {
            System.out.print(i1 + " ");
        }

        //3.Вывод реверсивного числа и суммы его цифр
        System.out.println("\n\n\n3. Вывод реверсивного числа и суммы его цифр");

        int num4 = 8975;
        int digitsSum = 0;

        System.out.print("\nИсходное число в обратном порядке = ");
        while (num4 > 0) {
            int currentDigit = num4 % 10;
            digitsSum += currentDigit;
            System.out.print(currentDigit);
            num4 /= 10;
        }
        System.out.println("\nСумма его цифр = " + digitsSum);

        //4.Вывод чисел в несколько строк
        System.out.println("\n\n4. Вывод чисел в несколько строк\n");

        int max1 = 24;
        int counter2 = 0;
        int rowCounter = 0;

        for (int i = 1; i < max1; i = i + 2) {
            counter2++;
            System.out.printf("%5d", i);
            if (counter2 % 5 == 0) {
                System.out.println();
                rowCounter++;
            }
        }
        int countZero = 5 * (rowCounter + 1) - counter2;
        for (int i = 1; i <= countZero; i++) {
            System.out.printf("%5d", 0);
        }

        //5. Проверка количества двоек числа на четность/нечетность
        System.out.println("\n\n\n5. Проверка количества двоек числа на четность / нечетность\n");

        int num5 = 3242592;
        int num6 = num5;
        int currentDigit2;
        int count2 = 0;
        String text;

        while (num5 > 0) {
            currentDigit2 = num5 % 10;
            num5 /= 10;
            if (currentDigit2 == 2) {
                count2++;
            }
        }
        if (count2 % 2 == 0 | count2 == 1) {
            text = "четное";
        } else {
            text = "нечетное";
        }
        System.out.println("В " + num6 + " (" + text + ") колличество двоек - " + count2);

        //6. Отображение геометрических фигур
        System.out.println("\n\n6. Отображение геометрических фигур");
        for (int i = 0; i < 50; i++) {
            if (i % 10 == 0) {
                System.out.println();
            }
            System.out.print("*");
        }
        System.out.println("\n");

        int i = 1;

        while (i <= 15) {
            System.out.print("#");
            if (i == 5 | i == 9 | i == 12 | i == 14) {
                System.out.println();
            }
            i++;
        }

        System.out.println("\n");

        int i1 = 0;
        int i2 = 0;

        do {
            System.out.print("$");
            if (i1 == 0 | i1 == 2) {
                System.out.println();
            }
            i1++;
        } while (i1 < 6);

        System.out.println();

        do {
            System.out.print("$");
            if (i2 == 1) {
                System.out.println();
            }
            i2++;
        } while (i2 < 3);

        //7. Отображение ASCII-символов
        System.out.println("\n\n7. Отображение ASCII-символов\n");
        System.out.printf("%-10s%s%n", "DECIMAL", "CHARACTER");
        for (int i3 = '\0'; i3 <= '/'; i3++) {
            if (i3 % 2 != 0) {
                System.out.printf("%4d%11s%n", (i3), (char) i3);
            }
        }
        for (int i4 = 'a'; i4 <= 'z'; i4++) {
            if (i4 % 2 == 0) {
                System.out.printf("%4d%11s%n", (i4), (char) i4);
            }
        }

        //8. Проверка, является ли число палиндромом
        System.out.println("\n\n8. Проверка, является ли число палиндромом\n");

        int num7 = 1234321;
        int copy1 = num7;
        int lastDigit1;
        int palindrome = 0;

        while (copy1 > 0) {
            lastDigit1 = copy1 % 10;
            palindrome = palindrome * 10 + lastDigit1;
            copy1 /= 10;
        }
        if (palindrome == num7) {
            System.out.println("Число " + num7 + " является палиндромом");
        } else {
            System.out.println("Число " + num7 + " не является палиндромом");
        }

        //9. Проверка, является ли число счастливым
        System.out.println("\n\n9. Проверка, является ли число счастливым\n");

        int num8 = 476566;
        int sumFirstHalf = 0;
        int firstHalf = num8 / 1000;
        int sumSecondHalf = 0;
        int secondHalf = num8 % 1000;

        //нахождение частей числа и суммы их цифр
        while (firstHalf > 0) {
            sumFirstHalf += firstHalf % 10;
            firstHalf /= 10;
            sumSecondHalf += secondHalf % 10;
            secondHalf /= 10;
        }

        if (sumFirstHalf == sumSecondHalf) {
            System.out.println("Число " + num8 + " является счастливым");
        } else {
            System.out.println("Число " + num8 + " не является счастливым");
        }
        System.out.println("Сумма цифр " + (num8 / 1000) + " = " + sumFirstHalf +
                ", а сумма " + (num8 % 1000) + " = " + sumSecondHalf);

        //10. Отображение таблицы умножения Пифагора
        System.out.println("\n\n10. Отображение таблицы умножения Пифагора\n");
        System.out.printf("%11s%13s%n", "ТАБЛИЦА", "ПИФАГОРА");
        System.out.printf("   |");
        for (
                int i5 = 2;
                i5 < 10; i5++) {
            System.out.printf("%2d ", i5);
        }
        System.out.printf("\n---|-----------------------\n");
        for (
                int i6 = 2;
                i6 < 10; i6++) {
            System.out.printf("%2d |", i6);
            for (int j = 2; j < 10; j++) {
                System.out.printf("%2d ", i6 * j);
            }
            System.out.printf("\n");
        }
    }
}





