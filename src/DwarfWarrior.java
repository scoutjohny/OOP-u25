public class DwarfWarrior extends BaseHero{
    double rage;

    public DwarfWarrior(double health, double mana, double rage){
        this.health = health;
        this.mana = mana;
        this.rage = rage;
        this.isDead = false;
    }
    @Override
    public void firePrimary() {
        System.out.println("Dwarf Warrior swings his primary weapon!");
        this.mana -=10;
        this.rage  +=15;
    }

    @Override
    public void fireSecondary() {
        System.out.println("Dwarf Warrior swings his secondary weapon!");
        this.mana -=30;
        this.rage  +=45;
    }

    @Override
    public void receiveHit() {
        this.health -=10;
        this.isDead = this.health<0;
    }

    @Override
    public void showStats() {
        System.out.println("Stats for the Dwarf Warrior: ");
        System.out.println("Health: "+health + " Mana: "+mana+" Rage: "+rage);
    }
}
