package oop_lab04_exercise1;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TestEmployee {

    /*Linear search, Binary search, Bubble Sort*/
    public static void main(String[] args) {
        Employee employees[] = new Employee[10];
        employees[0] = new Employee("Lisa", "Flores", 185194, 2368);
        employees[1] = new Employee("Steven", "Phillips", 185190, 575);
        employees[2] = new Employee("Billie", "Eilish", 185199, 2486);
        employees[3] = new Employee("Joan", "Foster", 185191, 1371);
        employees[4] = new Employee("Peter", "Ward", 185192, 847);
        employees[5] = new Employee("Pamela", "Taylor", 185197, 722);
        employees[6] = new Employee("Ernest", "Hill", 185196, 1626);
        employees[7] = new Employee("Denise", "White", 185193, 2112);
        employees[8] = new Employee("Walter", "Turner", 185198, 1823);
        employees[9] = new Employee("James", "Rogers", 185195, 1867);

        for (Employee employee : employees) {
            System.out.println(employee);
        }

        MyUtils utils = new MyUtils();
        boolean sorted = false;
        String epilogi;

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            do {
                int index = -1;
                System.out.println("Select from the menu below");
                System.out.println("1. Search by last name");
                System.out.println("2. Search by code");
                System.out.println("3. Sort by code");
                System.out.println("4. Exit");
                System.out.print("and type the number of your choice: ");
                epilogi = reader.readLine();
                switch (epilogi) {
                    case "1":
                        System.out.print("Enter the last name: ");
                        String eponimo = reader.readLine();
                        index = utils.AnazitisiMeEpwnymo(employees, eponimo);
                        break;
                    case "2":
                        if (!sorted) {
                            System.out.println("Please sort the array first");
                            continue;
                        }
                        try {
                            System.out.print("Enter the code to search for: ");
                            int code = Integer.parseInt(reader.readLine());
                            index = utils.AnazitisiMeKodikos(employees, code);
                        } catch (NumberFormatException e) {
                            System.err.println("Input error: Please enter a valid integer for the code.");
                        }
                        break;
                    case "3":
                        if (!sorted) {
                            utils.TajinomisiStoKodiko(employees);
                            sorted = true;
                            System.out.println("Array successfully sorted!");
                            continue;
                        }
                        System.out.println("The array is already sorted!");
                        break;
                    case "4":
                        System.out.println("Program exiting...");
                        break;
                    default:
                        System.out.println("Try again");
                        break;
                }
                if (epilogi.equals("1") || (epilogi.equals("2") && sorted)) {
                    if (index != -1) {
                        System.out.println(employees[index]);
                    } else {
                        System.out.println("Employee does not exist");
                    }
                }
            } while (!"4".equals(epilogi));
        } catch (IOException e) {
            System.err.println("Input error");
        }
    }
}
