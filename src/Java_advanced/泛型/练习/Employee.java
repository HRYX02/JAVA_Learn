package Java_advanced.泛型.练习;

/**
 * @author SHIXINXI
 * @create 2022-10-11-20:29
 */
public class Employee implements Comparable<Employee>{
    private String name;
    private int age;
    private MyDate birthday;

    public Employee() {
    }

    public Employee(String name, int age, MyDate birthday) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
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

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "姓名：" + name +
                "，年龄：" + age +
                "，生日：(" + birthday + ")";
    }

    @Override
    public int compareTo(Employee employee) {
        return this.getName().compareTo(employee.getName());
    }
}
