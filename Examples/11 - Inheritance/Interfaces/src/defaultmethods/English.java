package defaultmethods;

/**
 * @author Jon Mrowczynski
 */
public class English implements Language {
	
	static void main() {
		var english = new English();
		english.presentLanguage();
	}
	
	@Override public void greeting() { IO.println("Hello!"); }
	
	@Override public String farewell() { return "Goodbye!"; }
}
