package Java_advanced.泛型.自定义泛型结构;

import java.util.ArrayList;
import java.util.List;

/**
 * @author SHIXINXI
 * @create 2022-10-13-10:31
 */
public class SubOrder extends Order<Integer>{//SubOrder:不是泛型类
    public static <E> List<E> copyFromArraryToList(E[] arr){
        ArrayList<E> list = new ArrayList<>();
        for (E e:arr){
            list.add(e);
        }
        return list;
    }
}
