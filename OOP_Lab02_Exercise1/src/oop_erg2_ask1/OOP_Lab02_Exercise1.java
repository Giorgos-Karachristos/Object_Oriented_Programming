package oop_erg2_ask1;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class OOP_Lab02_Exercise1 {

    /*The program calculates and displays the power (exponentiation) of a number*/
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("Enter an integer for the base: ");
            int basi = Integer.parseInt(reader.readLine());
            int dinami = 0;
            do {
                System.out.print("Enter a positive integer for the exponent: ");
                dinami = Integer.parseInt(reader.readLine());
            } while (dinami < 0);
            System.out.println("The result of the exponentiation is: " + power(basi, dinami));
        } catch (IOException | NumberFormatException e) {
            System.err.println("Input error: Please enter valid integers.");
        }
    }

    public static int power(int basi, int dinami) {
        if (dinami == 0) {
            return 1;
        }
        return basi * power(basi, dinami - 1);
    }
}
