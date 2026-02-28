package oop_lab11_exercise1;

import Metatropes.*;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TestMetatropes {

    /*The program implements a currency conversion package with a selection menu*/
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
                System.out.print("Enter the amount: ");
                double poso = Double.parseDouble(reader.readLine());
                System.out.print("Enter the exchange rate: ");
                double isotimia = Double.parseDouble(reader.readLine());
                System.out.print("The exchange rate is: ");
                switch (select) {
                    case 1: {
                        System.out.println(EuroToDollar.euroToDollar(poso, isotimia));
                    }
                    break;
                    case 2: {
                        System.out.println(DollarToEuro.dollarToEuro(poso, isotimia));
                    }
                    break;
                    case 3: {
                        System.out.println(EuroToLek.euroToLek(poso, isotimia));
                    }
                    break;
                    case 4: {
                        System.out.println(LekToEuro.lekToEuro(poso, isotimia));
                    }
                    break;
                    case 5: {
                        System.out.println(EuroToGen.euroToGen(poso, isotimia));
                    }
                    break;
                    case 6: {
                        System.out.println(GenToEuro.genToEuro(poso, isotimia));
                    }
                    break;
                    case 7: {
                        System.out.println(EuroToLira.euroToLira(poso, isotimia));
                    }
                    break;
                    case 8: {
                        System.out.println(LiraToEuro.liraToEuro(poso, isotimia));
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
