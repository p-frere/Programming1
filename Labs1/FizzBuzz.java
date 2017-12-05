public class FizzBuzz {									//Creates class called FizzBuzz
	public static void main(String[] args){ 			//Creates main method 
		for(Integer i = new Integer(1); i < 61; i++){ 	//Counts up to 60 increasing the value of i by 1
	
			if(i % 3 == 0){								//If when divided by 3 the remainder is 0 (mutiple of 3) 
				System.out.print("Fizz");				//Print Fizz
			}
			
			if(i % 5 == 0){ 							//If when divided by 5 the remainder is 0 (mutiple of 5) 
				System.out.print("Buzz"); 				//Print Buzz
			}
			
			if(i % 3 != 0 && i % 5 != 0){				//If when divided by 5 & 3 the remainder is not 0
				System.out.print(i); 					//Print the value of i
			}		
			System.out.println();						//print empty line
		}
	}
}









