package Java_Basics.异常;

import java.util.Scanner;

public class exercise {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("请输入两个数");
        String num = reader.nextLine();

    }

}
class NegativeException extends RuntimeException{
    static final long serialVersionUID = -7034890745766939L;

    public NegativeException(){

    }
    public NegativeException(String message){
        super(message);
    }
}