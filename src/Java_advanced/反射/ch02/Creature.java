package Java_advanced.反射.ch02;

import java.io.Serializable;

/**
 * @author shkstart
 * @create 2019 下午 3:12
 */
public abstract class Creature<T> implements Serializable {
    private char gender;
    public double weight;

    private void breath(){
        System.out.println("生物呼吸");
    }

    public void eat(){
        System.out.println("生物吃东西");
    }

    public abstract void info();
}
