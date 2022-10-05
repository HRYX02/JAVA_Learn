package Java_Basics.exception_handling.THROWS;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class exception_handling_Test {
    public static void main(String[] args) {
        try {
            method2();
        }catch (IOException e){
            e.printStackTrace();
        }

        //因为method4处理了异常所以main方法不需要处理直接调用即可
        method4();
    }
    public static void method4(){
        try {
            method2();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public static void method2() throws IOException{
        methow1();
    }
    //因为IOException是FileNotFoundException的父类
//    public void method3() throws FileNotFoundException{
//        methow1();
//    }
    public static void methow1() throws FileNotFoundException, IOException {
        File file = new File("Hello.txt");
        FileInputStream fis = new FileInputStream(file);

        int data = fis.read();
        while (data != -1) {
            System.out.print((char) data);
            data = fis.read();
        }
        fis.close();
    }
}
