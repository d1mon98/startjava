import java.util.Scanner;

public class GuessNubmerTest {
    public static void main(String[] args) {

        //приветствие и ввод имен игроков
        Scanner scanner = new Scanner(System.in);
        System.out.println("Добрый день, начинаем игру 'Угадай число'");
        System.out.println();
        System.out.print("Введите имя первого игрока: ");
        String name1 = scanner.nextLine();
        System.out.print("Введите имя второго игрока: ");
        String name2 = scanner.nextLine();
        System.out.println();

        //создание игроков
        Player player1 = new Player(name1);
        Player player2 = new Player(name2);

        //передаем двух игроков
        GuessNumber game = new GuessNumber(player1, player2);
        String answer = "yes";

        do {
            if ("yes".equals(answer)) {
                game.start();
            }
            System.out.print("Хотите продолжить игру? [yes/no]:");
            answer = scanner.nextLine();
        }
        while (!"no".equals(answer));
        System.out.println("Игра окончена");

    }
}