package Java_Basics.异常;

import org.junit.Test;

import java.util.Date;
import java.util.Scanner;


public class ExeceptionTest {

    //编译时异常(checked)
//    @Test
//    public void test(){
//		File file = new File("hello.txt");
//		FileInputStream fis = new FileInputStream(file);
//
//		int data = fis.read();
//		while(data != -1){
//			System.out.print((char)data);
//			data = fis.read();
//		}
//		fis.close();
//    }

    //运行时异常(unchecked)
    @Test
    public void NullPointerException(){//空指针
        int[] array = null;
        System.out.println(array[1]);

        String string = "abc";
        string = null;
        System.out.println(string.charAt(0));
    }
    @Test
    public void ArrayIndexOutOfBoundsException(){//数组角标跃进
        int[] array = new int[2];
        System.out.println(array[2]);

        //StringIndexOutOfBoundsException
        String string = "abc";
        System.out.println(string.charAt(3));
    }
    @Test
    public void ClassCastException(){//类型转换异常
        Object object = new Date();
        String string = (String)object;
    }
    @Test
    public void NumberFormatException(){//数字格式化异常
        String string = "123";
        string = "abc";
        int number = Integer.parseInt(string);
    }
    @Test
    public void InputMismatchException(){//输入不匹配异常
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
    }
    @Test
    public void ArithmeticException(){//算数异常
        int a = 10;
        int b = 5;
        b = 0;
        System.out.println(a/b);
    }
}

