package com.startjava.lesson_2_3_4.robot;

public class JaegerTest {
    public static void main(String[] args) {
        Jaeger crimsonTyphoon = new Jaeger("Crimson Typhoon", "Mark-4", "China", 72.6F, 1722F);
        Jaeger strikerEureka = new Jaeger();
        strikerEureka.setModelName("Striker Eureka");
        strikerEureka.setMark("Mark-5");
        strikerEureka.setOrigin("Australia");
        strikerEureka.setHeight(72.6F);
        strikerEureka.setWeight(1850F);
        System.out.println(crimsonTyphoon);
        System.out.println(strikerEureka);
        System.out.println(crimsonTyphoon.scanKaiju());
        strikerEureka.useWeapon();
        crimsonTyphoon.isMoving();
        strikerEureka.isDrifting();


    }
}
