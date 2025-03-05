import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int retireAge = 67;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please type your name:");
		String name = scanner.nextLine();
		
		System.out.println("Hello, " + name + "\nPlease type your age:");
		int age = scanner.nextInt();

        int timeToRetire = (retireAge - age) > 0 ? retireAge - age : 0;
		if (timeToRetire != 0) {
			System.out.println("Your name is: " + name + " \nAnd you are: " +age+ " Years old!\nYou can retire in: "+timeToRetire+ " years!");
		} else {
			System.out.println("Your name is: " + name + " And you are: " +age+ " Years old - YOU CAN RETIRE!");
		}
	}

}