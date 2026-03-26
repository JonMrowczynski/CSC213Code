package defaultmethods;

/**
 * @author Jon Mrowczynski
 */
public interface Language {
	
	int NUM_OF_SUPPORTED_LANGUAGES = 2;
	
	default void presentLanguage() {
		System.out.println("In " + languageName() + ": ");
		printGreeting();
		printFarewell();
	}
	
	private void printGreeting() {
		System.out.print("\t Greeting: ");
		greeting();
	}
	
	private void printFarewell() { System.out.println("\t Farewell: " + farewell()); }
	
	default String languageName() { return getClass().getSimpleName(); }
	
	void greeting();
	String farewell();
}