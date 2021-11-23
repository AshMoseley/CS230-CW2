
public class Item {

    protected int itemTypeID;
    protected int itemID;
    private static int itemCount;

    public Item(int itemTypeID) {

        this.itemTypeID = itemTypeID;
        itemCount++;
        itemID = itemCount;

    }

    public int getItemType() {
        return itemTypeID;
    }
    public int getItemID() {
        return itemID;
    }

}
