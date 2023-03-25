package day11.task2;

public class Paladin extends Hero implements Healer {
    int healHimself;
    int healTeammate;
    public Paladin() {
        physAtt = 15;
        physDef = 50;
        magicDef = 20;
        healHimself = 25;
        healTeammate = 25;
    }

    @Override
    public void healHimself() {
        health += healHimself;
    }

    @Override
    public void healTeammate(Hero h) {
        h.health += healTeammate;
    }

    @Override
    public String toString() {
        return "Paladin{" +
                "health=" + health +
                '}';
    }
}
