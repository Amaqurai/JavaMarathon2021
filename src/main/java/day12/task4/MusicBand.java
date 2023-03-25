package day12.task4;

import java.util.List;

public class MusicBand {
    List<String> nameStar;

    public MusicBand(List<String> nameStar) {
        this.nameStar = nameStar;
    }

    public List<String> getNameStar() {
        return nameStar;
    }

    public static void printMembers (MusicBand b) {
        for (String s: b.nameStar) {
            System.out.print(s + ", ");
        }
        System.out.println();
    }

    public static void transferMembers (MusicBand b, MusicBand a) {
        b.nameStar.addAll(a.nameStar);
    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "nameStar=" + nameStar +
                '}';
    }
}

