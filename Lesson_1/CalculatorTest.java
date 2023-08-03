import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {

        String answer;
        do {
            Scanner scanner = new Scanner(System.in);
            Calculator calc = new Calculator();

            System.out.print("Введите первое число: ");
            int firstNubmer = scanner.nextInt();
            calc.setFirstnumber(firstNubmer);

            System.out.print("Введите знак математической операции: ");
            String text = scanner.next();
            char mathOperation = text.charAt(0);
            calc.setMathOperation(mathOperation);

            System.out.print("Введите второе число: ");
            int secondNumber = scanner.nextInt();
            calc.setSecondNumber(secondNumber);

            calc.calculate();
            System.out.println();

            do {
                System.out.print("Хотите продолжить вычисления? [yes/no]: ");
                answer = scanner.next();
            }
            while (!answer.equals("yes") && !answer.equals("no"));
            System.out.println();
        }
        while (answer.equals("yes"));

    }
}
