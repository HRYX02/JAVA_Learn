package Java_Basics.object_oriented.middle.object_and_Packaging.packaging;


import org.junit.Test;

public class Related_code {
    @Test
    public void JUnitTest() {
        String s1 = "MM";
        String s2 = "GG";
        System.out.println(s1.equals(s2));
    }
    @Test////基本数据类型--->包装类，调用包装类的构造器
    public void test1(){
        int number = 10;
        //System.out.println(number.toString());基本数据类型没有类的方法
        //法一
        Integer integer1 = new Integer(number);
        System.out.println(integer1.toString());
        //法二
        Integer integer2 = new Integer("123");
        System.out.println(integer2.toString());
        //或
        System.out.println(integer2);
        System.out.println("***");
        Float float1 = new Float(12.3f);
        Float float2 = new Float("12.3");
        System.out.println(float1 + "," + float2);
        System.out.println("***");
        Boolean boolean1 = new Boolean(true);
        System.out.println(boolean1);
        Boolean boolean2 = new Boolean("TrUe");
        System.out.println(boolean2);
        Boolean boolean3 = new Boolean("true123");
        System.out.println(boolean3);
        System.out.println("***");
        Order order = new Order();
        System.out.println(order.isMale);//false
        System.out.println(order.isFemale);//null
    }

    @Test//包装类--->基本数据类型：调用包装类xxx的xxxValue()
    public void test2(){
        Integer int1 = new Integer(13);
        int i1 = int1.intValue();
        System.out.println(i1+3);
    }

    @Test//JDK5.0新特性：自动装箱与自动拆箱
    public void test3(){
        //自动装箱：基本数据类型--->包装类
        int number = 10;
        Integer in = number;
        boolean b1 = true;
        Boolean b2 = b1;

        //自动拆卸：包装类--->基本数据类型
        int number1 = in;
    }

    //基本数据类型、包装类--->String类型：调用String重载的valueOf(Xxx xxx)
    @Test
    public void test4(){

        int num1 = 10;
        //方式1：连接运算
        String str1 = num1 + "";
        //方式2：调用String的valueOf(Xxx xxx)
        float f1 = 12.3f;
        String str2 = String.valueOf(f1);//"12.3"

        Double d1 = new Double(12.4);
        String str3 = String.valueOf(d1);
        System.out.println(str2);
        System.out.println(str3);//"12.4"
    }

    //String类型 --->基本数据类型、包装类：调用包装类的parseXxx(String s)
    @Test
    public void test5(){
        String str1 = "123";
        //错误的情况：
//		int num1 = (int)str1;
//		Integer in1 = (Integer)str1;
        //可能会报NumberFormatException
        int num2 = Integer.parseInt(str1);
        System.out.println(num2 + 1);

        String str2 = "true1";
        boolean b1 = Boolean.parseBoolean(str2);
        System.out.println(b1);
    }
}
class Order{
    boolean isMale;
    Boolean isFemale;//变成了类
}
