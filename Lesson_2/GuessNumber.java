import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    //TODO:Правила игры:
    //в игре участвуют два игрока, которые по очереди будут пытаться угадать число, загаданное компьютером, вводя его с клавиатуры
    //ход к следующему игроку переходит после неудачного угадывания текущего игрока
    //одержать победу может только один игрок
    //игра продолжается до тех пор, пока число не будет угадано
    //в игре должны использоваться только целые положительные числа в полуинтервале (0, 100]

    //создайте классы:
    //GuessNumber — отвечает за игровой процесс
    //Player — описывает игроков (один экземпляр класса соответствует одному игроку)

    //GuessNumberTest — отвечает за создание объектов, их инициализацию, запуск игры, ввод и обработку ответа игрока о продолжении/завершении. Содержит метод main
    //имена игроков вводите с клавиатуры
    //для инициализации поля name в классе Player используйте конструктор

    //созданных игроков передавайте в GuessNumber через ее конструктор и присвойте двум полям с типом Player
    //для загадывания компьютером числа используйте класс Math.random() или Random
    //после каждой неудачной попытки игроков выводите подсказку:
    //"Число N больше того, что загадал компьютер" или
    //"Число N меньше того, что загадал компьютер"
    //по окончанию игры выводите сообщение "Хотите продолжить игру? [yes/no]: ":
    //yes — игра запускается повторно с теми же самыми игроками и новым угадываемым числом
    //no — игра завершается
    //при ином значении выводите сообщение до тех пор, пока не будут введены допустимые


    // создени игроков через констурктор класса
    private Player pl1;
    private Player pl2;

    public GuessNumber(Player pl1, Player pl2) {
        this.pl1 = pl1;
        this.pl2 = pl2;
    }

    public void start() {
        String answer;

        //задание числа, которе загадал компьютер
        Random rnd = new Random();
        Scanner scanner = new Scanner(System.in);
        int pcNumber = rnd.nextInt(100+1);


        //первичнй, разовый ввод чисел игроками
        System.out.println("Компьютер загадал случайное  число в полудиапазоне (0,100], игроки должны его угадать, \nвыигрывает тот кто угадает первым.\n ");

        //первый игрок
        System.out.print("Игрок " + pl1.getName() + ", введите ваше число: ");
        int player1Number = scanner.nextInt();
        while (player1Number > 100) {
            System.out.print(pl2.getName() + ", загадайте число в полудиапазоне (0,100]: ");
            player1Number = scanner.nextInt();
        }

        //второй игрок
        System.out.print("Игрок " + pl2.getName() + ", введите ваше число: ");
        int player2Number = scanner.nextInt();
        while (player2Number > 100) {
            System.out.print(pl2.getName() + ", задайте число в полудиапазоне (0,100]: ");
            player2Number = scanner.nextInt();
        }


        //последующий, зацикленный ввод чисел
        while ((pcNumber != player1Number) & pcNumber != player2Number) {
            System.out.println();
            if (player1Number < pcNumber) {
                System.out.println("Число " + player1Number + ", которое ввел игрок " + pl1.getName() + " меньше того, что загадал компьютер");
            }
            if (player1Number > pcNumber) {
                System.out.println("Число " + player1Number + ", которое ввел игрок " + pl1.getName() + " больше того, что загадал компьютер");
            }

            if (player2Number < pcNumber) {
                System.out.println("Число " + player2Number + ", которое ввел игрок " + pl2.getName() + " меньше того, что загадал компьютер");
            }
            if (player2Number > pcNumber) {
                System.out.println("Число " + player2Number + ", которое ввел игрок " + pl2.getName() + " больше того, что загадал компьютер");
            }

            System.out.print("\nИгрок " + pl1.getName() + ", введите ваше число: ");
            player1Number = scanner.nextInt();
            while (player1Number > 100) {
                System.out.print(pl1.getName() + ", загадайте число в полудиапазоне (0,100]: ");
                player1Number = scanner.nextInt();
            }
            System.out.print("Игрок " + pl2.getName() + ", введите ваше число: ");

            player2Number = scanner.nextInt();
            while (player2Number > 100) {
                System.out.print(pl2.getName() + ", задайте число в полудиапазоне (0,100]: ");
                player2Number = scanner.nextInt();
            }

        }

        //обявление о победе игроков
        if ((pcNumber == player1Number) & (pcNumber == player2Number)) {
            System.out.println("\nОба игрока: " + pl1.getName() + " и " + pl2.getName() + " выиграли\n");
        } else if (pcNumber == player1Number) {
            System.out.println("\n" + pl1.getName() + ", вы загадали число " + player1Number + " и выиграли, компьютер тоже загадал число " + pcNumber);
        } else if (pcNumber == player2Number) {
            System.out.println("\n" + pl2.getName() + ", вы загадали число " + player2Number + " и выиграли, компьютер тоже загадал число " + pcNumber);
        }
    }
}

