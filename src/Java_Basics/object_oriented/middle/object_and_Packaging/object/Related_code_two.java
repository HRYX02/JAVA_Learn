package Java_Basics.object_oriented.middle.object_and_Packaging.object;

import java.util.Date;

public class Related_code_two {
    public static void main(String[] args) {
        Person p = new Person(" ",1);
        System.out.println(p.toString());

        String str = new String("haha");
        System.out.println(str);
        Date date =  new Date(123L);
        System.out.println(date);
    }
}
