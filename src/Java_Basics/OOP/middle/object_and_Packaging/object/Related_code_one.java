package Java_Basics.OOP.middle.object_and_Packaging.object;

public class Related_code_one {
    public static void main(String[] args) {
        Person p1 = new Person("Tom",18);
        Person p2 = new Person("Tom",18);
        String str1 = new String("Tom");
        String str2 = new String("Tom");
        System.out.println(p1.equals(p2));//false
        System.out.println(str1.equals(str2));//true
    }
}
class Person{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //重写的原则：比较两个对象的实体内容是否(name和age)相等
    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if(obj instanceof Person){
            Person p = (Person)obj;
            if (this.age == p.age && this.name.equals(p.name)){
                return true;
            }else{
                return false;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
