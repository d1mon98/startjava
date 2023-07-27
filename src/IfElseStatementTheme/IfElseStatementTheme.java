public class IfElseStatementTheme {
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
    System.out.println("Первая буква имени не I и не М\n");
}

//2. Поиск большего числа
System.out.println("Поиск большего числа\n");

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
System.out.println("Проверка числа\n");

int c = 2;

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











}
}

