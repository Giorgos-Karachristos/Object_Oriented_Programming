package oop_erg6_ask2;

public class AbstractShape {

    /*The program creates different types of geometric shapes and 
   calculates and displays their area along with their coordinates*/
    public static void main(String[] args) {
        Shape shapes[] = new Shape[2];
        shapes[0] = new Rectangle(3.0, 4.0, 13.5, 7.8);
        shapes[1] = new Circle(6.0, 7.6, 2.4);
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }
}
