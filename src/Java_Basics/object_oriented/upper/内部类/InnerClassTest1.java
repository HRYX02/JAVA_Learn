package Java_Basics.object_oriented.upper.内部类;

public class InnerClassTest1 {
    //局部内部类(开发中很少见)
    public void method() {
        class AA {

        }
    }

    //返回一个实现了Comparable接口的类的对象(常见)
    public Comparable getComparable(){

        //创建一个实现了Comparable接口的类:局部内部类
//        class MyComparable implements Comparable{
//            //方式一
//            @Override
//            public int compareTo(Object o) {
//                return 0;
//            }
//        }
//        return new MyComparable();

        //方式二
        return new Comparable() {
            @Override
            public int compareTo(Object o) {
                return 0;
            }
        };
    }
}
