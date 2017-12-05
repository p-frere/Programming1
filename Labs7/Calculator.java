/*
 * This is a stub class I was given which was incomplete
 * In this class I was not allowed to create new variables or methods
 */
public class Calculator {
        Double x;
        /*
        * Chops up input on ' ' then decides whether to add or multiply.
        * If the string does not contain a valid format returns null.
        */
        public Double x(String x) {
      	
        	x.split(" ");
        	this.x = Double.parseDouble(x.split(" ")[0]);
        	
        	//if plus use Double class
        	if (x.split(" ")[1].equals("+")) {
        		return x((Double)Double.parseDouble(x.split(" ")[2]));
        		
        	//if times use double primitive
        	} else if(x.split(" ")[1].equals("x")) {
        		return x((Double.parseDouble(x.split(" ")[2])));
        	}
        	else {
                return null;
        	}
        }

        /*
        * Adds the parameter x to the instance variable x and returns the answer as a Double.
        */
        public Double x(Double x){
                System.out.println("== Adding ==");
                x = this.x + x;
                return new Double(x);
        }

        /*
        * Multiplies the parameter x by instance variable x and return the value as a Double.
        */
        public Double x(double x){
                System.out.println("== Multiplying ==");
                x = this.x * x;
                return new Double(x);
        }

}
