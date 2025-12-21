import java.util.Random;
import static java.lang.Math.*;
public class Main {
	long max = 3123456789L;
	double reallyUgly = 1_2;
	public static void main (String[] args) {
		new Main();
		Random r = new Random();
		System.out.println(r.nextInt(10));
        int x = max(1, 2);
     	System.out.println(x);
     }
     // instance initializer
	{ System.out.println("Snowy"); }	
}
