package Java_Basics.object_oriented.middle.inherit;

public class Related_code_main {
    public static void main(String[] args) {
        parent p1 = new parent();
        children c1 = new children();

        p1.boss = "111";
        c1.headmaster = "222";
        p1.address = "xxx";
        c1.address = "xxx";
        p1.eat();
        c1.eat();//继承
        p1.sleep();
        c1.sleep();//继承
        c1.show();

        //c1.age;   name1在父类中为private所以不可
        //可通过get set方法调用
        c1.setAge(10);
        System.out.println(c1.getAge());
    }
}
