package oop_lab03_exercise2_ex3;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TestEmployee {

    /*Linear search, Binary search, Binary search with recursion*/
    public static void main(String[] args) {
        Employee employee[] = new Employee[10];
        employee[0] = new Employee("Steven", "Phillips", 185190, 575);
        employee[1] = new Employee("Joan", "Foster", 185191, 1371);
        employee[2] = new Employee("Peter", "Ward", 185192, 847);
        employee[3] = new Employee("Denise", "White", 185193, 2112);
        employee[4] = new Employee("Lisa", "Flores", 185194, 2368);
        employee[5] = new Employee("James", "Rogers", 185195, 1867);
        employee[6] = new Employee("Ernest", "Hill", 185196, 1626);
        employee[7] = new Employee("Pamela", "Taylor", 185197, 722);
        employee[8] = new Employee("Walter", "Turner", 185198, 1823);
        employee[9] = new Employee("Billie", "Eilish", 185199, 2486);

        for (Employee emp : employee) {
            System.out.println(emp);
        }

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("Enter the last name to search for: ");
            String eponimo = reader.readLine();

            MyUtils utils = new MyUtils();
            int index = utils.AnazitisiMeEpwnymo(employee, eponimo);
            if (index != -1) {
                System.out.println("Found " + employee[index]);
            } else {
                System.out.println("The last name: " + eponimo + " does not exist");
            }

            System.out.print("Enter the AFM number to search for: ");
            long afm = Long.parseLong(reader.readLine());
            index = utils.AnazitisiMeAFM(employee, afm);
            if (index != -1) {
                System.out.println("Found " + employee[index]);
            } else {
                System.out.println("The AFM: " + afm + " does not exist");
            }

            System.out.println("Using recursion:");
            index = utils.AnadromikiAnazitisiMeAFM(employee, afm, 0, employee.length - 1);
            if (index != -1) {
                System.out.println("Found " + employee[index]);
            } else {
                System.out.println("The AFM: " + afm + " does not exist");
            }
        } catch (IOException e) {
            System.err.println("Input error");
        } catch (NumberFormatException e) {
            System.err.println("Input error: Please enter a valid integer for AFM.");
        }
    }
}
