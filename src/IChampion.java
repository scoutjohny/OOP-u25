public interface IChampion {
    public void receiveHit();
    public void firePrimary();
    public void fireSecondary();

    default public void nekaMetoda(){
        System.out.println("nešto");
    }
}
