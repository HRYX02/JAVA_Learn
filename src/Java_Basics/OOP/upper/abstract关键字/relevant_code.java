package Java_Basics.OOP.upper.abstract关键字;

public class relevant_code {
    public static void main(String[] args) {
        //一旦Person类抽象了,就不可实例化
//        Person person = new Person();
//        person.eat();
    }
}

abstract class Creature{
    public abstract void breath();
}
abstract class Person extends Creature{
    String name;
    int age;

    public Person() {

    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
//不是抽象方法
//    public void nochouxiang(){
//
//    }
    //抽象方法
    public abstract void chouxiang();

    public void eat() {
        System.out.println("吃饭");
    }

    public void walk() {
        System.out.println("走路");
    }
}

abstract class student extends Person {
    public student(String name, int age) {
        super(name, age);
    }
}
