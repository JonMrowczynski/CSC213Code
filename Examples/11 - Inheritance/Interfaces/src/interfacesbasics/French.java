package interfacesbasics;

/**
 * @author Jon Mrowczynski
 */
public class French implements Language {
	
	static void main() {
		var french = new French();
		IO.println("In " + french.languageName() + ": ");
		IO.print("\t Greeting: ");
		french.greeting();
		IO.println("\t Farewell: " + french.farewell());
	}
	
	@Override public String languageName() { return French.class.getSimpleName(); }
	
	@Override public void greeting() { IO.println("Bonjour!"); }
	
	@Override public String farewell() { return "Au Revoir!"; }
}
