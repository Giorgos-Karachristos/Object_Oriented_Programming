package oop_erg6_ask2;

public class Rectangle extends Shape {

    private double height;
    private double width;

    public Rectangle() {
    }

    public Rectangle(double X, double Y, double height, double width) {
        super(X, Y);
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double area() {
        return height * width;
    }

    @Override
    public String toString() {
        return "The area of the rectangle is: " + area() + " " + super.toString();
    }
}
