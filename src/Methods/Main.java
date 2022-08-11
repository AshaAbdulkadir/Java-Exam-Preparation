package Methods;

//creating a Main class with a matching Main java file i.e Main.java
public class Main {
	
	// attributes can be modified if not assigned here e.g int x; insead of int x = 5;
	int x =5; // class attributes or field
	String fname = "Asha";
	String lname = "Abdulkadir";
	int age = 30;
	
	//create a fullThrottle() method
	public void fullThrottle() {
		System.out.println("The car is going as fast it can!");
	}
	
	//create a speed() method and add a parameter
	public void speed(int maxSpeed) {
		System.out.println("Max speed is: " + maxSpeed);
	}
	
	//main method - inside main call on the myCar objects i.e fullThrottle and speed
	public static void main(String[] args) {
		
		// creating Object
		// to access attributes use myObj.x i.e dot syntax (.)
		// attributes can be overrid by reassigning and to avoid reassigning use final keyword in initial assigning of attibutes
		// final keyword  useful for constant values like PI or if no changes to attributes are not to be made
		Main myObj = new Main();
		System.out.println(myObj.x); //outputs 5
		
		//you can specify as many attributes as you want
		System.out.println("My name is " +myObj.fname + " " + myObj.lname); // outputs My name is Asha Abdulkadir
		System.out.println("I'm " + myObj.age + " years young"); //outputs I'm 30 years young.
		
		
		//multiple Objects i.e myObj1 and myObj2
		Main myObj1 = new Main();
		System.out.println(myObj1.x); // outputs another 5
		
		//multiple Objects for same class/ you can change the attributes values in one object without affecting the previous 
		Main myObj2 = new Main();
		myObj2.x = 10;
		System.out.println(myObj2.x); // outputs 10
		
		/* It is a good practice to create an object of a class and access it in another i.e in the class-Second
		 * 
		 * Main myCar = new Main(); //myCar is the name of the object-created
		 * myCar.fullThrottle(); // calling the fullThrottle object -outputs Public methods must be called by creating objects.
		 * myCar.speed(200);
		*/

	}

}
