package OOP;

import java.util.ArrayList;

public class Satchel {
    private static ArrayList<Ring> powerSource;

    public static void main(String[] args) {
        Ring one = new OneRing(0, "", "", true);
        Satchel s = new Satchel();
        s.powerSource.add(one);
    }
}
