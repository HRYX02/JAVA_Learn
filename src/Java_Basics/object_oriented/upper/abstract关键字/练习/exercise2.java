package Java_Basics.object_oriented.upper.abstract关键字.练习;

public class exercise2 {
    public static void main(String[] args) {
        Employee[] employee = new Employee[2];
        employee[0] = new SalariedEmployee("史鑫玺",001,new MyDate(2002,3,29),15000);
        employee[1] = new HourlyEmployee("史鑫钰",002,new MyDate(2010,8,13),31,580);
        for (int i = 0;i < employee.length;i++){
            System.out.println(employee[i]);
            System.out.println(employee[i].earnings());
        }
    }
}

abstract class Employee {
    private String name;
    private int number;
    private MyDate birthday;

    public Employee() {
    }

    public Employee(String name, int number, MyDate birthday) {
        this.name = name;
        this.number = number;
        this.birthday = birthday;
    }

    public abstract int earnings();

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", number=" + number +
                ", birthday=" + birthday +
                '}';
    }
}

class SalariedEmployee extends Employee {
    private int monthlySalary;

    public SalariedEmployee(String name, int number, MyDate birthday, int monthlySalary) {
        super(name, number, birthday);
        this.monthlySalary = monthlySalary;
    }

    public int earnings() {
        return monthlySalary;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

class HourlyEmployee extends Employee {
    private int wage;
    private int hour;

    public HourlyEmployee(String name, int number, MyDate birthday, int wage ,int hour) {
        super(name, number, birthday);
        this.wage = wage;
        this.hour = hour;
    }

    public int earnings() {
        return wage * hour;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

class MyDate {
    private int year;
    private int month;
    private int day;

    public MyDate() {
    }

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    @Override
    public String toString() {
        return year + "年" + month + "月" + day + "日";
    }
}