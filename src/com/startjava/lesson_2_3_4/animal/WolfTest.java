package com.startjava.lesson_2_3_4.animal;

public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.setSex("male");
        wolf.setAge(7);
        wolf.setColor("gray");
        wolf.setNickname("Akela");
        wolf.setWeight(38);

        System.out.println();
        System.out.println("sex: " + wolf.getSex());
        System.out.println("age: " + wolf.getAge());
        System.out.println("color: " + wolf.getColor());
        System.out.println("nickname: " + wolf.getNickname());
        System.out.println("weight: " + wolf.getWeight());
        System.out.println();

        wolf.go();
        wolf.hunt();
        wolf.run();
        wolf.sit();
    }
}
