package oop_lab06_exercise3;

public abstract class GeometricObject {

    private String color;
    private boolean filled;

    public GeometricObject() {
    }

    public GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public boolean isFilled() {
        return filled;
    }

    public abstract double getArea();

    public abstract double getPerimiter();

    @Override
    public String toString() {
        return "\nColor: " + color
                + "\nFilled: " + filled;
    }
}
