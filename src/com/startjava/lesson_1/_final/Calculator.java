package com.startjava.lesson_1._final;

public class Calculator {

    public static void main(String[] args) {
        int num1 = 2;
        int num2 = 10;
        char sign = '^';
        int result = 1;

        if (sign == '+') {
            result = num1 + num2;
        } else if (sign == '-') {
            result = num1 - num2;
        } else if (sign == '*') {
            result = num1 * num2;
        } else if (sign == '/') {
            result = num1 / num2;
        } else if (sign == '/') {
            result = num1 / num2;
        } else if (sign == '%') {
            result = num1 % num2;
        } else if (sign == '^') {
            for (int i = 0; i < num2; i++) {
                result *= num1;
            }
        }
        System.out.println(num1 + " " + sign + " " + num2 + " = " + result);
    }
}
