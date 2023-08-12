package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

import static com.startjava.lesson_2_3_4.calculator.Calculator.*;

public class CalculatorTest {
    public static void main(String[] args) {

        String answer = "yes";
        do {
            Scanner scanner = new Scanner(System.in);
            Calculator calc = new Calculator();
            System.out.print("Введите математическое выражение: ");
            String expression = scanner.nextLine();
            String[] expression1 = calc.setExpression(expression);

            calc.setFirstNumber(Integer.parseInt(expression1[0]));
            calc.setMathOperation(expression1[1].charAt(0));
            calc.setSecondNumber(Integer.parseInt(expression1[2]));

            printCalc(calc.calculate(expression1), expression1);
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
