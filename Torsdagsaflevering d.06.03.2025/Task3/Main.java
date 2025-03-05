import java.util.Random;
import java.util.Scanner;  

public class Main {
    private static int rnd_number;
    public static void main(String[] args) {

        // pick a random number
        Random random = new Random();
        rnd_number = random.nextInt(100) + 1;
        System.out.println( "I'm thinking of a number between 1 and 100 (including both).");
    	System.out.println( "Can you guess what it is?...");
        makeAGuess();

    }


    private static void makeAGuess(){

        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextDouble()) {

            int numberGuess = scanner.nextInt();
            if (numberGuess == rnd_number) {

                System.out.println("\u001B[32m#####################################\nGood job, you guess the right number!\n#####################################\u001B[0m");
            
            } else {

                String tempString= rnd_number > numberGuess ? "higher" : "lower";
                System.out.println("\u001B[31mWrong number, try again!\nTry guessing " + tempString+ "\u001B[0m");
                makeAGuess();

            }
        } else {

            System.out.println("\u001B[31mYOU MUST USE A NUMBER!!\u001B[0m");
            makeAGuess();

        }

    }
	// Create a Scanner object   	 
        // use hasNextDouble to check if input is numeric, 
        // if so...
	// Read user input
        // Compare it with the random number
        // Let the user know the result of the comparison
        // Let the user try again by calling this method recursively
        // Help the user by revealing wether the guess was lower or higher than the target number
        // if input was not numeric show an error message and call this method recursively

}