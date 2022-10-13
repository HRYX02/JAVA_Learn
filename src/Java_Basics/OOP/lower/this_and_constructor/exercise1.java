package Java_Basics.OOP.lower.this_and_constructor;

public class exercise1 {
    public static void main(String[] args) {
        Boy boy = new Boy("罗密欧",20);
        boy.shout();
        Girl girl1 = new Girl("朱丽叶",18);
        Girl gril2 = new Girl("马克",18);
        int compaer = girl1.compare(gril2);
        if (compaer > 0){
            System.out.println(girl1.getName() + "年龄大");
        }else if (compaer < 0){
            System.out.println(gril2.getName() + "年龄大");
        }else {
            System.out.println(girl1.getName() + "和" + gril2.getName() + "年龄一样大");
        }
    }
}
class Boy {
    private String name;
    private int age;

    public Boy() {

    }

    public Boy(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void marry(Girl girl) {
        System.out.println("我想娶" + girl.getName());
    }

    public void shout() {
        if (this.age >= 18) {
            System.out.println("你成年了！");
        } else {
            System.out.println("你还没成年呢");
        }
    }
}
class Girl {
    private String name;
    private int age;

    public Girl(){

    }
    public Girl(String name,int age){
        this.name = name;
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void marry(Boy boy) {
        System.out.println("我想嫁给" + boy.getName());
        boy.marry(this);
    }

    public int compare(Girl girl) {
        return this.age - girl.age;
    }
}
