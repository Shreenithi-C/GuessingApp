class GameController{
	public static boolean restartGame(Scanner sc)
	{
		System.out.print("Do you want to play again? (yes/no): ");
		return scanner.nextLine().equalsIgnoreCase("yes");
	}
}
