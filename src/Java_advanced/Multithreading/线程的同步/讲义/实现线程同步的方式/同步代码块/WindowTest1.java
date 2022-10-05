package Java_advanced.Multithreading.线程的同步.讲义.实现线程同步的方式.同步代码块;

import static java.lang.Thread.sleep;

/**
 * eg：创建三个窗口卖票，总票数为100张，方式二：实现Runnable接口
 *
 * 1 问题：卖票过程中出现了重票、错票 --->线程的安全问题
 * 2 问题出现的原因：当某个线程操作车票的过程中，尚未操作完成时，其他线程参与进来，也操作车票。
 * 3 如何解决：当一个线程在操作共享数据(ticket)时，其他线程不能参与进来，直到此线程a操作完共享数据时，
 *           其他线程才可以操作共享数据(ticket)。这种情况即使线程a出现了阻塞，也不能被改变
 * 4 在Java中，通过同步机制，来解决线程的安全问题
 *
 *   方式一：同步代码块
 *      sysnchronized(同步监视器){
 *          //需要被同步的代码
 *
 *      }
 *      说明：1 操作共享数据的代码，即为需要被同步的代码  -->不能包含代码多了，也不能包含少了
 *           2 共享数据：多个线程共同操作的变量。比如：ticket就是共享数据
 *           3 同步监视器，俗称：锁。任何一个类的对象都可以充当锁
 *              要求：多个线程必须共用同一把锁
 *
 *   方式二：同步方法
 * 5 同步的方式，解决了线程的安全问题。
 *   操作同步代码时，只能有一个线程参与，其他线程等待。相当于是一个单线程的过程，效率低
 * @author SHIXINXI
 * @create 2022-08-19-8:32
 */
class window1 implements Runnable{
    private int ticket = 100;
    static Object obj = new Object();
    @Override
    public void run() {

        synchronized (obj) {
            while (true){
                if (ticket > 0){
                    try {
                        sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println(Thread.currentThread().getName() + ":卖票，票号为：" + ticket);
                    ticket--;
                }else {
                    break;
                }
            }
        }
    }
}
 public class WindowTest1 {
    public static void main(String[] args) {
        window1 w1 = new window1();
        Thread t1 = new Thread(w1);
        Thread t2 = new Thread(w1);
        Thread t3 = new Thread(w1);
        t1.setName("线程1：");
        t2.setName("线程2：");
        t3.setName("线程3：");
        t1.start();
        t2.start();
        t3.start();
    }
}

