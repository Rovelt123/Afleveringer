import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<String> actions = new ArrayList<>();
		actions.add("1.) Start game");
		actions.add("2.) Resume game");
		actions.add("3.) Pause game");
		actions.add("4.) End game");

		GameMenu gui = new GameMenu(actions);
		//gui.displayMenu();

		String choice = gui.getAction();
		
		System.out.println("\u001B[32mYou choosed: "+choice + "\u001B[0m");
		// Den ville aldrig kunne komme til dette, men for at være sikker, så har jeg lavet et try catch!
		try {
			int subtoin = Integer.parseInt(choice.substring(0, 1));
			doAction(subtoin);
		} catch (NumberFormatException e) {
			System.out.println("ERROR!");
		}
	}

	public static void doAction(int action) {
		switch (action) {
		case 1:
			System.out.println("1: Starter spillet nu");
			break;
		case 2:
			System.out.println("2: Henter tidligere gemte spildata");
			break;
		case 3:
			System.out.println("3: Spil sat på pause");
			break;
		case 4:
			System.out.println("4: Afsluttede spil");
			break;
		}
	}

}