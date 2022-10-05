package Java_Basics.object_oriented.middle.polymorphic;

public class Man extends Person {
    boolean isSmoking;
    int id = 1;

    public void earnMoney(){
        System.out.println("男人挣钱");
    }
    public void eat(){
        System.out.println("男人多吃饭");
    }
    public void walk(){
        System.out.println("男人走路");
    }
}
