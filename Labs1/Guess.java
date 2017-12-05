public class Guess {
	public static void main(String[] args){
		Integer numberToGuess;
		Integer guessedNumber;
		Toolbox myToolbox = new Toolbox();
		
		System.out.println("Welcome to the gussing number game");
		numberToGuess = myToolbox.getRandomInteger(10);				//Creates random number between 1-10
		guessedNumber = myToolbox.readIntegerFromCmd();
		
		if (numberToGuess < guessedNumber ) {
			System.out.println("Too big");
		}
		if (numberToGuess > guessedNumber){
			System.out.println("Too small");
		} 
		if (numberToGuess.equals(guessedNumber)){
			System.out.println("Correct!");
		}
	}
	
}