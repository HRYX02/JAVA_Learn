package Java_Basics.OOP.lower.this_and_constructor;
//通过构造器调对象
public class one {
    public static void main(String[] args) {
        //does d = new does();
        Person d1 = new Person("史鑫玺",20);//第一步调用25行
        System.out.println(d1.getAge());
    }
}
class Person{
    private String name;
    private int age;
    public Person(){
        String info = "假设这有很多代码每个方法都需要调用";
        System.out.println(info);
    }
    public Person(String name) {
        this();
        this.name = name;
    }
    public Person(int age){
        this();//第三步调用13行
        this.age = age;
    }
    public Person(String name,int age){
        this(age);//第二步调用21行
        this.name = name;
        //this.age = age;
    }
    public int getAge(){
        return age;
    }
}
