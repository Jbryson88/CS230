package src.com.gamingroom;


//To derive from Entity class, Player must extend to Entity
public class Player extends Entity{	

	// Constructor with an identifier and name
	public Player(long id, String name) {
		this.id = id;
		this.name = name;
	}
	
	// Constructor with and identifier and name and a team
	public Player(long id, String name, Team team) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Player [id=" + id + ", name=" + name + "]";
	}
}