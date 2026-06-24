package interfacesbasics;

/**
 * @author Jon Mrowczynski
 */
public class English implements Language {
	
	static void main() {
		var english = new English();
		IO.println("In " + english.languageName() + ": ");
		IO.print("\t Greeting: ");
		english.greeting();
		IO.println("\t Farewell: " + english.farewell());
	}
	
	@Override public String languageName() { return English.class.getSimpleName(); }
	
	@Override public void greeting() { IO.println("Hello!"); }
	
	@Override public String farewell() { return "Goodbye!"; }
}
