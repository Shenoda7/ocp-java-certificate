public class Chick {
      private String name = "Fluffy";
      { System.out.println("setting field"); }
      public Chick() {
	name = "Tiny";
	System.out.println("setting constructor");
      }
      { System.out.println("tessst before constructor runs"); }
      public static void main (String[] args) {
      	Chick chick = new Chick();
	System.out.println(chick.name);
      }
}
