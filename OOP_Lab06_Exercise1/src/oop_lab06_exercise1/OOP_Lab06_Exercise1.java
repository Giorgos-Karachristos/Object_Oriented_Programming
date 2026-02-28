package oop_lab06_exercise1;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class OOP_Lab06_Exercise1 {

    /*The program manages housing data, calculates the sale or rental price, and displays the results to the user*/
    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

            System.out.print("Enter how many houses exist: ");
            int pliuos = Integer.parseInt(reader.readLine());
            Katoikia katoikies[] = new Katoikia[pliuos];

            int diamerismata = pliuos * 60 / 100;
            int mesonetes = pliuos * 20 / 100;

            for (int i = 0; i < katoikies.length; i++) {
                if (i < diamerismata) {
                    System.out.println("Entering apartment data:");
                } else if (i < diamerismata + mesonetes) {
                    System.out.println("Entering maisonette data:");
                } else {
                    System.out.println("Entering detached house data:");
                }

                System.out.print("Enter the code: ");
                int kodikos = Integer.parseInt(reader.readLine());
                System.out.print("Enter the number of rooms: ");
                int domatia = Integer.parseInt(reader.readLine());
                System.out.print("Enter the square meters: ");
                double metra = Double.parseDouble(reader.readLine());
                System.out.print("Enter the address: ");
                String dieyuisi = reader.readLine();
                System.out.print("Enter the price: ");
                double timi = Double.parseDouble(reader.readLine());

                if (i < diamerismata) {
                    katoikies[i] = new Diamerisma(kodikos, domatia, metra, dieyuisi, timi);
                } else if (i < diamerismata + mesonetes) {
                    katoikies[i] = new Mesonette(kodikos, domatia, metra, dieyuisi, timi);
                } else {
                    katoikies[i] = new ExohikiKatoikia(kodikos, domatia, metra, dieyuisi, timi);
                }
                System.out.println("Successful entry\n");
            }
            for (Katoikia katoikia : katoikies) {
                System.out.println(katoikia + "\n");
            }
        } catch (IOException e) {
            System.err.println("Input error");
        } catch (NumberFormatException e) {
            System.err.println("Input error: Please enter a valid number");
        }
    }
}
