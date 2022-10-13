package learn;

class Cylinder {
    static final double pi = Math.PI;
    private int radius;
    private int height;

    Cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }
    int getHeight(){
        return height;
    }
    int getRadius(){
        return radius;
    }
    double surfaceArea(){
        return (2*pi*radius*height)+(2*pi*radius*radius);
    }
    double volume(){
        return pi*radius*radius*height;
    }
}
class Rectangle{
    private int length;
    private int breadth;

    Rectangle() {
        this.length = 4;
        this.breadth = 5;
    }

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }
}

public class practiceAccessModifierConstructor {
    public static void main(String[] args) {
        Cylinder c = new Cylinder(2 ,5);
        System.out.println(c.getRadius());
        System.out.println(c.getHeight());
        System.out.println(c.surfaceArea());
        System.out.println(c.volume());

        Rectangle r1 = new Rectangle();
        System.out.println(r1.getLength());
        Rectangle r2 = new Rectangle(5,6);
        System.out.println(r2.getLength());
    }
}
