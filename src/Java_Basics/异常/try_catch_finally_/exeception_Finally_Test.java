package Java_Basics.异常.try_catch_finally_;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class exeception_Finally_Test {
    @Test
    public void testMethod() {
        int number = method();
        System.out.println(number);
    }

    public int method() {
        try {
            int[] array = new int[10];
            System.out.println(array[10]);
            return 1;
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            return 2;
        } finally {
            System.out.println("我一定会被执行");
            return 3;
        }
    }

    @Test
    public void test1() {
        try {
            int a = 10;
            int b = 5;
            b = 0;
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            e.printStackTrace();

            int[] array = new int[10];
            System.out.println(array[10]);
        } catch (Exception e) {
            e.printStackTrace();
        }
        //System.out.println("hahaha");
        finally {
            System.out.println("hahaha");
        }
    }

    @Test
    public void test2() {
        FileInputStream fis = null;
        try {
            File file = new File("hello.txt");
            fis = new FileInputStream(file);

            int data = fis.read();
            while (data != -1) {
                System.out.print((char) data);
                data = fis.read();
            }
            fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (fis != null)
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}