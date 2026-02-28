package oop_lab06_exercise3;

public class Circle extends GeometricObject {

    private double radius;

    public Circle() {
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public double getPerimiter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "\nCircle:"
                + "\nRadius: " + radius
                + "\nArea: " + getArea()
                + "\nPerimiter: " + getPerimiter()
                + super.toString();
    }
}
