public class Person {

    // TODO: 02.08.2023 Создайте класс Person (без метода main)
    //Напишите в нем поля (атрибуты), описывающие характеристики человека: пол, имя, рост, вес, возраст
    //Проинициализируйте их какими-то значениями
    //Создайте в классе методы, описывающие поведение (что он может делать) человека: идти, сидеть, бежать, говорить, учить Java
    //В каждом методе используйте sout для вывода соответствующего названию метода сообщения
    //Скомпилируйте класс, чтобы проверить его на ошибки (не пытайтесь его запустить, т. к. в нем нет метода main)
    //Покажите ДЗ наставнику

    String sex = "male";
    String name = "John";
    double height = 1.81;
    double weight = 78.5;
    double age = 33;

    boolean walk() {
        System.out.println("walk " + false);
        return false;
    }

    boolean sit() {
        System.out.println("sit " + true);
        return true;
    }

    boolean run() {
        System.out.println("run " + false);
        return false;
    }

    boolean talk() {
        System.out.println("talk " + false);
        return false;
    }

    boolean learnJava() {
        System.out.println("learnJava " + true);
        return true;
    }
}

