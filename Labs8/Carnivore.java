/**
 * Carnivore class inherits from Animal
 * @author peaf1g17
 */
public abstract class Carnivore extends Animal {
	
	//constructor calls parent constructor 
	public Carnivore(String name, int age) {
		super(name, age);
	}
	
	public Carnivore() {
		super();
	}
	
	/**passes animal food to eat*/
	@Override
	public void eat(Food food) throws Exception {
		//if the food is of the wrong type throw an error
		if (food instanceof Plant) {
			throw new Exception("The Animal cannot eat that!!");
		}
		System.out.println(this.getName() + " is eating " + food.getName());	
	}
}
