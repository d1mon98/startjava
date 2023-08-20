package com.startjava.lesson_1.base;

public class VariablesTheme {
    public static void main(String[] args) {
        //1. Вывод характеристик компьютера
        System.out.println("1. Вывод характеристик компьютера\n");

        byte cpuQuantity = 2;
        short cpuClockSpeed = 2600;
        int ramModules = 2;
        long totalRam = 8;
        float hddVolume = 512.5F;
        double bluetoothVersion = 4.2;
        boolean used = false;
        char inStock = 'y';

        System.out.println("CPU quantity: " + cpuQuantity + " pcs.");
        System.out.println("CPU clock speed: " + cpuClockSpeed + " GHz");
        System.out.println("RAM modules: " + ramModules + " pcs.");
        System.out.println("Total RAM: " + totalRam + " Gb");
        System.out.println("HDD Volume: " + hddVolume + " Gb");
        System.out.println("Bluetooth version: " + bluetoothVersion);
        System.out.println("Used: " + used);
        System.out.println("In stock (y/n): " + inStock);

        //2. Расчет стоимости товара со скидкой
        System.out.println("\n\n2. Расчет стоимости товара со скидкой\n");

        int penPrice = 100;
        int bookPrice = 200;
        int totalPrice = penPrice + bookPrice;
        int discountPercent = 11;
        int discountPrice = totalPrice * discountPercent / 100;

        System.out.println("Общая стоимость товара без скидки = " + totalPrice);
        System.out.println("Сумма скидки = " + discountPrice);
        System.out.println("Общая стоимость товара со скидкой = " + (totalPrice - discountPrice));

        //3. Вывод слова JAVA
        System.out.println("\n\n3. Вывод слова JAVA\n");
        System.out.println("   J    a  v     v  a");
        System.out.println("   J   a a  v   v  a a");
        System.out.println("J  J  aaaaa  V V  aaaaa");
        System.out.println(" JJ  a     a  V  a     a");

        //4. Вывод min и max значений целых числовых типов
        System.out.println("\n\n4. Вывод min и max значений целых числовых типов\n");

        byte byte1 = 127;
        short short1 = 32_767;
        int int1 = 2_147_483_647;
        long long1 = 9_223_372_036_854_775_807L;

        System.out.println("Переменная типа byte: ");
        System.out.println("первоначальное значение = " + byte1);
        System.out.println("значение после инкремента на единицу = " + ++byte1 +
                "\nзначение после декремента на единицу = " + --byte1);
        System.out.println("\nПеременная типа short: ");
        System.out.println("первоначальное значение = " + short1);
        System.out.println("значение после инкремента на единицу = " + ++short1 +
                "\nзначение после декремента на единицу = " + --short1);
        System.out.println("\nПеременная типа int: ");
        System.out.println("первоначальное значение = " + int1);
        System.out.println("значение после инкремента на единицу = " + ++int1 +
                "\nзначение после декремента на единицу = " + --int1);
        System.out.println("\nПеременная типа long: ");
        System.out.println("первоначальное значение = " + long1);
        System.out.println("значение после инкремента на единицу = " + ++long1 +
                "\nзначение после декремента на единицу = " + --long1);

        //5. Перестановка значений переменных
        System.out.println("\n\n5. Перестановка значений переменных\n");

        int a = 2;
        int b = 5;
        int tmp = a;

        System.out.println("Перестановка с помощью третьей переменной:" +
                "\nдо перестановки: a = " + a + ", b = " + b);
        a = b;
        b = tmp;
        System.out.println("после перестановки: a = " + a + ", b = " + b);
        System.out.println("\nПерестановка с помощью арифметических операций:" +
                "\nдо перестановки: a = " + a + ", b = " + b +
                "\nпосле перестановки: a = " + (a = a + b - (b = a)) + ", b = " + b);
        System.out.println("\nПерестановка с помощью побитовой операции ^:" +
                "\nдо перестановки: a = " + a + ", b = " + b);
        a ^= b;
        b ^= a;
        a ^= b;
        System.out.println("после перестановки: a = " + a + ", b = " + b);

        //6. Вывод символов и их кодов
        System.out.println("\n\n6. Вывод символов и их кодов.\n");

        char dollar = '$';
        char asterisk = '*';
        char atSign = '@';
        char verticalBar = '|';
        char tilde = '~';

        System.out.println(dollar + " " + (int) dollar);
        System.out.println(asterisk + " " + (int) asterisk);
        System.out.println(atSign + " " + (int) atSign);
        System.out.println(verticalBar + " " + (int) verticalBar);
        System.out.println(tilde + " " + (int) tilde);

        //7. Вывод в консоль ASCII-арт Дюка
        System.out.println("\n\n7. Вывод в консоль ASCII-арт Дюка\n");

        char slash = '/';
        char backslash = '\\';
        char underscore = '_';
        char leftParenthesis = '(';
        char rightParenthesis = ')';

        System.out.println("    " + slash + backslash);
        System.out.println("   " + slash + "  " + backslash);
        System.out.println("  " + slash + underscore + leftParenthesis + " "
                + rightParenthesis + backslash);
        System.out.println(" " + slash + "      " + backslash);
        System.out.println("" + slash + underscore + underscore + underscore + underscore +
                slash + backslash + underscore + underscore + backslash);

        //8. Вывод количества сотен, десятков и единиц числа
        System.out.println("\n\n8. Вывод количества сотен, десятков и единиц числа\n");

        int num = 123;
        int hundreds = num / 100;
        int tens = (num / 10) % 10;
        int ones = num % 10;

        System.out.println("Число " + num + " содержит:\nсотен - " + hundreds +
                "\nдесятков - " + tens + "\nединиц - " + ones);
        System.out.println("Сумма его цифр = " + (hundreds + tens + ones));
        System.out.println("Произведение = " + (hundreds * tens * ones));

        //9. Вывод времени
        System.out.println("\n\n9. Вывод времени\n");

        int totalSeconds = 86399;
        int ss = (totalSeconds / 60) % 60;
        int mm = totalSeconds % 60; //59
        int hh = totalSeconds / 3600; //23

        System.out.println(hh + ":" + mm + ":" + ss);
    }
}