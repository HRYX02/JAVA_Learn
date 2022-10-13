package Java_advanced.泛型.自定义泛型结构;

import java.util.ArrayList;
import java.util.List;

/**
 * 自定义的泛型类
 * @author SHIXINXI
 * @create 2022-10-12-11:24
 */
public class Order<T> {
    String orderName;
    int orderId;

    //类的内部结构就可以使用类的泛型

    T orderT;
    public Order(){

    }

    public Order(String orderName, int orderId, T orderT) {
        this.orderName = orderName;
        this.orderId = orderId;
        this.orderT = orderT;
    }
    //如下的三个方法都不是泛型方法
    public void setOrderT(T orderT) {
        this.orderT = orderT;
    }

    public T setOrderT() {
        return orderT;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderName='" + orderName + '\'' +
                ", orderId=" + orderId +
                ", orderT=" + orderT +
                '}';
    }
    //静态方法中不能使用类的泛型。
//    public static void show(T orderT){
//        System.out.println(orderT);
//    }

    public void show(){
        //编译不通过
//        try{
//
//
//        }catch(T t){
//
//        }

    }
    //泛型方法：在方法中出现了泛型的结构；泛型参数与类的泛型参数没有任何关系
    //换句话说，泛型方法所属的类是不是泛型类都没有关系。
    //泛型方法，可以声明为静态的。原因：泛型参数是在调用方法时确定的。并非在实例化类时确定。

    public static  <E> List<E> copyFromArraryToList(E[] arr){
        ArrayList<E> list = new ArrayList<>();
        for (E e:arr){
            list.add(e);
        }
        return list;
    }
    //泛型方法
    //举例：获取表中一共有多少条记录？获取最大的员工入职时间？
    public <E> E getValue(){

        return null;
    }
}
