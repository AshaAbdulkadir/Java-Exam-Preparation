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
		myMethod(); //outputs Hello Asha!
		
		//It is a good practice to create an object of a class and access it in another i.e in the class-Second
		Main myCar = new Main(); //myCar is the name of the object-created
		myCar.fullThrottle(); // calling the fullThrottle object -outputs Public methods must be called by creating objects.
		myCar.speed(200);

	}

}
