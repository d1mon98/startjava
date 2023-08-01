public class Calculator {
    // TODO +, -, *, /, ^, %
    static int a = 2;
    static int b = 2;
    static char sign = '^';
    static int result;

    public static void main(String[] args) {

        if (sign == '+') {
            result = a + b;
        } else if (sign == '*') {
            result = a * b;
        } else if (sign == '/') {
            result = a / b;
        } else if (sign == '%') {
            result = a % b;
        } else if (sign == '^') {
            int i = 0;
            result = 1;
            while (i < b) {
                result = result * a;
                i++;
            }
        }
        System.out.println(a + " " + sign + " " + b + " = " + result);
    }
}


