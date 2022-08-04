package Methods;

public class methods {
	static void myMethod(String firstName, int age) {
		//System.out.println("I just got it!");
		System.out.println(firstName + " Abdulkadir"); // outputs Asha Abdulkadir & Halima Abdulkadir
		System.out.println(firstName + " is " + age); // outputs Asha is 20 & Halima is 19
	}
	
	static int myMethod(int x) {
		return 5 + x;
	}
	
	static int myMethod(int y, int z) {
		return y + z;
	}
	
	// if...else statement is commonly used inside methods
	// create a checkAge method with an integer variable age
	
	static void checkAge(int age) {
		//if age is less than 18 print access denied
		if (age<18) {
			System.out.println("Access denied!");
		}
		//if age is greater that or equal to 18 print access granted
		else {
			System.out.println("Access granted!");
		}
	}
	

	public static void main(String[] args) {
		//myMethod();
		myMethod("Asha", 20);// add a string & integer argument as the data type the method above takes 
		myMethod("Halima", 19);
		
		System.out.println(myMethod(3)); // outputs 8
		
		System.out.println(myMethod(5, 4)); //outputs 9
		
		// store result in a variable = makes it easy to read and maintain
		int sum = myMethod(5, 4);
		System.out.println(sum); // outputs a 2nd 9
		
		checkAge(20); // outputs Access granted!
	
		
	}


}
