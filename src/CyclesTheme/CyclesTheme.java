public class CyclesTheme {
    public static void main(String[] args) {

//1.Подсчет суммы четных и нечетных чисел
System.out.println("1.Подсчет суммы четных и нечетных чисел\n");
    int evenSum = 0;
    int oddSum = 0;
    int startNum = -10;

    do { 
        if (startNum%2==0) {
            evenSum += startNum;
        } else {
            oddSum += startNum;
        }
        startNum++;
        }
    while (startNum <=21);
System.out.println("В отрезке [-10, 21] сумма четных чисел = " + evenSum + ", а нечетных = "
        + oddSum);

//2. Вывод чисел в порядке убывания
System.out.println("\n\n2. Вывод чисел в порядке убывания\n");

    int num1 = 10;
    int num2 = 5;
    int num3 = -1;
    int min;
    int max;

    if(num1 < num2){
        min = num1;
        max = num2;
    } else {
        min = num2;
        max = num1;
    } 
    if(num3 < min){
        min = num3;
    }
    if(num3 > max){
        max = num3;
    }
    System.out.println("min " + min);
    System.out.println("max " + max);

for (int i = min; i <= max; i++) {
System.out.print(i + " ");
}




}
}

