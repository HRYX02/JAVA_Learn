package Java_Basics.object_oriented.middle.object_and_Packaging.practice;

public class exercise2 {
    public static void main(String[] args) {
        MyDate m1 = new MyDate(14, 3, 1976);
        MyDate m2 = new MyDate(14, 3, 1976);
        if (m1 == m2) {
            System.out.println("m1==m2");
        } else {
            System.out.println("m1!=m2"); // m1 != m2
        }
        if (m1.equals(m2)) {
            System.out.println("m1 is equal to m2");// m1 is equal to m2
        } else {
            System.out.println("m1 is not equal to m2");
        }
    }
}
class MyDate{
    private int Year;
    private int Month;
    private int Day;

    public MyDate() {

    }
    public MyDate(int year, int month, int day) {
        Year = year;
        Month = month;
        Day = day;
    }

    public int getYear() {
        return Year;
    }
    public void setYear(int year) {
        Year = year;
    }
    public int getMonth() {
        return Month;
    }
    public void setMonth(int month) {
        Month = month;
    }
    public int getDay() {
        return Day;
    }
    public void setDay(int day) {
        Day = day;
    }
    public boolean equals(Object obj){
        if (this == obj){
            return true;
        }
        if (obj instanceof MyDate){
            MyDate m = (MyDate)obj;
            if (this.Year ==m.Year && this.Month == m.Month && this.Day == m.Day){
                return true;
            }else {
                return false;
            }
        }
        return false;
    }
}