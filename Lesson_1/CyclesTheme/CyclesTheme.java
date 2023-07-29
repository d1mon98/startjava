
public class CyclesTheme {
    public static void main(String[] args) {

        //1.Подсчет суммы четных и нечетных чисел
        System.out.println("1. Подсчет суммы четных и нечетных чисел\n");
        int evenSum = 0;
        int oddSum = 0;
        int startNum = -10;

        do {
            if (startNum % 2 == 0) {
                evenSum += startNum;
            } else {
                oddSum += startNum;
            }
            startNum++;
        }
        while (startNum <= 21);
        System.out.println("В отрезке [-10, 21] сумма четных чисел = " + evenSum + ", а нечетных = "
                + oddSum);

        //2. Вывод чисел в порядке убывания
        System.out.println("\n\n2. Вывод чисел в порядке убывания\n");

        int num1 = 10;
        int num2 = 5;
        int num3 = -1;
        int min;
        int max;

        if (num1 < num2) {
            min = num1;
            max = num2;
        } else {
            min = num2;
            max = num1;
        }
        if (num3 < min) {
            min = num3;
        }
        if (num3 > max) {
            max = num3;
        }
        System.out.println("min " + min);
        System.out.println("max " + max);

        for (int i = min; i <= max; i++) {
            System.out.print(i + " ");
        }

        //3.Вывод реверсивного числа и суммы его цифр
        System.out.println("\n\n\n3. Вывод реверсивного числа и суммы его цифр\n");

        int num4 = 8975;
        int currentDigit;
        int i = 1;
        int result = 1;
        int sumOfDigits = 0;

        System.out.print("Исходное число в обратном порядке = ");
        //цикл для 4 разрядов
        while (i < 5) {
            currentDigit = ((num4 / result) % 10);
            sumOfDigits += currentDigit;
            System.out.print(currentDigit);
            result = result * 10;
            i++;
        }
        System.out.println("\nСумма его цифр = " + sumOfDigits);

        //4.Вывод чисел в несколько строк
        System.out.println("\n\n4. Вывод чисел в несколько строк\n");

        int max1 = 24;
        int count1 = 0;
        for (int j = 1; j < max1; j = j + 2) {
            count1++;
            System.out.printf("%3d", j);
            if (j == 9 | j == 19) {
                System.out.println();
            }
        }
        int countZero = 5 - count1 % 10;
        for (int k = 1; k <= countZero; k++) {
            System.out.printf("%3d", 0);
        }

        //5. Проверка количества двоек числа на четность/нечетность
        System.out.println("\n\n5. Проверка количества двоек числа на четность/нечетность\n");

        int num5 = 3242592;
        int factor = 1;
        int i1 = 1;
        int currentDigit2;
        int count2 = 0;
        String ss1;

        while (i1 < 8) {
            currentDigit2 = ((num5 / factor) % 10);
            factor = factor * 10;
            if (currentDigit2 == 2) {
                count2++;
            }
            i1++;
        }
        if (count2 % 2 == 0 | count2 == 1) {
            ss1 = "четное";
        } else {
            ss1 = "нечетное";
        }
        System.out.println("В " + num5 + " (" + ss1 + ") колличество двоек - " + count2);

        //6. Отображение геометрических фигур
        System.out.println("\n\n6. Отображение геометрических фигур\n");
        for (int i3 = 0; i3 < 50; i3++) {
            if (i3 % 10 == 0) {
                System.out.println();
            }
            System.out.print("*");
        }
        System.out.println("\n");

        int i4 = 0;

        while (i4 < 15) {
            System.out.print("#");
            if (i4 == 4 | i4 == 8 | i4 == 11 | i4 == 13) {
                System.out.println();
            }
            i4++;
        }

        System.out.println("\n");

        int i5 = 0;
        int i6 = 0;

        do {
            System.out.print("$");
            if (i5 == 0 | i5 == 2) {
                System.out.println();

            }
            i5++;
        } while (i5 < 6);

        System.out.println();

        do {
            System.out.print("$");
            if (i6 == 1) {
                System.out.println();
            }
            i6++;
        } while (i6 < 3);

        //7. Отображение ASCII-символов
        System.out.println("\n\n7. Отображение ASCII-символов\n");
        System.out.printf("%-10s%s%n", "DECIMAL", "CHARACTER");
        for (int i7 = '\0'; i7 <= '/'; i7++) {
            if (i7 % 2 != 0) {
                System.out.printf("%4d%11s%n", (i7), (char) i7);
            }
        }
        for (int i8 = 'a'; i8 <= 'z'; i8++) {
            if (i8 % 2 == 0) {
                System.out.printf("%4d%11s%n", (i8), (char) i8);
            }
        }

        //8. Проверка, является ли число палиндромом
        System.out.println("\n\n7. Проверка, является ли число палиндромом\n");

        int num6 = 1234321;
        int currentDigitInTheEnd;
        int reverse = 0;
        int copy = num6;

        // путем деления числа на 10 последовательно убираются последнй разряды, самая поседняя итерация даст 0
        while (copy > 0) {
            //нахождение цифры в первом разряде (едениц)
            currentDigitInTheEnd = copy % 10;
            //сборка полиндрома: текущее значение полиндрома * 10 + значение первого разряда, выделеное ранее из
            //исходного числа
            reverse = reverse * 10 + currentDigitInTheEnd;
            //уменьшаем копию заданного числа в 10 раз - убираем последнюю цифру
            copy /= 10;
        }
        if (reverse == num6) {
            System.out.println("Число " + num6 + " является палиндромом");
        } else {
            System.out.println("Число " + num6 + " не является палиндромом");
        }

        //9. Проверка, является ли число счастливым
        System.out.println("\n\n9. Проверка, является ли число счастливым\n");

        int num7 = 476812;
        int copy2 = num7;
        int currentDigitInTheEnd2;
        int sum1 = 0;
        int sum2 = 0;
        int lenght = 6;
        int count3 = 0;
        int firstHalf = 0;
        int secondHalf = 0;
        int kk = 1;

        for (int i10 = 0; i10 < lenght / 2; i10++) {
            kk = kk * 10;
        }

        while (count3 < lenght) {
            currentDigitInTheEnd2 = copy2 % 10;
            if (count3 < lenght / 2) {
                secondHalf = secondHalf * 10 + currentDigitInTheEnd2;
                sum1 += currentDigitInTheEnd2;
            } else {
                firstHalf = firstHalf * 10 + currentDigitInTheEnd2;
                sum2 += currentDigitInTheEnd2;
            }
            copy2 /= 10;
            count3++;
        }
        if (sum1 == sum2) {
            System.out.println("Число " + num7 + " является счастливым\n" +
                    "Сумма цифр " + firstHalf + " = " + sum1 + ", а сумма " + secondHalf + " = " + sum2);
        } else {
            System.out.println("Число " + num7 + " не является счастливым\n" +
                    "Сумма цифр " + firstHalf + " = " + sum1 + ", а сумма " + secondHalf + " = " + sum2);
        }

        //10. Отображение таблицы умножения Пифагора
        System.out.println("\n\n10. Отображение таблицы умножения Пифагора\n");

        System.out.printf("%11s%13s%n","ТАБЛИЦА", "ПИФАГОРА");
        System.out.printf("   |");
        for (int i9 = 2; i9 < 10; i9++) {
            System.out.printf("%2d ", i9);
        }
        System.out.printf("\n---|-----------------------\n");
        for (int i9 = 2; i9 < 10; i9++) {
            System.out.printf("%2d |", i9);
            for (int j9 = 2; j9 < 10; j9++) {
                System.out.printf("%2d ", i9 * j9);
            }
            System.out.printf("\n");
        }

    }
}





