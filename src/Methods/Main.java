package Methods;

public class Main {
	
	// attributes can be modified if not assigned here e.g int x; insead of int x = 5;
	int x =5; // class attributes or field
	String fname = "Asha";
	String lname = "Abdulkadir";
	int age = 30;

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
		
		
		//multiple Objects
		Main myObj1 = new Main();
		System.out.println(myObj1.x); // outputs another 5
		
		//multiple Objects for same class/ you can change the attributes values in one object without affecting the previous 
		Main myObj2 = new Main();
		myObj2.x = 10;
		System.out.println(myObj2.x); // outputs 10

	}

}
