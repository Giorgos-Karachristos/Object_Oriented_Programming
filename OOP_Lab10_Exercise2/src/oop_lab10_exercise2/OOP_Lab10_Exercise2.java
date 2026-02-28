package oop_lab10_exercise2;

import java.util.ArrayList;

public class OOP_Lab10_Exercise2 {

    /*The program manages collections of songs, movies, and games*/
    public static void main(String[] args) {
        ArrayList<Items> list = new ArrayList<>();
        list.add(new SongCDs("Short n' Sweet", "Sabrina Carpenter", 2024, 9.99, 12, "pop", 36.15));
        list.add(new MovieDVDs("Morbius", "Jared Leto", 2022, 99.99, 104.0, "USA", 9999999));
        list.add(new GameDVDs("GTA V", "Rockstar Games", 2013, 69.67, true, "PS3", 18));
        for (Items ls : list) {
            System.out.println(ls);
        }
        for (Items ls : list) {
            if (ls.anazitisiMeTitlo("GTA V")) {
                System.out.println("Found: " + ls);
            }
        }
    }
}
