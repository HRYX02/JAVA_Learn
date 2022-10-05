package Java_Basics.exception_handling.Custom_exception;
//自定义异常类
public class MyException extends RuntimeException{
    static final long serialVersionUID = -7034890745766939L;

    public MyException(){

    }
    public MyException(String message){
        super(message);
    }
}