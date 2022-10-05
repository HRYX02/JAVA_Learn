package Java_advanced.Multithreading.线程的创建与使用.讲义;

/**
 *
 * 多线程的创建，方式二：实现Runnable接口
 * 1 创建一个实现了Runnable接口的类
 * 2 实现类去实观Runnable中的抽象方法：run()
 * 3 创速实现类的对象
 * 4 将此对象作为参数传递到Thread类的构造器中，创建Thread类的对象
 * 5 通过Thread荧的对求调用start()
 *
 * @author SHIXINXI
 * @create 2022-08-16-15:20
 */
public class Thread_creation_two {
    public static void main(String[] args) {
//        3 创速实现类的对象
        MyThread_two myThreadTwo = new MyThread_two();
//        4 将此对象作为参数传递到Thread类的构造器中，创建Thread类的对象
        Thread t1 = new Thread(myThreadTwo);
//        5 通过Thread荧的对求调用start()：① 启动线程 ②调用当前线程的run()-->调用了Runnable类型的target的run()
        t1.start();
//        再启动一个线程，遍历100以内的偶数，只需要创建Thread的对象
        Thread t2 = new Thread(myThreadTwo);
        t2.start();
    }
}

//1 创建一个实现了Runnable接口的类
class MyThread_two implements Runnable{
//    2 实现类去实观Runnable中的抽象方法：run()
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + ":" +i);
            }
        }
    }
}
