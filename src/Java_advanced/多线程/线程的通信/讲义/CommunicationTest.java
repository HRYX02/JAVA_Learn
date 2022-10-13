package Java_advanced.多线程.线程的通信.讲义;

/**
 *线程通信eg：使用两个线程打印1-100.线程1和2交替打印
 *
 *线程通信的三个方法：
 * wait():一旦执行此方法,当前线程就进入阻塞状态,并释放同步监视器
 * notify():一旦执行此方法,就会幻想被wait阻塞的一个线程,如果多个线程被wait,就唤醒优先级高的
 * notifyAll():一旦执行此方法,就会唤醒所有被wait的线程
 *
 * 说明
 * 1 wait(),notify(),notifyAll()三个方法必须使用在同步代码块或同步方法中
 * 2 wait(),notify(),notifyAll()的调用这必须是同步代码块或同步方法中的同步监视器
 *   否则,会出现IllegalMonitorStateException异常
 * 3 wait(),notify(),notifyAll()三个方法是定义在java.long.Object类中
 * @author SHIXINXI
 * @create 2022-08-29-14:21
 */
class Number implements Runnable{
    private int number = 1;
    private Object obj = new Object();
    @Override
    public void run() {
        while (true){
            synchronized (obj){
                obj.notify();//线程2进入后激活其他线程但是有锁所以线程一进不来
                if (number <= 100){
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println(Thread.currentThread().getName() + ":" + number);
                    number++;

                    try {
                        //使调用wait()方法的线程进入阻塞状态
                        obj.wait();
                        //执行完wait()会自动释放锁
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }else{
                    break;
                }
            }
        }
    }
}

public class CommunicationTest {
    public static void main(String[] args) {
        Number number = new Number();
        Thread t1 = new Thread(number);
        Thread t2 = new Thread(number);
        t1.start();
        t2.start();
    }
}
