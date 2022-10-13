package Java_Basics.OOP.middle.inherit继承;

public class children extends parent {//孩子
    //String name;       因为继承了Related_code1 （R1也有name和address）所以不用重新定义属性
    //String address;
    int outcome;
    String headmaster;
    int ID = 1002;//学号

    public children(){

    }
    public children(String name, String address, String headmaster){
        super(name, address);
        this.headmaster = headmaster;
    }

//    public void eat(){     同理 因为继承了Related_code1 （R1也有name和address）所以不用重新定义属性
//        System.out.println("吃饭");
//    }
//    public void sleep(){
//        System.out.println("睡觉");
//    }
    public void learn(){
        System.out.println("学习");
    }

    //对父类的eat()方法进行了重写
    public void eat(){
        System.out.println("学生吃饭");
    }
    public void show(){
        System.out.println("name" + name + "age" + age2);//或
        System.out.println("name" + this.name + "age" + super.age2);
        System.out.println(ID);
        System.out.println(this.ID);
        System.out.println(super.ID);
        eat();
        super.eat();

    }
}