package day7;

public class Player {

    static final int MAX_STAMINA = 100;
    static final int MIN_STAMINA = 0;
    private static int countPlayers = 0;
    private int stamina;

    public Player(int stamina) {
        if (countPlayers < 6) {
            this.stamina = stamina;
            countPlayers++;
        }
    }

    public static int getCountPlayers() {
        return countPlayers;
    }

    public int getStamina() {
        return stamina;
    }

    public void run() {
         if (stamina > MIN_STAMINA) {
            stamina--;
            if (stamina == MIN_STAMINA) {
                countPlayers--;
                System.out.println("Игрок устал и отправлен в запас отдыхать");
            }
        }
    }

    public static void info() {
        if (countPlayers < 6) {
            int place = 6 - countPlayers;
            System.out.println("Команды не полные. На поле ещё есть " + place + " свободных мест");
        } else {
            System.out.println("На поле нет свободных мест");
        }
    }
}
