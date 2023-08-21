package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    private double num1;
    private double num2;
    private char mathSymbol;

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public void setMathSymbol(char mathSymbol) {
        this.mathSymbol = mathSymbol;
    }

    public String[] splitExpression(String expression) {
        return expression.split(" ");
    }

    public static void printCalc(double result, String[] array) {
        System.out.print(array[0] + " " + array[1] + " " + array[2] + " = ");
        System.out.printf(result % 1 == 0 ? "%.0f" : "%.3f", result);
    }

    //  +, -, *, /, ^, %
    public double calculate(String[] array) {
        double result = 0;
        switch (mathSymbol) {
            case '+' -> result = (num1 + num2);
            case '-' -> result = (num1 - num2);
            case '*' -> result = (num1 * num2);
            case '/' -> result = (num1 / num2);
            case '%' -> result = (num1 % num2);
            case '^' -> result = (Math.pow(num1, num2));
            default -> System.out.println("Ошибка: знак " + mathSymbol + " не поддерживается");
        }
        return result;
    }
}






