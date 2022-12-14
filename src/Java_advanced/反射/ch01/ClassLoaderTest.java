package Java_advanced.反射.ch01;

import org.junit.Test;

import java.io.InputStream;
import java.util.Properties;

/**
 * 了解类的加载器
 * @author SHIXINXI
 * @create 2022-09-28-19:09
 */
public class ClassLoaderTest {
    @Test
    public void test1(){
        //对于自定义类，使用系统类加载器进行加载
        ClassLoader classLoader = ClassLoaderTest.class.getClassLoader();
        System.out.println(classLoader);//系统类加载器

        //调用系统类加载器的getParent()：获取扩展类加载器
        ClassLoader classLoader1 = classLoader.getParent();
        System.out.println(classLoader1);//扩展类加载器

        //调用扩展类加载器的getParent()：无法获取引导类加载器
        //引导类加载器主要负责加载java的核心类库，无法加载自定义类的。
        ClassLoader classLoader2 = classLoader1.getParent();
        System.out.println(classLoader2);//引导类加载器
    }

    @Test
    public void test2() throws Exception {
        Properties pros = new Properties();
        //此时的文件默认在当前的module下。
        //读取配置文件的方式一：
//        FileInputStream fis = new FileInputStream("jdbc.properties");
//        pros.load(fis);
        //读取配置文件的方式二：使用ClassLoader
        //配置文件默认识别为：当前module的src下
        ClassLoader classLoader = ClassLoaderTest.class.getClassLoader();
        InputStream is = classLoader.getResourceAsStream("jdbc.properties");
        pros.load(is);
        String user = pros.getProperty("user","史鑫玺");
        String password = pros.getProperty("password","123");
        System.out.println("user = " + user + ",password = " + password);
    }
}
