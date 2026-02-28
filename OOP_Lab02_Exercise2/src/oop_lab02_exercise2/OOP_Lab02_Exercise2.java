package oop_lab02_exercise2;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class OOP_Lab02_Exercise2 {

    /*The program reverses the number given as input and displays the result*/
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int number = 0;
            do {
                System.out.print("Enter a positive number to reverse: ");
                number = Integer.parseInt(reader.readLine());
            } while (number < 0);
            System.out.print("The result of the reversal is: ");
            reverseDisplay(number);
            System.out.println();
        } catch (IOException | NumberFormatException e) {
            System.err.println("Input error: Please enter a valid integer.");
        }
    }

    public static void reverseDisplay(int value) {
        if (value < 10) {
            System.out.print(value);
        } else {
            System.out.print(value % 10);
            reverseDisplay(value / 10);
        }
    }
}
