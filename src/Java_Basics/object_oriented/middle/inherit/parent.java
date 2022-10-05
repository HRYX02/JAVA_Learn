package Java_Basics.object_oriented.middle.inherit;

public class parent {//家长
    String name;
    private int age1;
    private String name1;
    String address;
    int income;
    String boss;
    int age2;
    int ID = 1001;//身份证号

    public parent(){

    }
    public parent(String name, String address, int income, String boss){
        this.name = name;
        this.address = address;
        this.income = income;
        this.boss = boss;
    }
    public parent(String name, String address){
        this.name = name;
        this.address = address;
    }

    public void eat(){
        System.out.println("吃饭");
    }
    public void sleep(){
        System.out.println("睡觉");
    }

    public int getAge() {
        return age1;
    }

    public void setAge(int age) {
        this.age1 = age;
    }
}
