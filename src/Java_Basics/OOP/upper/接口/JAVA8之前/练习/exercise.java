package Java_Basics.OOP.upper.接口.JAVA8之前.练习;

public class exercise {
    public static void main(String[] args) {
        ComparableCircle c1 = new ComparableCircle(23);
        ComparableCircle c2 = new ComparableCircle(24);
        System.out.println(c1.compareTo(c2));
    }
}

interface CompareObject {
    public abstract int compareTo(Object o);
}

class Circle {
    private double redius;

    public Circle(double redius) {
        this.redius = redius;
    }

    public double getRedius() {
        return redius;
    }

    public void setRedius(double redius) {
        this.redius = redius;
    }
}

class ComparableCircle extends Circle implements CompareObject {

    public ComparableCircle(double radius) {
        super(radius);
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof Circle) {
            Circle circle = (Circle)o;
            if (super.getRedius() == circle.getRedius()) {
                return 0;
            } else if (super.getRedius() > circle.getRedius()) {
                return 1;
            } else {
                return -1;
            }
        } else {
            return 0;
        }
    }
}