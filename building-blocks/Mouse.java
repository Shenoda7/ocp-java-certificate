public class Mouse {
    int length = 5; // Instance Variable (The Rug)

    public static void main(String[] args) {
        // System.out.println(length); // ERROR! 
        // We are in a static method (the Blueprint office).
        // Which Mouse's length are we talking about? We don't know!

        Mouse micky = new Mouse(); // We build a specific House
        System.out.println(micky.length); // WORKS! 
        // "micky" is the object reference. We told Java WHICH mouse to check.
    }
}
