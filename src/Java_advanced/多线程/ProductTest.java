package Java_advanced.多线程;

/**
 * @author SHIXINXI
 * @create 2022-08-29-15:02
 */
class Product{
    public int iPhone = 0;
    public synchronized void shengchan(){
        if (iPhone < 20){
            iPhone++;
            System.out.println("生产第" + iPhone + "个");
            notify();
        }else {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public synchronized void xiaoshou(){
            if (iPhone > 0){
                System.out.println("消费第" + iPhone-- + "个");
                notify();
            }else {
                try {
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

class Productor implements Runnable{
    private Product product;
    public Productor(Product p){
        product = p;
    }

    @Override
    public void run() {
        System.out.println("开始生产");
        for (;;){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            product.shengchan();
        }
    }
}

class Customer implements Runnable{
    private Product product;
    public Customer(Product p){
        product = p;
    }

    @Override
    public void run() {
        System.out.println("开始消费");
        for (;;){
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            product.xiaoshou();
        }
    }
}

public class ProductTest {
    public static void main(String[] args) {
        Product product = new Product();
        Productor productor = new Productor(product);
        Customer customer = new Customer(product);
        Thread t1 = new Thread(productor);
        Thread t2 = new Thread(customer);
        t1.setName("生产者");
        t2.setName("消费者");
        t1.start();
        t2.start();
    }
}
