package day12;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List <String> auto = new ArrayList<>();
        auto.add("Renault");
        auto.add("Gazelle");
        auto.add("UAZ");
        auto.add("Lada");
        auto.add("KAMAZ");

        for (String s : auto) {
            System.out.println(s);
        }

        auto.add(3,"Belaz");
        auto.remove(0);

        for (String s : auto) {
            System.out.println(s);
        }
    }
}
