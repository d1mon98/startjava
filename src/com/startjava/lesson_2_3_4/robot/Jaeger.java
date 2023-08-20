package com.startjava.lesson_2_3_4.robot;

public class Jaeger {
    //class variables
    private String modelName;
    private String mark;
    private String origin;
    private float height;
    private float weight;

    //constructors
    public Jaeger() {
    }

    public Jaeger(String modelName, String mark, String origin, float height, float weight) {
        this.modelName = modelName;
        this.mark = mark;
        this.origin = origin;
        this.height = height;
        this.weight = weight;
    }

    //methods
    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public boolean isDrift() {
        System.out.println("Вы вошли в дрифт");
        return true;
    }

    public boolean isMove() {
        System.out.println("Вы прошли 5 шагов");
        return true;
    }

    public String scanKaiju() {
        return "nothing";
    }

    public void useWeapon() {
        System.out.println("Fire");
    }

    public String toString() {
        return "com.startjava.lesson_2_3.robot.Jaeger {" +
                "modelName='" + modelName + '\'' +
                ", mark='" + mark + '\'' +
                ", origin '" + origin + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}
