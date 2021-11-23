public class Test {
    public static void main (String[] args) {

        Placers deathRat = new DeathRat(1,1);

        System.out.println(deathRat.getItemType());
        System.out.println(deathRat.getItemID());

        Placers deathRat2 = new DeathRat(1,2);

        System.out.println(deathRat2.getItemType());
        System.out.println(deathRat2.getItemID());


        Placers Sterilizer = new Sterilizer(5);
        System.out.println(Sterilizer.placeItem());


    }
}
