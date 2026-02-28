package oop_lab10_exercise1;

import java.util.ArrayList;

public class OOP_Lab10_Exercise1 {

    /*The program creates an ArrayList and demonstrates all of its basic methods*/
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        System.out.println("1) Is the list empty?");
        System.out.println("Result: " + list.isEmpty());
        System.out.println("List: " + list);
        System.out.println("-----------------------");

        list.add("Maria");
        list.add("Giannis");
        list.add("Kostas");
        System.out.println("2) After adding elements:");
        System.out.println("List: " + list);
        System.out.println("-----------------------");

        System.out.println("3) List size:");
        System.out.println("Size: " + list.size());
        System.out.println("-----------------------");

        int index = 1;
        if (index >= 0 && index < list.size()) {
            System.out.println("4) Element at position " + index + ": " + list.get(index));
        } else {
            System.out.println("Invalid index!");
        }
        System.out.println("-----------------------");

        int insertIndex = 1;
        if (insertIndex >= 0 && insertIndex <= list.size()) {
            list.add(insertIndex, "Eleni");
            System.out.println("5) After adding at position " + insertIndex + ":");
            System.out.println("List: " + list);
        } else {
            System.out.println("Invalid index for insertion!");
        }
        System.out.println("-----------------------");

        int removeIndex = 2;
        if (removeIndex >= 0 && removeIndex < list.size()) {
            list.remove(removeIndex);
            System.out.println("6) After removal from position " + removeIndex + ":");
            System.out.println("List: " + list);
        } else {
            System.out.println("Invalid index for removal!");
        }
        System.out.println("-----------------------");

        int replaceIndex = 1;
        if (replaceIndex >= 0 && replaceIndex < list.size()) {
            list.set(replaceIndex, "Nikos");
            System.out.println("7) After replacement at position " + replaceIndex + ":");
            System.out.println("List: " + list);
        } else {
            System.out.println("Invalid index for replacement!");
        }
        System.out.println("-----------------------");
    }
}
