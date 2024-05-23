public class Main {
    public static void main(String[] args) {

        DwarfWarrior dwarfWarrior = new DwarfWarrior(100,30,0);
        UndeadGoblin undeadGoblin = new UndeadGoblin();
        IChampion champion = new IChampion() {
            @Override
            public void receiveHit() {

            }

            @Override
            public void firePrimary() {

            }

            @Override
            public void fireSecondary() {

            }
        };
        dwarfWarrior.showStats();
        dwarfWarrior.firePrimary();
        dwarfWarrior.fireSecondary();
        dwarfWarrior.receiveHit();
        dwarfWarrior.areaOfEffect();
    }
}