package Java_Basics.object_oriented.upper.内部类;

/*
1 Java中允许将一个类A声明在另一个类B中则类A就是内部类,类B称为外部类
2 内部类的分类: 成员内部类(静态/非静态) and  局部内部类(方法内、代码块内、构造器内)
3 成员内部类
    一方面,作为外部类的成员
        > 调用外部类的结构
        > 可以被4种不同的权限修饰

    另一方面,作为一个类:
        > 类内部可以定义属性、方法、构造器等
        > 可以被final修饰,表示此类不能被继承.言外之意,不使用final,就可以被继承
        > 而可以被abstract修饰
4.关注如下的3个问题
    4.1 如何实例化累不累的对象
    4.2 如何在成员内部类中区分调用外部类的结构
    4.3 开发中局部内部类的使用--->见INnnerClassTest1
5.  (80-85行)
    在局部内部类的方法中（比如：show）如果调用局部内部类所声明的方法(比如：method)中的局部变量(比如：num)的话,要求此局部变量声明为final的。
    jdk 7及之前版本：要求此局部变量显式的声明为final的
	jdk 8及之后的版本：可以省略final的声明
*/
public class INnnerClassTest {
    public static void main(String[] args) {
        //创建Dog实例(静态的成员内部类)
        Person.dog dog = new Person.dog();
        dog.show();
        //创建Bird实例(非静态的成员内部类)
        Person p =  new Person();
        Person.Bird bird = p.new Bird();
        bird.sing();
        bird.display("形参的bird");
    }
}

class Person {
    String name = "Person";
    int age;

    public void eat(){
        System.out.println("吃饭");
    }

    //静态成员内部类
    static class dog {
        String name;
        int age;

        public void show(){
            System.out.println("这是一条狗");

            //dog类使静态的
            //eat();//Non-static method 'eat()' cannot be referenced from a static context
        }
    }
    //非静态成员内部类
    class Bird{
        String name = "内部类的Bird";
        public Bird(){

        }
        public void sing(){
            System.out.println("唱歌");
            System.out.println(age);
            eat();//与下一行调用的相同的方法
            Person.this.eat();//调用外部类的非静态属性
        }

        //如何在成员内部类中区分调用外部类的结构
        public void display(String name){
            System.out.println(name);//方法形参
            System.out.println(this.name);//内部类的属性
            System.out.println(Person.this.name);//外部类的属性

        }
    }

    //局部内部类
    public void method() {
        int a = 10;
        class AA {
            public void show(){
                //a =20;
                System.out.println(a);
            }
        }
    }

    {
        class BB{}
    }
    public Person(){
        class CC{

        }
    }
}