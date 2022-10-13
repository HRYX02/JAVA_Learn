package Java_Basics.异常.try_catch_finally_;

import org.junit.Test;

public class exception_handling_Test {
    @Test
    public void NumberFormatException(){//数字格式化异常
        String string = "123";
        string = "abc";
        int number = 0;//第十行和22行针对2.6
        try {
            number = Integer.parseInt(string);
        }catch (NumberFormatException e){
            System.out.println("出现数值转换异常");//第一种方法
            System.out.println(e.getMessage());//第二种方法
            e.printStackTrace();//第三种方法
        }catch (NullPointerException e){
            System.out.println("出现空指针异常");
        }catch (Exception e){
            System.out.println("出现异常");
        }
        System.out.println(number);

    }
}
