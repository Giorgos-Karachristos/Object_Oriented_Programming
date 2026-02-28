package oop_lab06_exercise3;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class OOP_Lab06_Exercise3 {

    /*The program creates different types of geometric shapes and 
    calculates and displays their area, perimeter, and, where applicable, volume*/
    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

            System.out.print("Enter how many shapes exist: ");
            int pliuos = Integer.parseInt(reader.readLine());
            GeometricObject sximata[] = new GeometricObject[pliuos];

            int rectangle = pliuos * 40 / 100;
            int circle = pliuos * 30 / 100;

            for (int i = 0; i < sximata.length; i++) {
                if (i < rectangle) {
                    System.out.println("Entering rectangle data:");
                } else if (i < rectangle + circle) {
                    System.out.println("Entering circle data:");
                } else {
                    System.out.println("Entering cylinder data:");
                }

                System.out.print("\nEnter the color: ");
                String xroma = reader.readLine();
                String gemato;
                do {
                    System.out.print("Is the shape filled? (true/false): ");
                    gemato = reader.readLine().trim();
                } while (!"true".equalsIgnoreCase(gemato) && !"false".equalsIgnoreCase(gemato));
                boolean filled = Boolean.parseBoolean(gemato);

                if (i < rectangle) {
                    System.out.print("Enter the width: ");
                    int width = Integer.parseInt(reader.readLine());
                    System.out.print("Enter the height: ");
                    int height = Integer.parseInt(reader.readLine());
                    sximata[i] = new Rectangle(xroma, filled, width, height);
                } else if (i < rectangle + circle) {
                    System.out.print("Enter the radius: ");
                    double radius = Double.parseDouble(reader.readLine());
                    sximata[i] = new Circle(xroma, filled, radius);
                } else {
                    System.out.print("Enter the height: ");
                    int height = Integer.parseInt(reader.readLine());
                    System.out.print("Enter the radius: ");
                    double radius = Double.parseDouble(reader.readLine());
                    sximata[i] = new Cylinder(xroma, filled, height, radius);
                }
                System.out.println("Successful entry\n");
            }
            for (GeometricObject sxima : sximata) {
                System.out.println(sxima + "\n");
            }
        } catch (IOException e) {
            System.err.println("Input error");
        } catch (NumberFormatException e) {
            System.err.println("Input error: Please enter a valid number");
        }
    }
}
