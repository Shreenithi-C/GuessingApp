/* 
@author developer
@version 5
*/
import java.util.*;
public class Guessing_App {
	public static void main(String[] args) throws InvalidInputException{
		Scanner sc=new Scanner(System.in);
		System.out.println("===========================");
		System.out.println("Welcome to the Guessing App");
		System.out.println("===========================");
		
		do{

		System.out.print("Enter PLayer Name: ");
		String player=sc.nextLine();

		GameConfig config=new GameConfig();
		config.showRules();
		
		int attempts=0;
		int hintsUsed=0;
		boolean win=false;

		while(attempts<config.getMaxAttempts())
		{
			System.out.print("Enter your guess:");
			int guess = ValidationService.validateInput(sc.nextLine());
			attempts++;
			String result=GuessValidator.validateGuess(guess, config.getTargetNumber());
			System.out.println(result);
			if("CORRECT".equals(result) && hintsUsed<config.getMAxHints()){
				hintsUsed++;
				System.out.println(HintService.generateHint(config.getTargetNumber(),hintsUsed);
			}
			System.out.println(result);
     			if("CORRECT".equals(result)){
				break;
			}
		}
		StorageService.saveResult(player, attempts, win);
		restart=GameController.restartGame(sc);
		} while(restart);		
	}
}
