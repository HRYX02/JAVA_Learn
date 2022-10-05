package Java_advanced.Multithreading.线程的创建与使用.讲义;

/**
 * 多线程的创建，方式一：继承于Thread类
 * 1 创建一个继承于Thread类的子类
 * 2 重写Thread类的run() --> 将此线程执行的操作声明在run()中
 * 3 创建Thread类的子类的对象
 * 4 通过此对象调用start()
 *
 * eg ：遍历100以内的所有偶数
 *
 * 多线程的创建，方式二：实现Runnable接口
 * @author SHIXINXI
 * @create 2022-06-09-11:50
 */

//1 创建一个继承于Thread类的子类
class MyThread_one extends Thread {
    //2 重写Yhread类的run()
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + i);
            }
        }
    }
}

public class Thread_creation_one {
    public static void main(String[] args) {
        //3 创建Thread类的子类的对象
        MyThread_one myThread = new MyThread_one();
        //4 通过此对象调用start() ①启动当前线程 ②调用当前线程的run()
        myThread.start();

        //问题一：不能直接调用run()的方式启动线程
        //myThread.run();

        /*问题二：再启动一个线程遍历100以内的偶数。
          不可以还让已经start()的线程去执行。
          会报IllegalThreadStateException异常
        */
        //myThread.start();

        //需要重新创建一个线程的对象
        MyThread_one myThread1 = new MyThread_one();
        myThread1.start();

        //如下操作仍然是在main线程中执行的
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + i + "***");
            }
        }
    }
}
