package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    private double firstNumber;
    private double secondNumber;
    private char mathOperation;

    public String[] setExpression(String expression) {

        return expression.split(" ");
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public void setMathOperation(char mathOperation) {
        this.mathOperation = mathOperation;
    }

    public static void printCalc(double result, String[] array) {
        if (((int) result == result) & result != 0) {
            System.out.print(array[0] + " " + array[1] + " " + array[2] + " = ");
            System.out.printf("%.0f", result);

        }
        if ((int) result != result) {
            System.out.print(array[0] + " " + array[1] + " " + array[2] + " = ");
            System.out.printf("%.3f", result);

        }
        if (result == 0) {
            System.out.print("");

        }
    }

    //  +, -, *, /, ^, %
    public double calculate(String[] array) {
        double result = 0;
        switch (mathOperation) {
            case '+' -> result = (firstNumber + secondNumber);
            case '-' -> result = (firstNumber - secondNumber);
            case '*' -> result = (firstNumber * secondNumber);
            case '/' -> result = (firstNumber / secondNumber);
            case '%' -> result = (firstNumber % secondNumber);
            case '^' -> result = (Math.pow(firstNumber, secondNumber));
            default -> System.out.println("Ошибка: знак " + array[1].charAt(0) + " не поддерживается");
        }
        return result;
    }
}






