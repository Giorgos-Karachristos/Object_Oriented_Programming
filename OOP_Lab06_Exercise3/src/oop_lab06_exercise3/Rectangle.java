package oop_lab06_exercise3;

public class Rectangle extends GeometricObject {

    private int width;
    private int height;

    public Rectangle() {
    }

    public Rectangle(String color, boolean filled, int width, int height) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimiter() {
        return 2 * (width + height);//O typos '2 * (width * height)' tis ekfoniseis einai lathos
    }

    @Override
    public String toString() {
        return "\nRectangle:"
                + "\nWidth: " + width
                + "\nHeight: " + height
                + "\nArea: " + getArea()
                + "\nPerimiter: " + getPerimiter()
                + super.toString();
    }
}
