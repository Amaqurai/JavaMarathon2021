package day1;

public class Task4 {
    public static void main(String[] args) {
        int year = 1980;
        String PHRASE = "Олимпиада %d года\n";
        while (year <= 2020) {
            System.out.printf(PHRASE, year);
            year += 4;
        }
    }
}
