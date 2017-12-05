/**
 * class inherits from Animal 
 * @author peaf1g17
 */
public abstract class Herbivore extends Animal {
	
	//constructor calls parent constructor 
	/**
	 * 
	 * @param name
	 * @param age
	 */
	public Herbivore(String name, int age) {
		super(name, age);
	}
	
	//passes animal food to eat
		@Override
		public void eat(Food food) throws Exception {
			//if the food is of the wrong type throw an error
			if (food instanceof Meat) {
				throw new Exception("The Animal cannot eat that!!");
			}
			System.out.println(this.getName() + " is eating " + food.getName());	
		}

}
