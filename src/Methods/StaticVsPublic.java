package Methods;

public class StaticVsPublic {
	
	//static method
	static void myStaticMethod() {
		System.out.println("Static method can be called without creating objects.");
	}
	
	//public method
	public void myPublicMethod() {
		System.out.println("Public methods must be called by creating objects.");
	}
	
	
	// main method
	public static void main(String[] args) {
		
		myStaticMethod(); //call the static method
		//myPublicMethod(); -error compiling
		
		//creating an object of class- specify class name(StaticVsPublic)/ followed by a given name for object(myObj) and use of keyword new and then class name.
		StaticVsPublic myObj = new StaticVsPublic(); //creating an object of main, for the public method to avoid error in compiling
		myObj.myPublicMethod(); //call the public method-an object must be created first
		// the dot is used to access the object's attributes and methods
		

	}

}
