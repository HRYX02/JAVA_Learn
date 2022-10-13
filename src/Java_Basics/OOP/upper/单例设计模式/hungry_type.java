package Java_Basics.OOP.upper.单例设计模式;
//饿汉式
public class hungry_type {
    public static void main(String[] args) {
        A a = A.getInstance();
        A b = A.getInstance();
        System.out.println(a == b);
    }
}
class A{

    //1.私有化类的构造器
    private A(){
    }

    //2.内部创建类的对象
    //4.要求此对象也必须声明为静态的
    private static A instance = new A();

    //3.提供公共的静态方法返回类的对象
    public static A getInstance(){
        return instance;
    }
}

