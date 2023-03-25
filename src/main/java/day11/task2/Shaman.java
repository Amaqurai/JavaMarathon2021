package day11.task2;

public class Shaman extends Hero implements MagicAttack, Healer {
    int magicAtt;
    int healHimself;
    int healTeammate;
    public Shaman() {
        physAtt = 10;
        magicAtt = 15;
        physDef = 20;
        magicDef = 20;
        healHimself = 50;
        healTeammate = 30;
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
    public void healHimself() {
        health += healHimself;
    }

    @Override
    public void healTeammate(Hero h) {
        h.health += healTeammate;
    }

    @Override
    public String toString() {
        return "Shaman{" +
                "health=" + health +
                '}';
    }
}
