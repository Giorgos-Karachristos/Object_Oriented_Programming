package oop_lab07_exercise1_ex2;

public class OOP_Lab07_Exercise1_Ex2 {

    /*The program creates different types of courses and calculates and displays the final grade of each course*/
    public static void main(String[] args) {
        Course courses[] = new Course[4];
        courses[0] = new Theoritiko("Mauimatika II", 7.9, 5);
        courses[1] = new Ergastiriako("Sxediasi Cifiakon Sistimaton", 8.4);
        courses[2] = new Meikto("Adikimenostrefis Programmatismos", 10, 9.2);
        courses[3] = new MeiktoMeErgasia("Metrisis kai Kiklomata Enalasomenoy Reymatos", 6.5, 9.5, 5);

        for (Course course : courses) {
            System.out.println(course);
        }
    }
}
