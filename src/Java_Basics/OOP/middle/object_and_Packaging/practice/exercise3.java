package Java_Basics.OOP.middle.object_and_Packaging.practice;

public class exercise3 {
    public static void main(String[] args) {
        Circle circle1 = new Circle(10,"红",2);
        Circle circle2 = new Circle(5,"红",3);
        System.out.println(circle1.color.equals(circle2.color));
        System.out.println(circle1.equals(circle2));
        System.out.println(circle1.toString());
    }
}
class GeometricObject{//代表几何图形
    protected String color;
    protected double weight;

    protected GeometricObject(){
        color = "white";
        weight = 1.0;
    }
    protected GeometricObject(String color,double weight){
        this.weight = weight;
        this.color = color;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
}
class Circle extends GeometricObject{//代表圆形
    private double radius;

    public Circle() {
        color = "white";
        weight = 1.0;
        radius = 1.0;
    }
    public Circle(double radius) {
        super();
        this.radius = radius;
    }
    public Circle(double radius,String color,double weight) {
        this.radius = radius;
        this.color = color;
        this.weight = weight;
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double findArea(){//计算圆的面积
        return Math.PI * radius * radius;
    }
    public boolean equals(Object obj){
        if (this == obj){
            return true;
        }
        if (obj instanceof Circle){
            Circle c = (Circle)obj;
            if (this.radius == c.radius){
                return true;
            }else {
                return false;
            }
        }else{
            return false;
        }
    }

    @Override
    public String toString() {
        return "Circle[" +
                "radius=" + radius +
                ']';
    }
}