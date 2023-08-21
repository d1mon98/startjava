package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

import static com.startjava.lesson_2_3_4.calculator.Calculator.*;

public class CalculatorTest {
    public static void main(String[] args) {
        String answer = "yes";
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите математическое выражение: ");
            String expression = scanner.nextLine();
            Calculator calc = new Calculator();
            String[] expressionArray = calc.splitExpression(expression);
            calc.setNum1(Integer.parseInt(expressionArray[0]));
            calc.setMathSymbol(expressionArray[1].charAt(0));
            calc.setNum2(Integer.parseInt(expressionArray[2]));
            printCalc(calc.calculate(), expressionArray);
            System.out.println();
            for (int i = 0; i < 1000; i++) {
                System.out.print("Хотите продолжить вычисления? [yes/no]: ");
                answer = scanner.next();
                if (answer.equals("yes") || answer.equals("no")) {
                    break;
                }
            }
        }
        while (answer.equals("yes"));
    }
}
