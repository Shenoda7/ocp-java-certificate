public class ReferenceDemo {
	String message;
	// Constructor
	public ReferenceDemo(String msg) {
		this.message = msg; // assign new object to a refernce
	}
	
	// show reference 
	public void showReference() {
		System.out.println("message Content: " + message);
		System.out.println("Reference (hash coded): " + message.hashCode());
		System.out.println("Direct print of reference: " + message);
	}

	public static void main(String[] args) {
		// Create new obj and assign ref
		ReferenceDemo demo = new ReferenceDemo(new String("Hello World!!"));
		demo.showReference();

		// Assign ref to another variable
		String anotherRef = demo.message;
		System.out.println("Another ref points to the same object: " + anotherRef);
	}
}
