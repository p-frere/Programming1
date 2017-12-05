import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

public class Quiz {
	
	private FlashCardReader cardReader;
	private ArrayList<FlashCard> cardList;
	private PrintStream printstream;
	
	/**
	 * Main methods
	 * @param args
	 */
	public static void main(String[] args) {
		new Quiz();
	}
	
	/**
	 * The constructor calls the creation of new flash cards
	 * calls play
	 */
	public Quiz(){	
		cardReader = new FlashCardReader();
		cardList = cardReader.getFlashCards();
		
		try {
			//opens a new file to write to
			printstream = new PrintStream(new FileOutputStream("save.txt"));
		} catch (FileNotFoundException e) {
			System.err.println("There was an error opening writing to the file");
		}
		play();
	}
	
	/**
	 * Begins a new flashcard game
	 */
	private void play(){
		Toolbox toolbox = new Toolbox();
		String userInput;
		String answer;
		
		System.out.println("*** FlashCard Game ***");
		
		for (FlashCard card : cardList){
			
			System.out.println(card.getQuestion());
			
			//get user input
			userInput = toolbox.readStringFromCmd();
			
			//checks if the users answer was correct
			if (userInput.equals(card.getAnswer())){
				System.out.println("Correct!");
				answer = "correct";
			} else {
				System.out.println("Incorrect, the correct answer was:");
				System.out.println(card.getAnswer());
				answer = "incorrect";
			}
			//saves the users score
			save(card.getQuestion(), card.getAnswer(), answer);
		}
		printstream.close();
	}
	
	/**
	 * Saves the results of the game to a file
	 * @param question
	 * @param answer
	 * @param answerCorrect
	 */
	private void save(String question, String answer, String answerCorrect){
		printstream.append("\nQuestion: "+ question + " Anwser: " + answer + " Result: " + answerCorrect );
	}
	

}
