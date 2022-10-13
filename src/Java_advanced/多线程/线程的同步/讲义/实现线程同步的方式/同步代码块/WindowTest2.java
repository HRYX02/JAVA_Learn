package Java_advanced.多线程.线程的同步.讲义.实现线程同步的方式.同步代码块;

/**
 *使用同步代码块解决继承Thread类的方式的线程安全问题
 * eg：创建三个窗口卖票，总票数为100张，使用继承Thread类的方式
 * 创建多线程的方式
 * 说明：在继承Thread类创建多线程的方式中，慎用this充当同步监视器，考虑使用当前类充当同步监视器
 *
 * @author SHIXINXI
 * @create 2022-08-16-15:00
 */
class Window2 extends Thread{
    private static int ticket = 100;
    static Object object =new Object();//错误：因为main方法中new了三个Window的对象,所有需要将此对象static
    @Override
    public void run() {
        //正确的
//        synchronized (object){
                //错误的方式：this代表t1、t2、t3三个对象
//                 synchronized (this)
        synchronized (Window2.class)//Class clazz = Window.class,Window.class只会加载一次
        {
            while (true){
                try {
                    sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                if (ticket > 0){
                    System.out.println(getName() + ":卖票，票号为：" + ticket);
                    ticket--;
                }else {
                    break;
                }
            }
        }
    }
}

public class WindowTest2 {
    public static void main(String[] args) {
        Window2 t1 = new Window2();
        Window2 t3 = new Window2();
        Window2 t2 = new Window2();

        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
}

