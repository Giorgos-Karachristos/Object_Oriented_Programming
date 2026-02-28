package oop_lab09_exercise1;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class OOP_Lab09_Exercise1 {

    /*The program manages housing data and calculates and displays their rent*/
    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

            System.out.print("Enter how many houses exist: ");
            int pliuos = Integer.parseInt(reader.readLine());
            ExohikiKatoikia katoikies[] = new ExohikiKatoikia[pliuos];

            int domatio = pliuos * 40 / 100;
            int bungalow = pliuos * 30 / 100;

            for (int i = 0; i < katoikies.length; i++) {
                if (i < domatio) {
                    System.out.println("Entering room data:");
                } else if (i < domatio + bungalow) {
                    System.out.println("Entering bungalow data:");
                } else {
                    System.out.println("Entering villa data:");
                }

                System.out.print("\nEnter the number of rooms: ");
                int domatia = Integer.parseInt(reader.readLine());
                System.out.print("Enter the type name: ");
                String typeName = reader.readLine();
                System.out.print("Enter the city/area: ");
                String Periohi_Poli = reader.readLine();
                System.out.print("Enter the type ID: ");
                int typeID = Integer.parseInt(reader.readLine());
                System.out.print("Enter the number of days: ");
                int NrOfDays = Integer.parseInt(reader.readLine());
                System.out.print("Enter the daily price: ");
                int TimiHmeras = Integer.parseInt(reader.readLine());

                if (i < domatio) {
                    katoikies[i] = new Domatio(typeName, Periohi_Poli, typeID, NrOfDays, TimiHmeras, domatia);
                } else if (i < domatio + bungalow) {
                    katoikies[i] = new Bungalow(typeName, Periohi_Poli, typeID, NrOfDays, TimiHmeras, domatia);
                } else {
                    katoikies[i] = new Villa(typeName, Periohi_Poli, typeID, NrOfDays, TimiHmeras, domatia);
                }
                System.out.println("Successful entry\n");
            }

            for (ExohikiKatoikia katoikia : katoikies) {
                System.out.println(katoikia + "\n");
            }
        } catch (IOException e) {
            System.err.println("Input error");
        } catch (NumberFormatException e) {
            System.err.println("Input error: Please enter a valid number");
        }
    }
}
