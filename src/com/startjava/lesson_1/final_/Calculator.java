package com.startjava.lesson_1.final_;

public class Calculator {

    private int firstNumber;
    private int secondNumber;
    private char mathOperation;




    public void setFirstnumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public void setMathOperation(char mathOperation) {
        this.mathOperation = mathOperation;
    }

    //  +, -, *, /, ^, %
    public void calculate() {
        switch (mathOperation) {
            case '+':
                System.out.println(firstNumber + secondNumber);
                break;
            case '-':
                System.out.println(firstNumber - secondNumber);
                break;
            case '*':
                System.out.println(firstNumber * secondNumber);
                break;
            case '/':
                System.out.println(firstNumber / secondNumber);
                break;
            case '%':
                System.out.println(firstNumber % secondNumber);
                break;
            case '^':
                pow();
                break;
            default:
                System.out.println("Введеная математическая операция не поддерживается");
                break;
        }
    }
    private void pow() {
        int result = 1;
        int i = 0;
        while (i < secondNumber) {
            result = result * firstNumber;
            i++;
        }

        System.out.println(result);
    }
}






