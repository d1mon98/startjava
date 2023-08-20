package com.startjava.lesson_1.base;

public class CyclesTheme {
    public static void main(String[] args) {
        //1.Подсчёт суммы чётных и нечётных чисел
        System.out.println("1. Подсчёт суммы чётных и нечётных чисел\n");

        int sumEven = 0;
        int sumOdd = 0;
        int counter = -10;

        do {
            if (counter % 2 == 0) {
                sumEven += counter;
            } else {
                sumOdd += counter;
            }
            counter++;
        } while (counter <= 21);
        System.out.println("В отрезке [-10, 21] сумма чётных чисел = " + sumEven + ", а нечётных = " + sumOdd);

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
        System.out.print("Интервал (" + min + ";" + max + ") в порядке убывания: ");
        for (int i = max - 1; i > min; i--) {
            System.out.print(i + " ");
        }

        //3.Вывод реверсивного числа и суммы его цифр
        System.out.println("\n\n\n3. Вывод реверсивного числа и суммы его цифр");

        int num4 = 8975;
        int sumDigits = 0;

        System.out.print("\nИсходное число в обратном порядке = ");
        while (num4 > 0) {
            int currentDigit = num4 % 10;
            sumDigits += currentDigit;
            System.out.print(currentDigit);
            num4 /= 10;
        }
        System.out.println("\nСумма его цифр = " + sumDigits);

        //4.Вывод чисел в несколько строк
        System.out.println("\n\n4. Вывод чисел в несколько строк\n");

        int endRange = 30;
        counter = 0;
        int countRows = 0;

        for (int i = 1; i < endRange; i += 2) {
            counter++;
            System.out.printf("%5d", i);
            if (counter % 5 == 0) {
                System.out.println();
                countRows++;
            }
        }
        int countZero = 5 * (countRows + 1) - counter;
        if (countZero % 5 != 0) {
            for (int i = 1; i <= countZero; i++) {
                System.out.printf("%5d", 0);
            }
        }

        //5. Проверка количества двоек числа на четность/нечетность
        System.out.println("\n\n5. Проверка количества двоек числа на четность / нечетность\n");

        int num5 = 3242592;
        int copyNum5 = num5;
        int countTwos = 0;

        while (num5 > 0) {
            if (num5 % 10 == 2) {
                countTwos++;
            }
            num5 /= 10;
        }

        String text;

        if (countTwos % 2 == 0 | countTwos == 1) {
            text = "чётное";
        } else {
            text = "нечетное";
        }
        System.out.println("В " + copyNum5 + " (" + text + ") количество двоек - " + countTwos);

        //6. Отображение геометрических фигур
        System.out.println("\n\n6. Отображение геометрических фигур");
        for (int i = 0; i < 50; i++) {
            if (i % 10 == 0) {
                System.out.println();
            }
            System.out.print("*");
        }
        System.out.println("\n");

        counter = 1;

        while (counter <= 15) {
            System.out.print("#");
            if (counter == 5 | counter == 9 | counter == 12 | counter == 14) {
                System.out.println();
            }
            counter++;
        }

        System.out.println("\n");

        int counter1 = 0;
        int counter2 = 0;

        do {
            System.out.print("$");
            if (counter1 == 0 | counter1 == 2) {
                System.out.println();
            }
            counter1++;
        } while (counter1 < 6);

        System.out.println();

        do {
            System.out.print("$");
            if (counter2 == 1) {
                System.out.println();
            }
            counter2++;
        } while (counter2 < 3);

        //7. Отображение ASCII-символов
        System.out.println("\n\n\n7. Отображение ASCII-символов\n");
        System.out.printf("%-10s%s%n", "DECIMAL", "CHARACTER");
        for (int i = '\0'; i <= '/'; i++) {
            if (i % 2 != 0) {
                System.out.printf("%4d%11c%n", i, i);
            }
        }
        for (int i = 'a'; i <= 'z'; i++) {
            if (i % 2 == 0) {
                System.out.printf("%4d%11c%n", i, i);
            }
        }

        //8. Проверка, является ли число палиндромом
        System.out.println("\n\n8. Проверка, является ли число палиндромом\n");

        int num6 = 1234321;
        int copyNum6 = num6;
        int palindrome = 0;

        while (copyNum6 > 0) {
            int lastDigit = copyNum6 % 10;
            palindrome = palindrome * 10 + lastDigit;
            copyNum6 /= 10;
        }
        if (palindrome == num6) {
            System.out.println("Число " + num6 + " является палиндромом");
        } else {
            System.out.println("Число " + num6 + " не является палиндромом");
        }

        //9. Проверка, является ли число счастливым
        System.out.println("\n\n9. Проверка, является ли число счастливым\n");

        int num7 = 476566;
        int sumFirstHalf = 0;
        int firstHalf = num7 / 1000;
        int sumSecondHalf = 0;
        int secondHalf = num7 % 1000;

        //нахождение частей числа и суммы их цифр
        while (firstHalf > 0) {
            sumFirstHalf += firstHalf % 10;
            firstHalf /= 10;
            sumSecondHalf += secondHalf % 10;
            secondHalf /= 10;
        }

        if (sumFirstHalf == sumSecondHalf) {
            System.out.println("Число " + num7 + " является счастливым");
        } else {
            System.out.println("Число " + num7 + " не является счастливым");
        }
        System.out.println("Сумма цифр " + (num7 / 1000) + " = " + sumFirstHalf +
                ", а сумма " + (num7 % 1000) + " = " + sumSecondHalf);

        //10. Отображение таблицы умножения Пифагора
        System.out.println("\n\n10. Отображение таблицы умножения Пифагора\n");
        System.out.printf("%11s%13s%n", "ТАБЛИЦА", "ПИФАГОРА");
        System.out.print("   |");
        for (int i = 2; i < 10; i++) {
            System.out.printf("%2d ", i);
        }
        System.out.print("\n---|-----------------------\n");
        for (int i = 2; i < 10; i++) {
            System.out.printf("%2d |", i);
            for (int j = 2; j < 10; j++) {
                System.out.printf("%2d ", i * j);
            }
            System.out.println();
        }
    }
}





