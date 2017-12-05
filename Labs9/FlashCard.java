/**
 * The flashcard object and stores questions and answers
 */
public class FlashCard {
	
	private String question;
	private String answer;
	
	//Getter methods
	public String getQuestion(){
		return question;
	}
	public String getAnswer(){
		return answer;
	}
	
	//Constructors
	public FlashCard(String question, String answer){
		this.question = question;
		this.answer = answer;
	}

}
