package day12.task4;

import java.util.ArrayList;
import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {

        MusicBand band = new MusicBand(new ArrayList<>(Arrays.asList("Michael Pot", "Fox Mulder", "Alex Lesly")));
        MusicBand.printMembers(band);
        MusicBand band1 = new MusicBand(new ArrayList<>(Arrays.asList("Harry Potter", "Hermiona Graynger", "Ron Whithley")));
        MusicBand.printMembers(band1);
        MusicBand.transferMembers(band,band1);
        MusicBand.printMembers(band);
    }
}
