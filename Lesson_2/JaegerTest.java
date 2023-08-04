public class JaegerTest {
    public static void main(String[] args) {

        Jaeger crimsonTyphoon = new Jaeger();
        crimsonTyphoon.setModelName("Crimson Typhoon");
        crimsonTyphoon.setMark("Mark-4");
        crimsonTyphoon.setOrigin("China");
        crimsonTyphoon.setHeight(72.6F);
        crimsonTyphoon.setWeight(1722F);

        Jaeger strikerEureka = new Jaeger();
        strikerEureka.setModelName("Striker Eureka");
        strikerEureka.setMark("Mark-5");
        strikerEureka.setOrigin("Australia");
        strikerEureka.setHeight(76.2F);
        strikerEureka.setWeight(1850F);

        System.out.println(crimsonTyphoon);
        System.out.println(strikerEureka);
        System.out.println(crimsonTyphoon.scanKaiju());
        strikerEureka.useWeapon();
        crimsonTyphoon.move();
        strikerEureka.drift();




    }
}
