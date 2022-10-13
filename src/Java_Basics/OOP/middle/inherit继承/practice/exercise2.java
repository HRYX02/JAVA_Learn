package Java_Basics.OOP.middle.inherit继承.practice;
import static java.lang.Math.*;
public class exercise2 {
    public static void main(String[] args) {
        Cylinder c1 = new Cylinder();
        c1.setRadius(2);
        c1.setLength(10);
        System.out.println(c1.findArea() + "," +c1.findVolume());
    }
}
class Circle{
    private double radius;

    public Circle(){
        radius = 1;
    }
    public Circle(double radius){
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }

    //计算圆的面积
    public double findArea(){
        return radius * radius * PI;
    }
}
class Cylinder extends Circle{
    private double length;

    public Cylinder(){
        length = 1;
    }
    public  Cylinder(double length){
        
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double getLength() {
        return length;
    }
    public double findVolume(){
       return length * findArea();
    }
}
