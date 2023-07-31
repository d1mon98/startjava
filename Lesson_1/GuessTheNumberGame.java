public class GuessTheNumberGame {
    public static void main(String[] args) {

        int pcNumber = 40;
        int humanNumber = 40;
        System.out.println(humanNumber);

        if (humanNumber > 100) {
            System.out.println("Загадайте число в полудиапазоне (0,100]");
        } else if (humanNumber < pcNumber) {
            System.out.println("Число N меньше того, что загадал компьютер");
        } else if (humanNumber > pcNumber) {
            System.out.println("Число N больше того, что загадал компьютер");
        } else {
            System.out.println("Вы победили! ");
        }
    }
}
