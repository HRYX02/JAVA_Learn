package Java_Basics.object_oriented.lower;
import static java.lang.System.*;//第十七行
//设计类就是设计类的成员

import java.util.Arrays;

/*类和对象的使用（面向对象思想落地的实现）
    1.创建类class，设计类成员
    2.创建类的对象
    3.通过“对象.属性”或“对象.方法”调用对象的结构
*/
//测试创作的类
public class Related_code
{
    public static void main(String[] args)
    {
        out.println("hello");//第2行
        //创建Person类的对象
        Person p1 = new Person();
        //创建匿名对象并使用
        new Person().age = 12;
        new Person().talk("English");
        //调用对象的结构：属性、方法
        //调用属性：“对象.属性”
        p1.name = "史鑫玺";//赋值
        p1.isMale =true;
        //调用方法：“对象.方法”
        p1.eat();
        p1.sleep();
        p1.talk("Chinese");
        System.out.println(p1.name+p1.age+"岁"+p1.isMale);
        Person p2 = new Person();
        int[] arr = new int[]{1,2,9,6,5};
        p2.PaiXu(arr);
        System.out.println(Arrays.toString(arr));

        //Note中96-98行的演示

        //97行
        assignment a1 = new assignment();
        int m = 10 , n = 20;
        System.out.println("m="+m+" n="+n);
        a1.replace1(10,20);
        System.out.println("m="+m+" n="+n);
        //98行
        a1.a = 10;
        a1.b = 20;
        a1.replace2(a1);
        System.out.println("m="+a1.a+" n="+a1.b);
    }
}
class Person
{
    //属性(成员变量)
    String name;
    int age = 19;//即定义变量
    boolean isMale;
    //方法--->public void **（能干什么）(){}
    public void eat()
    {
        System.out.println("吃");
    }
    public void sleep()
    {
        String food = "饼";//局部变量
        System.out.println("睡");
    }
    public void talk(String language)//language:形参，为局部变量
    {
        System.out.println("说"+language);
    }
    public void PaiXu(int[] arr)
    {

    }
}
class assignment{
    int a;
    int b;
    public void replace1( int m , int n){
        int temp = m;
        m = n;
        n = temp;
    }
    public void replace2(assignment a1){
        int temp = a1.a;
        a1.a = a1.b;
        a1.b = temp;
    }
}