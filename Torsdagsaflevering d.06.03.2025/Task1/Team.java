import java.util.ArrayList;

public class Team {
	private String name;
	private int rank;
	private ArrayList<String> playerNames;

	public Team(String name) {
		this.name = name;
		this.playerNames = new ArrayList<>();
	}

	public void addPlayer(String playerName) {
		playerNames.add(playerName);
	}

	public void removePlayer(String playerName) {
		playerNames.remove(playerName);
	}


	public void setRank(int tmpRank) {
		this.rank = tmpRank;
	}
	
	@Override
	public String toString() {
		ArrayList<String> tempNames = new ArrayList<>(); 
		for (String c : this.playerNames) {
			//System.out.println(c);
		    tempNames.add(c + " ");
		}
		String variable = "\nTeam name: " + this.name + " \nTeam rank: " + this.rank + "\nPlayers: " + String.join(" ", tempNames) + "\n";
		return variable;
	}

}