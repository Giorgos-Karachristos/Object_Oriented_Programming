package oop_lab03_exercise1;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class OOP_Lab03_Exercise1 {

    /*The program finds and displays, using linear search, a name in an unsorted array of names*/
    public static void main(String[] args) {
        String arrayOfNames[] = {"Liam", "Olivia", "Noah", "Emma",
            "Oliver", "Amelia", "Theodore", "Charlotte"};

        System.out.println("Array of names:");
        for (String names : arrayOfNames) {
            System.out.println(names);
        }

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("Enter the name to search for: ");
            String key = reader.readLine();

            int index = linearSearch(arrayOfNames, key);
            if (index != -1) {
                System.out.println("The name: " + key + " was found at position: " + (index + 1));
            } else {
                System.out.println("The name: " + key + " was not found");
            }
        } catch (IOException e) {
            System.err.println("Input error");
        }
    }

    public static int linearSearch(String[] pin, String key) {
        for (int i = 0; i < pin.length; i++) {
            if (key.equals(pin[i])) {
                return i;
            }
        }
        return -1;
    }
}
