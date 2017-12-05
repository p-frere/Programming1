/**
 * Omnivore class inherits from Animal  
 * @author peaf1g17
 */
public abstract class Omnivore extends Animal {
	
	//Constructor calls parent constructor 
	public Omnivore(String name, int age) {
		super(name, age);
	}
	
	//passes animal food to eat
	@Override
	public void eat(Food food) {
		System.out.println(this.getName() + " is eating " + food.getName());	
	}

}
