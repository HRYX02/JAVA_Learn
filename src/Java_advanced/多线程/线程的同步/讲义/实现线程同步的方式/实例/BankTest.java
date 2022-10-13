package Java_advanced.多线程.线程的同步.讲义.实现线程同步的方式.实例;

/**
 * 使用同步机制将单例模式中的懒汉式改为线程安全的
 *
 * @author SHIXINXI
 * @create 2022-08-27-13:24
 */
public class BankTest {
}

class Bank {
    static Object obj = new Object();

    private Bank() {
    }

    private static Bank instance = null;

    public static synchronized Bank getInstance() {
        if (instance == null) {
            instance = new Bank();
        }
        return instance;
    }

    public static Bank getinstance() {
        //方式一：效率稍差
        /*synchronized (Bank.class) {
            if (instance ==null){
                instance = new Bank();
            }
        }
        return instance;*/

        //方式二:效率更高
        if (instance ==null) {
            synchronized (Bank.class) {
                if (instance ==null){
                    instance = new Bank();
                }
            }
        }
        return instance;
    }
}
