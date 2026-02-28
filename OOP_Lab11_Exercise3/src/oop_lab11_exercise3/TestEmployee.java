package oop_lab11_exercise3;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TestEmployee {

    /*Linear search, Binary search, Bubble sort, Selection sort, Insertion sort*/
    public static void main(String[] args) {
        Employee employee[] = new Employee[10];
        employee[0] = new Employee("Lisa", "Flores", 185194, 2368);
        employee[1] = new Employee("Steven", "Phillips", 185190, 575);
        employee[2] = new Employee("Billie", "Eilish", 185199, 2486);
        employee[3] = new Employee("Joan", "Foster", 185191, 1371);
        employee[4] = new Employee("Peter", "Ward", 185192, 847);
        employee[5] = new Employee("Pamela", "Taylor", 185197, 722);
        employee[6] = new Employee("Ernest", "Hill", 185196, 1626);
        employee[7] = new Employee("Denise", "White", 185193, 2112);
        employee[8] = new Employee("Walter", "Turner", 185198, 1823);
        employee[9] = new Employee("James", "Rogers", 185195, 1867);

        for (Employee emp : employee) {
            System.out.println(emp);
        }

        MyUtils utils = new MyUtils();
        boolean sorted = false;
        String epilogi;

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            do {
                int index = -1;
                MenouEpilogon.emfaniseMenou();
                System.out.print("and type the number of your choice: ");
                epilogi = reader.readLine();
                switch (epilogi) {
                    case "1":
                        System.out.print("Enter the last name: ");
                        String eponimo = reader.readLine();
                        index = utils.AnazitisiMeEpwnymo(employee, eponimo);
                        break;
                    case "2":
                        if (!sorted) {
                            System.out.println("Please sort the array first");
                        } else {
                            try {
                                System.out.print("Enter the code to search for: ");
                                int code = Integer.parseInt(reader.readLine());
                                index = utils.AnazitisiMeKodiko(employee, code);
                            } catch (NumberFormatException e) {
                                System.err.println("Input error: Please enter a valid integer for the code.");
                            }
                        }
                        break;
                    case "3":
                        if (sorted) {
                            System.out.println("The array is already sorted!");
                        }
                        do {
                            MenouEpilogon.emfaniseMenouTajinomisis();
                            System.out.print("Enter selection number: ");
                            epilogi = reader.readLine();
                            switch (epilogi) {
                                case "1":
                                    utils.tajinomisiFysalidasStoKodiko(employee);
                                    break;
                                case "2":
                                    utils.tajinomisiEpilogisStoKodiko(employee);
                                    break;
                                case "3":
                                    utils.tajinomisiEisagogisStoKodiko(employee);
                                    break;
                                case "4":
                                    System.out.println("Return to main menu");
                                    break;
                                default:
                                    System.out.println("Try again");
                                    break;
                            }
                            if ("1".equals(epilogi) || "2".equals(epilogi) || "3".equals(epilogi)) {
                                System.out.println("Array successfully sorted!");
                                sorted = true;
                            }
                        } while (!"4".equals(epilogi));
                        epilogi = "";
                        break;
                    case "4":
                        System.out.println("Program exit...");
                        break;
                    default:
                        System.out.println("Try again");
                        break;
                }
                if (epilogi.equals("1") || (epilogi.equals("2") && sorted)) {
                    if (index != -1) {
                        System.out.println(employee[index]);
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
