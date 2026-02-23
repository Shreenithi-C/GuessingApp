/* 
@author developer
@version 2
*/
import java.util.*;
public class Guessing_App {
	public static void main(String[] args) {
		System.out.println("Welcome to the Guessing App");
		GameConfig config=new GameConfig();
		config.showRules();
		Scanner sc=new Scanner(System.in);
		int attempts=0;
		while(attempts<config.getMaxAttempts())
		{
			System.out.print("Enter your guess:");
			int guess = sc.nextInt();
			attempts++;
			String result=GuessValidator.validateGuess(guess, config.getTargetNumber());
			System.out.println(result);
			if("CORRECT".equals(result)){
				break;
			}
	}
}
