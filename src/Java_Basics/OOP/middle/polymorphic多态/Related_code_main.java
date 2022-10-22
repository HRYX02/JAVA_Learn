package Java_Basics.OOP.middle.polymorphic多态;

public class Related_code_main {
    public static void main(String[] args) {
        //对象的多态性：父类的引用指向子类的对象
        Person p1 = new Man();
        Person p2 = new Women();
        //多态的使用：当调用子父类同名同参的方法时，实际执行的是子类重写父类的方法---虚拟方法调用
        p1.eat();
        p2.eat();
        System.out.println(p1.id);
        //不能调用子类所持的方法、属性，编译时，p1是Person类型
        //p1.earnMoney();//Cannot resolve method 'earnMoney' in 'Person
        p1.name = "sxx";
        //p1.isSmoking = true
        //有了对象的多态性以后，内存中实际上是加载了子类持有的属性和方法的，
        //但是由于变量声明为父类类型，导致编译时只能调用父类中声明的属性和方法。
        //子类持有的属性和方法不能调用

        //如何调用子类持有的属性和方法？
        //向下转型：使用强制类型转换符
        Man m1 = (Man)p1;
        System.out.println(m1.id);
        m1.earnMoney();
        System.out.println("========");

        //使用强转时，可能出现ClassCastException的异常。
//        Women w1 = (Women)p1;
//        w1.goShopping();

        if (p1 instanceof Man){
            System.out.println("Man");
            m1.earnMoney();
        }
        if (p1 instanceof Women){
            System.out.println("Women");
            Women w1 = (Women)p1;
            w1.goShopping();
        }

        //练习：
        //问题一：编译时通过，运行时不通过
        Person p3 = new Man();
//        Women w3 = (Women)p3;

        Person p4 = new Person();
//        Women w4 = (Women)p4;

        //问题二：编译通过，运行通过
        Object obj = new Man();
        Person p5 = (Person)obj;

        //问题三：编译不通过
//        Man m3 = new Women();
//        String str = new Date();
    }
}
