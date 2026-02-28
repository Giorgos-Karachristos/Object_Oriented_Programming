package oop_lab02_exercise3;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class OOP_Lab02_Exercise3 {

    /*The program implements the Towers of Hanoi algorithm*/
    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int number = 1;
            do {
                System.out.print("Enter an integer greater than zero for the number of disks: ");
                number = Integer.parseInt(reader.readLine());
            } while (number <= 0);
            OOP_Lab02_Exercise3 oppErg2Ask3 = new OOP_Lab02_Exercise3();
            oppErg2Ask3.moveDisks(number, 'A', 'C', 'B');
        } catch (IOException | NumberFormatException e) {
            System.err.println("Input error: Please enter a valid integer.");
        }
    }

    public void moveDisks(int n, char A, char C, char B) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + A + " to " + C);
        } else {
            moveDisks(n - 1, A, B, C);
            System.out.println("Move disk " + n + " from " + A + " to " + C);
            moveDisks(n - 1, B, C, A);
        }
    }
}
