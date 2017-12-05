 /**
 * Wolf class inherits Carnivor inherits Animal 
 * @author peaf1g17
 */
public class Wolf extends Carnivore {
	
	//constructor calls parent constructor 
	public Wolf(String name, int age) {
		super(name, age);
	}
	
	public Wolf() {
		super();
	}
	
	//prints specific animal noise
	@Override
	public void makeNoise() {
		System.out.println("HOWL");
	}
	
}
