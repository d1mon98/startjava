public class IfElseStatementTheme {

    public static int getHundr(int num){
    int hundr = num / 100;
    return hundr;
}

public static int getDoz(int num){
    int doz = (num/10)%10;
        return doz;
}

public static int getUnit (int num){
    int units = num%10;
        return units;
}

// public static void grade(int grade, String subject){
// if (grade <= 60) {
//     System.out.println(subject + " оценка = " + 2);
// } else if (grade > 60 & grade < 73) {
//     System.out.println(subject + " оценка = " + 3);
// } else if (grade >= 73 & grade < 91){
//         System.out.println(subject + " оценка = " + 4);
// } else {
//         System.out.println(subject + " оценка = " + 5);
// }
// }

public static int grade (int grade) {
    int result;
    if (grade <= 60) { 
        result = 2;
} else if (grade > 60 & grade < 73) {
        result = 3;
} else if (grade >= 73 & grade < 91) {
        result = 4;
} else {
        result = 5;
}return result;
}

    public static void main(String[] args) {
//1. Перевод псевдокода на язык Java
System.out.println("1. Перевод псевдокода на язык Java\n");

boolean isMale = true;
byte age = 36;
double height = 1.83;
String name = "Gregor";
char nameFirstLetter;

if (!isMale) {
    System.out.println("женщина");
} else {
    System.out.println("мужчина");
}

if (age >18) {
    System.out.println("совершеннолетний");
}else{
    System.out.println("несовершеннолетний");
}

if (height <1.8) {
    System.out.println("средний рост");
} else {
    System.out.println("высокий рост");
}

nameFirstLetter = name.charAt(0);
if (nameFirstLetter =='M') {
    System.out.println("Первая буква имени M");
} else if (nameFirstLetter == 'I') {
    System.out.println("Первая буква имени I");
} else {
    System.out.println("Первая буква имени не I и не М");
}

//2. Поиск большего числа
System.out.println("\n\n2. Поиск большего числа\n");

int a = 20;
int b = 20;

if (a>b) {
    System.out.println(a + " > " + b);
} else if (a<b){
    System.out.println(a + " < " + b);
} else {
    System.out.println(a + " = " + b);
}

//3. Проверка числа
System.out.println("\n\n3. Проверка числа\n");

int c = -10;

if(c==0) {
} if (c>0) {
    System.out.print("Число " + c + " является положительным и ");
} else if (c<0){
    System.out.print("Число " + c + " является отрицательным и ");
} if (c%2==0 & c!=0) {
    System.out.println("четным");
} else if (c%2!=0 & c!=0) {
    System.out.println("нечетным");
}

//4. Поиск одинаковых цифр в числах
System.out.println("\n\n4. Поиск одинаковых цифр в числах\n");

int d = 322;
int e = 323;

 if (getHundr(d) == getHundr(e) | getDoz(d) == getDoz(e) | getUnit(d) == getUnit (e)) {
    System.out.println("исходные числа: " + d + ", " + e);
    System.out.print("одинаковые в них цифры: ");
 if(getHundr(d) == getHundr(e)) {
    System.out.print(getHundr(d) + "  ");
  } if(getDoz(d) == getDoz(e)) {
    System.out.print(getDoz(d) + "  ");
  } if(getUnit(d) == getUnit(e)) {
    System.out.print(getUnit(d));
  }
    System.out.print("\nномера разрядов, в которых есть одинаковые цифры: ");
   if(getHundr(d) == getHundr(e)) {
    System.out.print(1 + "  ");
  } if(getDoz(d) == getDoz(e)) {
    System.out.print(2 + "  ");
  } if(getUnit(d) == getUnit(e)) {
    System.out.print(3);
  }
}
else {
    System.out.println("все цифры в разрядах разные");
}

//5. Определение символа по его коду
System.out.println("\n\n5. Определение символа по его коду\n");

char ch = '\u0031';

if (ch >= '0' & ch <= '9') {
    System.out.println("Символ " + ch + " является цифрой");
} else if (ch >= 'A' & ch <= 'Z') {
    System.out.println("Символ " + ch + " является большой буквой");
} else if (ch >= 'a' & ch <= 'z') {
    System.out.println("Символ " + ch + " является маленькой буквой");
} else {
    System.out.println("Символ " + ch + " не является ни буквой и ни цифрой");
}

//6. Подсчет суммы вклада и начисленных банком %
System.out.println("\n\n6. Подсчет суммы вклада и начисленных банком %\n");

double depositAmount = 300_000;
double interestRate;
double accuredAmount;


System.out.println("Cумма вклада = " + depositAmount);

if (depositAmount < 100_000){
    interestRate = 0.05;
} else if (depositAmount >= 100_000 & depositAmount < 300_000) {
    interestRate = 0.07;
} else {
    interestRate = 0.1;
}

    accuredAmount = interestRate*depositAmount;
    System.out.println("Процентная ставка = " + (int)(interestRate*100) + "%");
    System.out.println("Cумма начисленного % = " + accuredAmount);
    System.out.println("Итоговая сумма с % = " + (depositAmount + accuredAmount));

//7. Определение оценки по предметам
System.out.println("\n\n7. Определение оценки по предметам\n");

System.out.println("История: " + grade (59));
System.out.println("Программирование: " + grade (92));
System.out.println("Средний балл по оценок по предметам: " + (double)(grade(59) + grade(92))/2);
System.out.println("Средний % по предметам: " + (double)(59 + 92)/(double)2);


//8. Расчет годовой прибыли
System.out.println("\n\n8. Расчет годовой прибыли\n");

int gross = 914_000;
int rent = 5_000;
int productionCost = 9_000;
int income = gross -(rent+productionCost);
// int n1000000 = income / 1000000;
// int n0100000 = income / 100000;
// int n0010000 = income / 10000;
int n1001000 = income / 1000;
// int n1000100 = income / 100;
// int n1000010 = income / 10;

if (income != 0) {
    System.out.println("Прибыль за год: " + n1001000 + " 000" + " руб");
} else {
        System.out.println("Прибыль за год: " + income + " руб");
}
}
}

