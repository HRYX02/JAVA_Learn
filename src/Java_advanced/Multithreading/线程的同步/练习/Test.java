package Java_advanced.Multithreading.线程的同步.练习;

import java.util.concurrent.locks.ReentrantLock;

/**
 * 银行有一个账户。
 * 有两个储户分别向同一个账户存3000元，每次存1000，存3次。每次存完打印账户余额。
 * 分析：
 * 1 是否是多线程问题？是，两个储户线程
 * 2 是否有共享数据？有，账户/账户余额
 * 3 是否有线程安全问题》有
 * 4 需要考虑如何解决线程安全问题？同步机制：三种
 * @author SHIXINXI
 * @create 2022-08-29-13:47
 */
class MyAccount implements Runnable{
    private int balance;
    private ReentrantLock lock = new ReentrantLock();

    @Override
    public void run() {

        try {
            lock.lock();
            for (int i = 0; i < 3; i++) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                balance = balance +100;
                System.out.println(Thread.currentThread().getName() + balance);
            }
        } finally {
            lock.unlock();
        }
    }
}
public class Test {
    public static void main(String[] args) {
        MyAccount account = new MyAccount();
        Thread t1 = new Thread(account);
        Thread t2 = new Thread(account);
        t1.setName("账户一");
        t2.setName("账户二");
        t1.start();
        t2.start();
    }
}
