package Java_advanced.多线程.线程的同步.讲义.实现线程同步的方式.Lock锁;

import java.util.concurrent.locks.ReentrantLock;

/**
 * 解决线程安全问题的方式三：Lock ---JDK5.0
 *
 *
 *
 * @author SHIXINXI
 * @create 2022-08-29-7:58
 */
class Window implements Runnable{
    private int ticket = 100;
    // 1 实例化RentrantLock
    private ReentrantLock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
            try {
                // 2 调用锁定方法lock
                lock.lock();

                if (ticket > 0) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println(Thread.currentThread().getName() + "：售票，票号为" + ticket);
                    ticket--;
                } else {
                    break;
                }
            }finally {
                // 2 调用解锁方法unlock
                lock.unlock();
            }
        }
    }
}
public class Lock {
    public static void main(String[] args) {
        Window w = new Window();
        Thread t1 =  new Thread(w);
        Thread t2 =  new Thread(w);
        Thread t3 =  new Thread(w);
        t1.setName("窗口一");
        t2.setName("窗口二");
        t3.setName("窗口三");
        t1.start();
        t2.start();
        t3.start();
    }
}
