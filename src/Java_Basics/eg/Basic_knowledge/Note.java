package Java_Basics.eg.Basic_knowledge;

import java.util.Scanner;//读取输入的包
import static java.lang.Math.*;//数学函数的包

import java.util.Arrays;//关于数组操作的方法

public class Note {
    public static void main(String[] args) {
        //1 数组
        // 1.1 Arrays工具类的使用
        //1.1.1 判断两个数组是否相等
        int[] c1 = new int[]{1,2,3,4};
        int[] c2 = new int[]{49,-26,1,30,46,-50};
        boolean  bijiao =Arrays.equals(c1,c2);
        System.out.println(bijiao);
        //1.1.2 输出数组信息
        System.out.println(Arrays.toString(c1));
        //1.1.3 数组的排序
        Arrays.sort(c2);
        System.out.println(Arrays.toString(c2));
        //1.1.4 替换原有数组的信息
        System.out.println(Arrays.toString(c1));//原来的
        Arrays.fill(c1,10);
        System.out.println(Arrays.toString(c1));//更改后的
        //1.1.5 使用二分法查找   二分法使用前提：数组是排序的
        int[] c3 = new int[]{1,2,3,4,5,6,7,8,9,10};
        int index = Arrays.binarySearch(c3,11);
        System.out.println(index);//输出数值为负数则未找到该值的位置
        //1.2
        //1.2.1数组的复制=复制 ：array1=array2地址值相同
        //1.2.2 数组的赋值=快捷键：array1！=array2地址值
        //2 一行的输入
        int a;
        Scanner reader = new Scanner(System.in);
        System.out.println("输入");
        a = reader.nextInt();
        //3 数学方法
        System.out.println(PI + " " + pow(2, 3) + " " + sqrt(4));//Π 2的3次方 4的平方根
        if ("Hello".equals("Hello")) ;
        System.out.println("1");//检查字符串是否相等 "*".equals("*")
        //不分大小写        equalsIgnoreCase
        //4 随机数
        //公式[a,b]=(int)(Math.random()*(b-a+1))+a
        //(int)(Math.random()*90+10)   ---->[10,99]
        //5 输入一行字符
        //同1 只需将int double等改为String型
        String name;
        Scanner namereader = new Scanner(System.in);
        System.out.println("输入");
        name = namereader.nextLine();//或直接写为String name = namereader.nextLine()
        //6 密码的输入
            /*Console cons = System.console();
            String username = cons.readLine("User name:");
            char[] password = cons.readPassword("Password:");*/
        //7 图形界面的输入输出
        //详情见JAVA核心卷一 TuXing
        //8 大数的输入 BigInteger任意精度整数 BigDecimal任意精度浮点数
        //BigInteger b = BigInteger.valueOf(100);
        //lottery0dds = lottery0dds.multiply(BigInteger.valueOf(n-i+1)).divide(BigInteger.valueOf(i));

    }
}
