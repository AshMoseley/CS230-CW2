public class Placers extends Item {

    protected int direction;

    public Placers(int itemTypeID) {
        super(itemTypeID);
    }

    public int getDirection() {
        return direction;
    }

    public int placeItem() {
        // place item in x,y position
        return 100;

    }
}
