public class Calculator {

    static int a = 11;
    static int b = 5;
    static char sign = '%';
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
            int i = 1;
            result = a;
            while (i < b) {
                result = result * a;
                i++;
            }
            System.out.println(a + " " + sign + " " + b + " = " + result);
        }
    }
}
