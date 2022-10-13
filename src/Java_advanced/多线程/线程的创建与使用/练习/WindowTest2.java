package Java_advanced.多线程.线程的创建与使用.练习;

/**
 * eg：创建三个窗口卖票，总票数为100张，方式二：实现Runnable接口
 * @author SHIXINXI
 * @create 2022-08-19-8:32
 */

class window1 implements Runnable{
    private int ticket = 10000;
    Object obj = new Object();
    Dog dog = new Dog();
    @Override
    public void run() {
        while (true){
            synchronized(this){//此时的this：唯一的window2的对象  //synchronized (dog){
                if (ticket > 0){
                    try {
                        Thread.sleep(0);
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
class Dog{}

public class WindowTest2 {
    public static void main(String[] args) {
        window1 w2 = new window1();
        Thread t11 = new Thread(w2);
        Thread t22 = new Thread(w2);
        Thread t33 = new Thread(w2);
        t11.setName("线程1");
        t22.setName("线程2");
        t33.setName("线程3");
        t11.start();
        t22.start();
        t33.start();
    }
}

