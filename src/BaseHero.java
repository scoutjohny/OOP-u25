public abstract class BaseHero {
    public double health,mana;
    public boolean isDead;

    public void showStats(){
        System.out.println("Health: "+health + " Dead: "+isDead);
    }

    public abstract void firePrimary();
    public abstract void fireSecondary();
    public abstract void receiveHit();
    public void areaOfEffect(){
        receiveHit();
    }

}
