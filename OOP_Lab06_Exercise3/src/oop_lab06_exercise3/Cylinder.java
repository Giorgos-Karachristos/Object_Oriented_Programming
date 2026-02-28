package oop_lab06_exercise3;

public class Cylinder extends GeometricObject {

    private int height;
    private double radius;

    public Cylinder() {
    }

    public Cylinder(String color, boolean filled, int height, double radius) {
        super(color, filled);
        this.height = height;
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return 2 * radius * radius * Math.PI + 2 * radius * Math.PI * height;
        //O typos '2 * getArea() * getPerimiter() * height' tis ekfoniseis einai lathos
    }

    public double Volume() {
        return radius * radius * Math.PI * height;
    }

    @Override
    public double getPerimiter() {
        return 0;
        //H ekfonisi den mas dinei tipo
    }

    @Override
    public String toString() {
        return "\nCylinder:"
                + "\nRadius: " + getRadius()
                + "\nHeight: " + height
                + "\nArea: " + getArea()
                + "\nPerimiter: " + getPerimiter()
                + "\nVolume: " + Volume()
                + super.toString();
    }
}
