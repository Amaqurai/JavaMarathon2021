package day7;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random r = new Random();

        var playerOne = new Player(r.nextInt()*((Player.MAX_STAMINA-90)+1)+90);
        Player.info();
        playerOne.run();

    }
}
