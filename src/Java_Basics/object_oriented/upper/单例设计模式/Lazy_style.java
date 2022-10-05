package Java_Basics.object_oriented.upper.单例设计模式;
//懒汉式
public class Lazy_style {
    public static void main(String[] args) {
        C c1 = C.getInstance();
        C c2 = C.getInstance();
        System.out.println(c1 == c2);
    }
}
class C{

    //1.私有化类的构造器
    private C(){

    }

    //2.内部创建类的对象
    //4.要求此对象也必须声明为静态的
    private static C c = null;

    //3.声明public、static的返回当前类对象的方法
    public static C getInstance(){
        if (c == null){
            c = new C();
        }
        return c;
    }
}
