public class CallingConstructors {
	int numEggs = 10;
	String name;
	public static void main (String[] args) {
		CallingConstructors c = new CallingConstructors();
		c.test();
	}
	public CallingConstructors() {
		name = "Shenoda";
		System.out.println("in constructor");
		System.out.println(name);
		numEggs = 20;
		System.out.println(numEggs);
	}
	public void test () {
		System.out.println("This is from the test method");
	}
}
