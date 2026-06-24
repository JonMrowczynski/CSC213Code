package defaultmethods;

/**
 * @author Jon Mrowczynski
 */
public interface Language {
	
	int NUM_OF_SUPPORTED_LANGUAGES = 2;
	
	default void presentLanguage() {
		IO.println("In " + languageName() + ": ");
		printGreeting();
		printFarewell();
	}
	
	private void printGreeting() {
		IO.print("\t Greeting: ");
		greeting();
	}
	
	private void printFarewell() { IO.println("\t Farewell: " + farewell()); }
	
	default String languageName() { return getClass().getSimpleName(); }
	
	void greeting();
	String farewell();
}