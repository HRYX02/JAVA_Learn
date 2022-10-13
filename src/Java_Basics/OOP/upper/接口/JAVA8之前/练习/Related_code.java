package Java_Basics.OOP.upper.接口.JAVA8之前.练习;

public class Related_code {
    public static void main(String[] args) {
        System.out.println(Flyable.MAX_SPEED);
        System.out.println(Flyable.MIN_SPEED);
        System.out.println();
        new Plane().fly();
    }
}

interface Flyable {
    //全局常量
    public static final int MAX_SPEED = 7900;
    int MIN_SPEED = 1;

    //抽象方法
    public abstract void fly();
    void stop();
}
interface Attackable{
    void attack();
}

class Plane implements Flyable {
    public void fly() {
        System.out.println("飞机飞");
    }
    public void stop() {
        System.out.println("飞机停");
    }
}

abstract class kite implements Flyable {
    @Override
    public void fly() {
        System.out.println("燕子飞");
    }
}

class Bullet extends Object implements Flyable,Attackable{
    @Override
    public void fly() {
    }
    @Override
    public void stop() {
    }
    @Override
    public void attack() {
    }
}
//***********************************************************
interface AA{
    void method1();
}
interface BB{
    void method2();
}
interface CC extends AA,BB{
    void method3();
}
class DD implements CC{
    @Override
    public void method1() {
    }
    @Override
    public void method2() {
    }
    @Override
    public void method3() {
    }
}