/**
 * Parrot class inherits Omnivore inherits Animal  
 * @author peaf1g17
 */
public class Parrot extends Omnivore {

	//constructor calls parent constructor 
	public Parrot(String name, int age) {
		super(name, age);
	}
	
	public Parrot(int age) {
		super("Polly", age);
	}
	
	//prints specific animal noise
	@Override
	public void makeNoise() {
		System.out.println("SQUARK");
	}

}
