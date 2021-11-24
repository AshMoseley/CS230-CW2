
public class Player {
	String playerName;
	int playerHighScore;
	
	public Player(String pName, int pHighScore ) {
		playerName = pName;
		playerHighScore = pHighScore;
	}
	
	public static void main(String[] args) {
	    Player TheLegend27 = new Player("TheLegend27", 456);
	    System.out.println(TheLegend27.playerName + " " + TheLegend27.playerHighScore);
	  }
}
