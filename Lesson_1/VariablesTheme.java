public class VariablesTheme {
    public static void main(String[] args) {
        //1. Вывод характеристик компьютера
        System.out.println("\n1. Вывод характеристик компьютера.\n");

        byte cpuQuantity = 2;
        short processorClockSpeed = 2600;
        long totalRam = 8;
        float hddVolume = 512.5F;
        double bluetoothVersion = 4.2;
        char inStock = 'y';
        boolean ifOsInstalled = false;

        System.out.println("CPU quantity: " + cpuQuantity + " pcs");
        System.out.println("Processor clock speed: " + processorClockSpeed + " GHz");
        System.out.println("Total RAM: " + totalRam + " Gb");
        System.out.println("HDD Volume: " + hddVolume + " Gb");
        System.out.println("Bluetooth version: " + bluetoothVersion);
        System.out.println("OS installed: " + ifOsInstalled);
        System.out.println("In stock: " + inStock + "\n");    

        //2. Расчет стоимости товара со скидкой
        System.out.println("\n2. Расчет стоимости товара со скидкой.\n"); 

        int penPrice = 100;
        int bookPrice = 200;
        int dicountPercent =11;
        int totalPrice = penPrice+bookPrice;

        System.out.println("Общая стоимость товара без скидки = " + totalPrice);
        System.out.println("Сумма скидки = " + totalPrice*dicountPercent/100 );
        System.out.println("Общая стоимость товара со скидкой = " + (totalPrice
            -totalPrice*dicountPercent/100) + "\n");

        //3. Вывод слова JAVA
        System.out.println("\n3. Вывод слова JAVA.\n"); 
        System.out.println("   J    a  v     v  a      ");
        System.out.println("   J   a a  v   v  a a        "); 
        System.out.println("J  J  aaaaa  V V  aaaaa    ");
        System.out.println(" JJ  a     a  V  a     a" + "\n");  

        //4. Вывод min и max значений целых числовых типов
        System.out.println("\n4. Вывод min и max значений целых числовых типов.\n"); 

        byte a=127;
        short b=32_767;
        int c=2_147_483_647;
        long d=9_223_372_036_854_775_807L;

        System.out.println("byte = " + a);
        System.out.println("short = " + b);
        System.out.println("int = " + c);
        System.out.println("long = " + d);  
        System.out.println("byte = " + ++a);  
        System.out.println("short = " + ++b);
        System.out.println("int = " + ++c);
        System.out.println("long = " + ++d); 
        System.out.println("byte = " + --a);  
        System.out.println("short = " + --b);
        System.out.println("int = " + --c);
        System.out.println("long = " + --d); 

        //5. Перестановка значений переменных
        System.out.println("\n\n5. Перестановка значений переменных.\n");

        int e=2;
        int f=5;
        int g;

        System.out.println("Перестановка с помощью третьей переменной:");
        System.out.println("до перестановки: первая переменная = " + e + ", вторая переменная = " +
                f );

        g=e;
        e=f;
        f=g;

        System.out.println("после перестановки: первая переменная = " + e + ", вторая переменная = "
                + f + "\n");
        System.out.println("Перестановка с помощью арифметических операций:");
        System.out.println("до перестановки: первая переменная = " + e + ", вторая переменная = " 
                + f );
        System.out.println("после перестановки: первая переменная = " + (e=e+f-(f=e)) + ", вторая"
                + " переменная = " + f + "\n");
        System.out.println("Перестановка с помощью побитовой операции ^:");
        System.out.println("до перестановки: первая переменная = " + e + ", вторая переменная = " +
                f );

        e = e^f;
        f = f^e;
        e = e^f;

        System.out.println("после перестановки: первая переменная = " + e + ", вторая переменная = "
           + f + " \n");

        //6. Вывод символов и их кодов
        System.out.println("\n6. Вывод символов и их кодов.\n"); 

        char ch1 = '$';         //36
        char ch2 = '*';        //42
        char ch3 = '@';         //64
        char ch4 = '|';         //124
        char ch5 = '~';         //126

        System.out.println(ch1 + " " + (ch1+0));
        System.out.println(ch2 + " " + (ch2+0));
        System.out.println(ch3 + " " + (ch3+0));
        System.out.println(ch4 + " " + (ch4+0));
        System.out.println(ch5 + " " + (ch5+0) + "\n");

        //7. Вывод в консоль ASCII-арт Дюка
        System.out.println("\n7. Вывод в консоль ASCII-арт Дюка.\n"); 

        char chd1 = '/';
        char chd2 = 92;
        char chd3 = '_';
        char chd4 = '(';
        char chd5 = ')';

        System.out.println("    " + chd1 + chd2);
        System.out.println("   " + chd1 + "  " + chd2);
        System.out.println("  " + chd1 + chd3 + chd4 + " " + chd5 + chd2);
        System.out.println(" " + chd1 + "      " + chd2);
        System.out.println("" + chd1 + chd3 + chd3 + chd3 + chd3 + chd1 + chd2 + chd3 + chd3 + chd2
                + "\n");

        //8. Вывод количества сотен, десятков и единиц числа
        System.out.println("\n8. Вывод количества сотен, десятков и единиц числа.\n");

        int num = 123;
        int hundr = num/100; 
        int doz = (num/10)%10;
        int units = num%10;

        System.out.println("Число N содержит:\nсотен - " + hundr + "\nдесятков - " + doz + 
            "\nединиц - " + units+ "\n");
        System.out.println("Сумма его цифр = "+ (hundr+doz+units));
        System.out.println("Произведение = "+ (hundr*doz*units) + "\n");

        //9. Вывод времени
        System.out.println("\n9. Вывод времени.\n");

        int sec1 = 86399;
        int sec2 = (sec1/60)%60;
        int minutes = sec1%60; //59
        int hours = sec1/3600; //23 

        System.out.println(hours + ":" + minutes + ":" + sec2);
    }
}