package Java_Basics.OOP.upper.abstract关键字.练习;

public class exercise1 {
    public static void main(String[] args) {
        Manager manager = new Manager("1雷军",001,100000,5000000);
        manager.work();
    }
}

abstract class Employee1 {
    private String name;
    private int id;
    private double salary;

    public Employee1() {
    }

    public Employee1(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public abstract void work();
}

class Manager extends Employee1 {
    private double bonus;

    public Manager() {
    }

    public Manager(String name, int id, double salary, double bonus) {
        super(name, id, salary);
        this.bonus = bonus;
    }

    public void work(){
        System.out.println("管理员工");
    };
}
class CommonEmployee extends Employee1{
    public void work(){
        System.out.println("一线员工生产");
    }
}
