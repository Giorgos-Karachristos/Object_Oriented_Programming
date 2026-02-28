package oop_lab11_exercise2;

import Metatropes.*;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TestMetatropesMonadon {

    /*The program implements a unit conversion package with a selection menu*/
    public static void main(String[] args) {
        int select;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            do {
                MenouEpilogon.emfaniseMenou();
                System.out.print("Enter selection number: ");
                select = Integer.parseInt(reader.readLine());

                if (select < 1 || select > 8) {
                    if (select == 9) {
                        System.out.println("Program exit...");
                    } else {
                        System.out.println("Please try again");
                    }
                    continue;
                }
                System.out.print("Enter the value: ");
                double timi = Double.parseDouble(reader.readLine());
                System.out.print("The conversion result is: ");
                switch (select) {
                    case 1: {
                        System.out.println(MetroToXiliometro.metroToXiliometro(timi));
                    }
                    break;
                    case 2: {
                        System.out.println(XiliometroToMetro.xiliometroToMetro(timi));
                    }
                    break;
                    case 3: {
                        System.out.println(LitroToGaloni.litroToGalon(timi));
                    }
                    break;
                    case 4: {
                        System.out.println(GaloniToLitro.galonToLitro(timi));
                    }
                    break;
                    case 5: {
                        System.out.println(KiloToLibra.kiloToLibra(timi));
                    }
                    break;
                    case 6: {
                        System.out.println(LibraToKilo.libraToKilo(timi));
                    }
                    break;
                    case 7: {
                        System.out.println(TetragonikametraToTetragonikapodia.tetragonikametraToTetragonikapodia(timi));
                    }
                    break;
                    case 8: {
                        System.out.println(TetragonikapodiaToTetragonikametra.tetragonikapodiaToTetragonikametra(timi));
                    }
                    break;
                }
            } while (select != 9);
        } catch (IOException e) {
            System.err.println("Input error");
        } catch (NumberFormatException e) {
            System.err.println("Input error: Please enter a valid number");
        }
    }
}
