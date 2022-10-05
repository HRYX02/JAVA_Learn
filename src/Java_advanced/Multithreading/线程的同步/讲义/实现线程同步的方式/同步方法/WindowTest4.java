package Java_advanced.Multithreading.线程的同步.讲义.实现线程同步的方式.同步方法;

/**
 *使用同步方法解决继承Thread类的方式的线程安全问题
 * eg：创建三个窗口卖票，总票数为100张，使用继承Thread类的方式
 * 创建多线程的方式
 * 说明：在继承Thread类创建多线程的方式中，慎用this充当同步监视器，考虑使用当前类充当同步监视器
 *
 * @author SHIXINXI
 * @create 2022-08-16-15:00
 */
class Window4 extends Thread {
    private static int ticket = 100;

    @Override
    public void run() {
        while (true) {
            show();
        }
    }

    private static synchronized void show() {//同步监视器：Window4.class
        //private synchronized void show(){//同步监视器t1、t2、t3。此种解决方式是错误的
        if (ticket > 0) {
            try {
                sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName() + ":卖票，票号为：" + ticket);
            ticket--;
        }
    }
}

    public class WindowTest4 {
        public static void main(String[] args) {
            Window4 t1 = new Window4();
            Window4 t3 = new Window4();
            Window4 t2 = new Window4();

            t1.setName("窗口1");
            t2.setName("窗口2");
            t3.setName("窗口3");

            t1.start();
            t2.start();
            t3.start();
        }
    }

