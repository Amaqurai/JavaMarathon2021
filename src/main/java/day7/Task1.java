package day7;

public class Task1 {
    public static void main(String[] args) {

        Airplane air1 = new Airplane("Boeing", 1985, 200, 6);
        Airplane air2 = new Airplane("SU-37", 1950, 100, 1);

        Airplane.compareAirplanes(air1, air2);
    }
}