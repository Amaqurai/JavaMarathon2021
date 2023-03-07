package day1;

public class Task5 {
    public static void main(String[] args) {
        int startYear = 1980;
        int finalYear = 2020;
        int iterator = 4;
        String PHRASE = "Олимпиада %d года\n";

        for (int i = startYear; i <= finalYear; i += iterator) {
            System.out.printf(PHRASE, i);
        }
    }
}
