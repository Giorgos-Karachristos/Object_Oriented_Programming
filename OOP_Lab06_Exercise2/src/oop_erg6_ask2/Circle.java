package oop_erg6_ask2;

public class Circle extends Shape {

    private double radius;

    public Circle() {
    }

    public Circle(double X, double Y, double radius) {
        super(X, Y);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "The area of the circle is: " + area() + " " + super.toString();
    }
}
