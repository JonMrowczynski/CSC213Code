package interfacesbasics;

/**
 * @author Jon Mrowczynski
 */
public class English implements Language {
	
	public static void main(String[] args) {
		var english = new English();
		System.out.println("In " + english.languageName() + ": ");
		System.out.print("\t Greeting: ");
		english.greeting();
		System.out.println("\t Farewell: " + english.farewell());
	}
	
	@Override public String languageName() { return English.class.getSimpleName(); }
	
	@Override public void greeting() { System.out.println("Hello!"); }
	
	@Override public String farewell() { return "Goodbye!"; }
}
