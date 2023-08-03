public class WolfTest {
    public static void main(String[] args) {

        Wolf w = new Wolf();
        w.setSex("male");
        w.setAge(14);
        w.setColor("gray");
        w.setNickname("Akela");
        w.setWeight(38);

        System.out.println();
        System.out.println("sex " + w.getSex());
        System.out.println("age " + w.getAge());
        System.out.println("color " + w.getColor());
        System.out.println("nickname " + w.getNickname());
        System.out.println("weight " + w.getWeight());
        System.out.println();

        w.go();
        w.hunt();
        w.run();
        w.sit();

    }

}
