public class DeathRat extends Placers{

    public DeathRat(int itemTypeID, int direction) {
        super(itemTypeID);
        this.direction = direction;
    }

    private int move() {
        return 0;
        // change to operator that moves rat by x blocks in  y direction
    }

    public void removeHealth() {
        // remove health from rat it attacks
    }
}
