package com.startjava.lesson_1;

public class IfElseStatementTheme {

    public static void main(String[] args) {
        //1. Перевод псевдокода на язык Java
        System.out.println("1. Перевод псевдокода на язык Java\n");

        boolean isMale = true;
        byte age = 36;
        double height = 1.83;
        String name = "Gregory";
        char nameFirstLetter = name.charAt(0);

        if (!isMale) {
            System.out.println("женщина");
        } else {
            System.out.println("мужчина");
        }
        if (age > 18) {
            System.out.println("совершеннолетний");
        } else {
            System.out.println("несовершеннолетний");
        }
        if (height < 1.8) {
            System.out.println("средний рост");
        } else {
            System.out.println("высокий рост");
        }
        if (nameFirstLetter == 'M') {
            System.out.println("Первая буква имени M");
        } else if (nameFirstLetter == 'I') {
            System.out.println("Первая буква имени I");
        } else {
            System.out.println("Первая буква имени не I и не М");
        }

        //2. Поиск большего числа
        System.out.println("\n\n2. Поиск большего числа\n");

        int num1 = 20;
        int num2 = 20;

        if (num1 > num2) {
            System.out.println(num1 + " > " + num2);
        } else if (num1 < num2) {
            System.out.println(num1 + " < " + num2);
        } else {
            System.out.println(num1 + " = " + num2);
        }

        //3. Проверка числа
        System.out.println("\n\n3. Проверка числа\n");

        int num3 = -10;

        if (num3 == 0) {
        }
        if (num3 > 0) {
            System.out.print("Число " + num3 + " является положительным и ");
        } else if (num3 < 0) {
            System.out.print("Число " + num3 + " является отрицательным и ");
        }
        if (num3 % 2 == 0 & num3 != 0) {
            System.out.println("четным");
        } else if (num3 % 2 != 0 & num3 != 0) {
            System.out.println("нечетным");
        }

        //4. Поиск одинаковых цифр в числах
        System.out.println("\n\n4. Поиск одинаковых цифр в числах\n");

        int num4 = 322;
        int num5 = 323;

        if (getHundreds(num4) == getHundreds(num5) | getTens(num4) == getTens(num5)
                | getOnes(num4) == getOnes(num5)) {
            System.out.println("исходные числа: " + num4 + ", " + num5);
            System.out.print("цифры, одинаковые в обоих числах: ");
            if (getHundreds(num4) == getHundreds(num5)) {
                System.out.print(getHundreds(num4) + "  ");
            }
            if (getTens(num4) == getTens(num5)) {
                System.out.print(getTens(num4) + "  ");
            }
            if (getOnes(num4) == getOnes(num5)) {
                System.out.print(getOnes(num4));
            }
            System.out.print("\nномера разрядов с одинаковыми цифрам: ");
            if (getHundreds(num4) == getHundreds(num5)) {
                System.out.print(1 + "  ");
            }
            if (getTens(num4) == getTens(num5)) {
                System.out.print(2 + "  ");
            }
            if (getOnes(num4) == getOnes(num5)) {
                System.out.print(3);
            }
        } else {
            System.out.println("Цифры во всех разрядах разные");
        }

        //5. Определение символа по его коду
        System.out.println("\n\n\n5. Определение символа по его коду\n");

        char symbol = '\u005E';

        if (symbol >= '0' & symbol <= '9') {
            System.out.println("Символ " + symbol + " является цифрой");
        } else if (symbol >= 'A' & symbol <= 'Z') {
            System.out.println("Символ " + symbol + " является большой буквой");
        } else if (symbol >= 'a' & symbol <= 'z') {
            System.out.println("Символ " + symbol + " является маленькой буквой");
        } else {
            System.out.println("Символ " + symbol + " не является ни буквой и ни цифрой");
        }

        //6. Подсчет суммы вклада и начисленных банком %
        System.out.println("\n\n6. Подсчет суммы вклада и начисленных банком %\n");

        double depositAmount = 300_000;
        double interestRate;
        double accrualAmount;

        System.out.println("Cумма вклада = " + depositAmount);
        if (depositAmount < 100_000) {
            interestRate = 0.05;
        } else if (depositAmount >= 100_000 & depositAmount < 300_000) {
            interestRate = 0.07;
        } else {
            interestRate = 0.1;
        }
        accrualAmount = interestRate * depositAmount;
        System.out.println("Процентная ставка = " + (int) (interestRate * 100) + "%");
        System.out.println("Cумма начисленного % = " + accrualAmount);
        System.out.println("Итоговая сумма с % = " + (depositAmount + accrualAmount));

        //7. Определение оценки по предметам
        System.out.println("\n\n7. Определение оценки по предметам\n");

        System.out.println("История: " + grade(59));
        System.out.println("Программирование: " + grade(92));
        System.out.println("Средний балл по оценок по предметам: " +
                (double) (grade(59) + grade(92)) / 2);
        System.out.println("Средний % по предметам: " + (double) (59 + 92) / 2.0);

        //8. Расчет годовой прибыли
        System.out.println("\n\n8. Расчет годовой прибыли\n");

        int gross = 13_000;
        int rentCost = 5_000;
        int productionCost = 9_000;
        int income = gross - (rentCost + productionCost);
        int n10 = income / 1000;

        if (income > 0) {
            System.out.println("Прибыль за год: +" + n10 + " 000" + " руб");
        } else if (income < 0) {
            System.out.println("Прибыль за год: " + n10 + " 000" + " руб");
        } else if (income == 0) {
            System.out.println("Прибыль за год: " + income + " руб");
        }
    }

    public static int getHundreds(int num) {
        return num / 100;
    }

    public static int getTens(int num) {
        return (num / 10) % 10;
    }

    public static int getOnes(int num) {
        return num % 10;
    }

    public static int grade(int grade) {
        int result;
        if (grade <= 60) {
            result = 2;
        } else if (grade > 60 & grade < 73) {
            result = 3;
        } else if (grade >= 73 & grade < 91) {
            result = 4;
        } else {
            result = 5;
        }
        return result;
    }
}


