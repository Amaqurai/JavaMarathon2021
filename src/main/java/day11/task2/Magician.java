package day11.task2;

public class Magician extends Hero implements MagicAttack {
    int magicAtt;

    public Magician() {
        physAtt = 5;
        magicAtt = 20;
        physDef = 0;
        magicDef = 80;
    }

    @Override
    public void magicalAttack(Hero h) {
        double damage = magicAtt * (1 - (h.magicDef / 100));
        if (h.health - damage < MIN_HEALTH) {
            h.health = MIN_HEALTH;
        } else {
            h.health -= damage;
        }
    }

    @Override
    public String toString() {
        return "Magician{" +
                "health=" + health +
                '}';
    }
}
