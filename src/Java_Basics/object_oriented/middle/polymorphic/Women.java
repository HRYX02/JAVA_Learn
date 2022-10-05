package Java_Basics.object_oriented.middle.polymorphic;

public class Women extends Person{
    boolean isBeauty;
    public void goShopping(){
        System.out.println("女人逛街");
    }
    public void eat(){
        System.out.println("女人减肥");
    }
    public void walk(){
        System.out.println("女人打车");
    }
}
