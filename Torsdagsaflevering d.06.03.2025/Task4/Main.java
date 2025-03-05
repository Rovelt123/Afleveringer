import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<String> actions = new ArrayList<>();
		actions.add("1.) Start game");
		actions.add("2.) Resume game");
		actions.add("3.) Pause game");
		actions.add("4.) End game");

		GameMenu gui = new GameMenu(actions);
		gui.displayMenu();
	}

}