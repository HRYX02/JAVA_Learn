package Java_advanced.通用类.字符串相关.练习;

/**
 * @author SHIXINXI
 * @create 2022-09-11-7:39
 */
public class StringTest {
    String str = new String("good");
    char[] ch = {'t', 'e', 's', 't'};

    public void change(String str, char ch[]){
        str = "test";
        ch[0] = 'b';
}

    public static void main(String[] args){
        StringTest ex = new StringTest();
        ex.change(ex.str, ex.ch);
        System.out.println(ex.str);
        System.out.println(ex.ch);
    }
}