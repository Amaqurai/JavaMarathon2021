package day12.task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {

        List<MusicBand> bandList = new ArrayList<>(Arrays.asList(
                new MusicBand("King and the Clown", 1988),
                new MusicBand("DDT", 1980),
                new MusicBand("Sharpening", 2018),
                new MusicBand("Omerican voice", 2004),
                new MusicBand("GULAG", 1999),
                new MusicBand("KnyaZz", 2011),
                new MusicBand("Brigade contract", 1980),
                new MusicBand("Animals", 2001),
                new MusicBand("Earthlings", 1984),
                new MusicBand("Ivan Kaif", 1990)
        ));

        Collections.shuffle(bandList);
        System.out.println(bandList);
        System.out.println(groupAfter2000(bandList));
    }

    public static List<MusicBand> groupAfter2000(List<MusicBand> bandList) {
        List<MusicBand> buffList = new ArrayList<>();
        for (MusicBand b : bandList) {
            if (b.getYear() > 2000) {
                buffList.add(b);
            }
        }
        return buffList;
    }
}
