package Java_advanced.泛型.练习;

/**
 * @author SHIXINXI
 * @create 2022-10-11-20:31
 */
public class MyDate implements Comparable<MyDate> {
    private int year,month,day;

    public MyDate() {
    }

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return  year +"年"+ month +"月" + day + "日";
    }

    @Override
    public int compareTo(MyDate date) {
        if (this.getYear() > date.getYear()){
            return 1;
        }else if (this.getYear() < date.getYear()){
            return -1;
        }else {
            if (this.getMonth() > date.getMonth()){
                return 1;
            }else if(this.getMonth() < date.getMonth()){
                return -1;
            }else {
                if (this.getDay() > date.getDay()){
                    return 1;
                }else if(this.getDay() < date.getDay()){
                    return -1;
                }else {
                    return 0;
                }
            }
        }
    }
}
