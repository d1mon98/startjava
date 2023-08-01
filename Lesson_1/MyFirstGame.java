public class MyFirstGame {

    //TODO: Игра “Угадай число”:
    //компьютер "загадывает" целое число в полуинтервале (0, 100], которое игроку в автоматическом режиме необходимо угадать
    //меняйте значение переменной, хранящей числа игрока, автоматически по какому-то простому алгоритму: без применения ввода с клавиатуры или генерации случайных чисел (как в “Калькуляторе”)
    //после каждой неудачной попытки игрока выводите подсказку:
    //Число N больше того, что загадал компьютер
    //или
    //Число N меньше того, что загадал компьютер
    //
    //если число угадано, выводите — "Вы победили!"
    //игра продолжается до тех пор, пока число не будет угадано
    public static void main(String[] args) {

        int pcNumber = 50;
        int humanNumber = 40;

        while (pcNumber != humanNumber) {
            if (humanNumber > 100) {
                System.out.println("Загадайте число в полудиапазоне (0,100]");
            } else if (humanNumber < pcNumber) {
                System.out.println("Число " + humanNumber + " меньше того, что загадал компьютер");
                humanNumber++;
            } else if (humanNumber > pcNumber) {
                System.out.println("Число " + humanNumber + " больше того, что загадал компьютер");
                humanNumber--;
            }
        }
        System.out.println("\nВы победили! Ваше число " + humanNumber + " и компьютер загадал " + pcNumber);
    }
}
