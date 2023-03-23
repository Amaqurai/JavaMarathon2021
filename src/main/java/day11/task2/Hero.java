package day11.task2;

public abstract class Hero {
    int health;
    final int MIN_HEALTH = 0;
    int physAtt;
    double physDef;
    double magicDef;


    public Hero() {
        health = 100;
    }

    public void physicalAttack(Hero h) {
        double damage = physAtt * (1 - (h.physDef / 100));
        if (h.health - damage < MIN_HEALTH) {
            h.health = MIN_HEALTH;
        } else {
            h.health -= damage;
        }
    }

    @Override
    public String toString() {
        return "Hero{" +
                "health=" + health +
                '}';
    }
}
