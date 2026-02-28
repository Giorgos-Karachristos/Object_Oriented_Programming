package oop_lab01_exercise2;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class OOP_Lab01_Exercise2 {

    /*Agent management and commission calculation system*/
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Antiprosopoi pinakas[] = new Antiprosopoi[3];
        for (int i = 0; i < pinakas.length; i++) {
            System.out.print("Enter code: ");
            int kodikos = Integer.parseInt(br.readLine());
            System.out.print("Enter full name: ");
            String onoma = br.readLine();
            System.out.print("Enter sales: ");
            double poliseis = Double.parseDouble(br.readLine());
            pinakas[i] = new Antiprosopoi(kodikos, onoma, poliseis);
        }
        double promhtheies[];
        promhtheies = Antiprosopoi.Promhtheia(pinakas);
        for (int i = 0; i < 3; i++) {
            System.out.println("The commission amount is: " + promhtheies[i]);
        }
        System.out.println("Total sales: " + Antiprosopoi.sumPoliseon(pinakas));
    }
}
