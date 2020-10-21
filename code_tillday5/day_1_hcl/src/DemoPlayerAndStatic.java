class Player{
	private int id;
	private String name;
	private int rank;
	private static int playerCounter=0;
	
	public Player(String name, int rank) {
		this.id = ++playerCounter;
		this.name = name;
		this.rank = rank;
	}
	
	public void printPlayerDetails() {
		System.out.println("player detais: "+ id + " name "+ name + " rank "+ rank);
	}
	
	public static int getCounter() {
		return playerCounter;
	}
	
}
public class DemoPlayerAndStatic {
	
	public static void main(String[] args) {
		Player player1=new Player("sachin", 1);
		Player player2=new Player("rahul", 2);
		Player player3=new Player("ganguly", 3);
		
		System.out.println(Player.getCounter());
		
	}

}
