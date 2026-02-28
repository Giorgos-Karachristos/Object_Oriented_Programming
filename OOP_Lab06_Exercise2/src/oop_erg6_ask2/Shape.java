package oop_erg6_ask2;

public abstract class Shape {

    private double X;
    private double Y;

    public Shape() {
    }

    public Shape(double X, double Y) {
        this.X = X;
        this.Y = Y;
    }

    public double getX() {
        return X;
    }

    public void setX(double X) {
        this.X = X;
    }

    public double getY() {
        return Y;
    }

    public void setY(double Y) {
        this.Y = Y;
    }

    public abstract double area();

    @Override
    public String toString() {
        return "and its coordinates are X: " + X + ", Y: " + Y;
    }
}
