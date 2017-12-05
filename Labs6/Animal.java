/**
 * Animal class, contains main method
 * @author peaf1g17
 */

public abstract class Animal {
	private String name;
	private int age;
	
	//getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
		
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//makes the specific animal noise
	public abstract void makeNoise();
	
	//makes animal eat a food
	public abstract void eat(Food food) throws Exception;
	
	//Main method
	public static void main (String[] args) {
		//creates new objects
		Wolf wolf = new Wolf("Spock", 2);
		Parrot parrot = new Parrot("Nigel", 4);
		Rabbit rabbit = new Rabbit("Shaq", 1);
		
		Meat meat = new Meat("Beef");
		Plant plant = new Plant("Lettace");
		
		//feeds the parrot the correct food
		parrot.eat(meat);		
		
		//trys to feed animals the wrong food
		try {
			wolf.eat(plant);
			rabbit.eat(meat);
			
		} catch (Exception e) {
			System.err.println(e);
		}	
	}
}
