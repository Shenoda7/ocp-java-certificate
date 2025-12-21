public class MemorySimpleDemo {
	public static void main(String[] args) {
		// two separate objects with the same content
		String s1 = new String("Java");
		String s2 = new String("Java");

		// Content check (fingerprint)
		// String hashcode looks at the letters J-a-v-a
		System.out.println("S1 Content Hash: " + s1.hashCode());
		System.out.println("S2 Content Hash: " + s2.hashCode());

		// Identity Check (The "Memory address" proxy)
		// System.identityHashCode looks at WHERE the object was born
		System.out.println("S1 Identity (Memory): " + System.identityHashCode(s1));
		System.out.println("S2 Identity (Memory): " + System.identityHashCode(s2));
	}
}
