public class Wolf {
    // TODO: 02.08.2023 Создайте класс Wolf
    //объявите в нем поля: пол, кличка, вес, возраст, окрас (не присваивайте им значения по умолчанию)
    //реализуйте методы: идти, сидеть, бежать, выть, охотиться
    //в каждом методе выводите сообщение вида: "Воет", "Сидит" и т. д.
    //Создайте класс WolfTest с методом main
    //в нем создайте объект типа Wolf
    //в этом же классе присвойте полям Wolf какие-то значения
    //получите эти значения из полей и отобразите в консоли
    //вызовите методы объекта
    private String sex;
    private String nickname;
    private double weight;
    private double age;
    private String color;

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

    public String getSex() {
        return sex;
    }

    public String getNickname() {
        return nickname;
    }

    public double getWeight() {
        return weight;
    }

    public double getAge() {
        if(age == 0){
            System.out.println("Возраст не может быть 0");
        }
        return age;
    }

    public String getColor() {
        return color;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setAge(double age) {
        if (age > 8) {
            System.out.println("Некорректный возраст");
        } else {
            this.age = age;
        }
    }

    public void setColor(String color) {
        this.color = color;
    }

}
