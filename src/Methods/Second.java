package Methods;

public class Second {
	// create a method 
	static void myMethod() {
		System.out.println("Hello Asha!");
	}

	public static void main(String[] args) {
		
		// multiple classes to share objects
		Main myObj2 = new Main();
		System.out.println(myObj2.x); //outputs 5
		
		//call the method - to print the action
		myMethod();

	}

}
