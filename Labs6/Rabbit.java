 /**
 * RAbbit class inherits Herbivore inherits Animal  
 * @author peaf1g17
 */
public class Rabbit extends Herbivore {
	
	//constructor calls parent constructor 
	public Rabbit(String name, int age) {
		super(name, age);
	}
	
	//prints specific animal noise
	@Override
	public void makeNoise() {
		System.out.println("BOUNCE");
	}

}
