import java.util.ArrayList;
import java.util.Scanner; 

public class GameMenu {
	private ArrayList<String> actions;

	public GameMenu(ArrayList<String> actions) {

		this.actions = actions;
		
	}
	public String getAction() {
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Type a number, to select an aciton!");
        displayMenu();
    	String action = scanner.nextLine();
    	for (String s : actions) {

            if (s.toLowerCase().equals(action.toLowerCase())) { //Sat den til at tjekke om de er ens men begge i lower case, så at et stort bogstav ikke giver fejl.
    			return action;
    		}
    	}
    	System.out.println("\u001B[31mMust select a valid action!\u001B[0m");
    	return getAction();
	}


	public void displayMenu() {

		for (String action : actions) {
			System.out.println(action);
		}

	}

}