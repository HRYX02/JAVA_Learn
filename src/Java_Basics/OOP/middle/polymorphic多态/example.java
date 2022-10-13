package Java_Basics.OOP.middle.polymorphic多态;

public class example {
    public static void main(String[] args) {
        example text = new example();
        text.func(new Dog());
        text.func(new Cat());
    }

    public void func(Animal animal){//=Animal animal = new Dog();
        animal.eat();
        animal.shout();
    }

    //若没有多态性
    public void func(Dog dog){
        dog.eat();
        dog.shout();
    }
    public void func(Cat cat){
        cat.eat();
        cat.shout();
    }
}
class Animal{
    public void eat(){
        System.out.println("动物吃东西");
    }
    public void shout(){
        System.out.println("动物叫");
    }
}
class Dog extends Animal{
    public void eat(){
        System.out.println("狗吃骨头");
    }
    public void shout(){
        System.out.println("汪汪汪");
    }
}
class Cat extends Animal{
    public void eat(){
        System.out.println("猫吃鱼");
    }
    public void shout(){
        System.out.println("喵喵喵");
    }
}
