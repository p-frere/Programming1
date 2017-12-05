import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FlashCardReader {
	
	private BufferedReader reader;
	private ArrayList<FlashCard> cardList = new ArrayList<FlashCard>();
	
	/**
	 * Returns an array of the flash cards
	 */
	public ArrayList<FlashCard> getFlashCards(){
		String line;
		//Splits the question and the answer by the ":"
		while ((line = getLine()) != null) {
			 cardList.add(new FlashCard(line.split(":")[0], line.split(":")[1]));
		}
		try {
			reader.close();
		} catch (IOException e) {
			System.err.println("Couldn't close file");
		}
		return cardList;
	}
	
	/**
	 * Opens and a new file
	 */
	public FlashCardReader(){
		try {
			//opens a new file to read from
			reader = new BufferedReader(new FileReader("Questions.txt"));
		} catch (FileNotFoundException e) {
			System.err.println("There was an error trying to open Questions.txt");
		}		
	}
	
	/**
	 * Reads a line from the opened file
	 * If there is not file or next line, returns null
	 */
	public String getLine(){ 
		String line = "";
		try {
			//If the next line is not null return that line
			if ((line = reader.readLine()) != null) {		
				return line;
			} else {
				return null;
			}
		} catch (IOException e) {
			System.err.println("There was an input error when reading the file");
			return null;
		}
	}
	
	/**
	 * Checks if the file is ready to be read from
	 */
	public boolean fileReady(){
		try {
			//If reader is ready return true
			return reader.ready();
		} catch (IOException e) {
			System.err.println("There was an input error when checking if the file was ready");
			return false;
		}
	}
}
