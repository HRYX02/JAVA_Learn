package Java_advanced.集合.练习;

import org.junit.Test;

import java.util.*;

/**
 * @author SHIXINXI
 * @create 2022-10-08-9:59
 */
public class exe {
    @Test
    public void test1(){
        int[] ints = new int[]{2,5,7,4,5,1,3,9,10,6};
        List list = new ArrayList();
        for (int i = 0; i < ints.length; i++) {
            list.add(ints[i]);
        }
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
        Collections.sort(list, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof Integer && o2 instanceof Integer){
                    Integer i1 = (Integer) o1;
                    Integer i2 = (Integer) o2;
                    return -i1.compareTo(i2);
                }
                throw new RuntimeException("123");
            }
        });
        System.out.println(list);
    }
    @Test
    public void test2(){
        TreeMap tm = new TreeMap();
        tm.put(100,"leijun");
        tm.put(50,"liuqiangdong");
        tm.put(80,"mahuateng");
        tm.put(40,"wuyanzu");
        tm.put(60,"jinfan");
        System.out.println(tm);
    }
}
