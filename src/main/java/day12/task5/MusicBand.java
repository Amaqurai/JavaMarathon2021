package day12.task5;

import java.util.List;

public class MusicBand {

    List<MusicArtist> nameBand;

    public MusicBand(List<MusicArtist> nameBand) {
        this.nameBand = nameBand;
    }

    public static void transferMembers (MusicBand b, MusicBand a) {
        b.nameBand.addAll(a.nameBand);

    }
    public static void printMembers (MusicBand b){
        for (MusicArtist q: b.nameBand) {
            System.out.print(q + ", ");
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "nameStar=" + nameBand +
                '}';
    }
}

