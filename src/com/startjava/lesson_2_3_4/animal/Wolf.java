package com.startjava.lesson_2_3_4.animal;

public class Wolf {
    private String sex;
    private String nickname;
    private double weight;
    private double age;
    private String color;

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public double getAge() {
        if (age == 0) {
            System.out.println("Age cannot be 0");
        }
        return age;
    }

    public void setAge(double age) {
        if (age > 8) {
            System.out.println("Incorrect age");
        } else {
            this.age = age;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void go() {
        System.out.println("goes");
    }

    public void sit() {
        System.out.println("sits");
    }

    public void run() {
        System.out.println("runs");
    }

    public void hunt() {
        System.out.println("hunts");
    }
}
