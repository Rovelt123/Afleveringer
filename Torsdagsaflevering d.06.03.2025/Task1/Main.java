public class Main {

	public static void main(String[] args) {
		Team firstTeam = new Team("OG MEMBERS");
		firstTeam.setRank(5);
		firstTeam.addPlayer("Andreas");
		firstTeam.addPlayer("Elias");
		firstTeam.addPlayer("Vikthor");
		System.out.println(firstTeam);


		Team otherTeam = new Team("CS PLEBS");
		otherTeam.setRank(4);
		otherTeam.addPlayer("Katrine");
		otherTeam.addPlayer("Julie");
		otherTeam.addPlayer("Freja");
		System.out.println(otherTeam);



		Team thirdTeam = new Team("Fruit team");
		thirdTeam.setRank(3);
		thirdTeam.addPlayer("Citron");
		thirdTeam.addPlayer("Appelsin");
		thirdTeam.addPlayer("Banan");
		System.out.println(thirdTeam);



		Team fourthTeam = new Team("Soda lovers");
		fourthTeam.setRank(2);
		fourthTeam.addPlayer("Faxe Kondi");
		fourthTeam.addPlayer("Coca cola");
		fourthTeam.addPlayer("Pepsi max (Maximum taste, no SUGAR!");
		System.out.println(fourthTeam);



		Team fifthTeam = new Team("Game Lovers");
		fifthTeam.setRank(1);
		fifthTeam.addPlayer("CS2");
		fifthTeam.addPlayer("GTA V");
		fifthTeam.addPlayer("Minecraft");
		System.out.println(fifthTeam);


		// Tilføjede også en metode til at fjerne en spiller på spillerens navn:
		/*
		firstTeam.removePlayer("Andreas");
		System.out.println(firstTeam);
		*/
	}

}