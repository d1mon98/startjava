package com.startjava.lesson_2_3_4.robot;

public class JaegerTest {
    public static void main(String[] args) {
        Jaeger crimsonTyphoon = new Jaeger("Crimson Typhoon", "Mark-4", "China", 72.6F, 1722F);
        Jaeger strikerEureka = new Jaeger("Striker Eureka", "Mark-5", "Australia", 76.2F, 1850F);

        System.out.println(crimsonTyphoon);
        System.out.println(strikerEureka);
        System.out.println(crimsonTyphoon.scanKaiju());
        strikerEureka.useWeapon();
        crimsonTyphoon.move();
        strikerEureka.drift();


    }
}
