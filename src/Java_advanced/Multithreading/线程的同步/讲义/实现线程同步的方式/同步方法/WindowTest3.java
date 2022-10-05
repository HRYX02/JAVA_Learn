package Java_advanced.Multithreading.线程的同步.讲义.实现线程同步的方式.同步方法;

/**
 * 方式二：同步方法
 * 关于同步方法的总结：
 * 1. 同步方法仍然涉及到同步监视器，只是不需要我们显式的声明。
 * 2. 非静态的同步方法，同步监视器是：this
 *    静态的同步方法，同步监视器是：当前类本身
 * @author SHIXINXI
 * @create 2022-08-23-20:49
 */
class window3 implements Runnable{
    private int ticket = 100;
    @Override
    public void run(){
        while (true){
            show();
        }
    }
    private synchronized void show(){//同步监视器：this
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        if (ticket > 0){
            System.out.println(Thread.currentThread().getName() + ":卖票，票号为：" + ticket);
            ticket--;
        }
    }
}

public class WindowTest3 {
    public static void main(String[] args) {
        window3 w3 = new window3();
        Thread t1 = new Thread(w3);
        Thread t2 = new Thread(w3);
        Thread t3 = new Thread(w3);
        t1.setName("线程一");
        t2.setName("线程二");
        t3.setName("线程三");
        t1.start();
        t2.start();
        t3.start();
    }
}
