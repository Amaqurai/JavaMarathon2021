package day12.task5;

import java.util.ArrayList;
import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        MusicArtist artist1 = new MusicArtist("Cris Put", 61);
        MusicArtist artist2 = new MusicArtist("Pul Yong", 62);
        MusicArtist artist3 = new MusicArtist("Ted Man", 18);

        MusicBand musicBand = new MusicBand(new ArrayList<MusicArtist>(Arrays.asList(artist1, artist2, artist3)));
        MusicBand.printMembers(musicBand);


        MusicArtist artist4 = new MusicArtist("David Mean", 15);
        MusicArtist artist5 = new MusicArtist("Tom Black", 19);
        MusicArtist artist6 = new MusicArtist("Garry Dust", 52);

        MusicBand musicBand2 = new MusicBand(new ArrayList<MusicArtist>(Arrays.asList(artist4, artist5, artist6)));
        MusicBand.printMembers(musicBand2);

        MusicBand.transferMembers(musicBand,musicBand2);

        MusicBand.printMembers(musicBand);
    }
}
