package interfacesbasics;

/**
 * @author Jon Mrowczynski
 */
public class French implements Language {
	
	public static void main(String[] args) {
		var french = new French();
		System.out.println("In " + french.languageName() + ": ");
		System.out.print("\t Greeting: ");
		french.greeting();
		System.out.println("\t Farewell: " + french.farewell());
	}
	
	@Override public String languageName() { return French.class.getSimpleName(); }
	
	@Override public void greeting() { System.out.println("Bonjour!"); }
	
	@Override public String farewell() { return "Au Revoir!"; }
}
