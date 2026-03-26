package defaultmethods;

/**
 * @author Jon Mrowczynski
 */
public class English implements Language {
	
	public static void main(String[] args) {
		var english = new English();
		english.presentLanguage();
	}
	
	@Override public void greeting() { System.out.println("Hello!"); }
	
	@Override public String farewell() { return "Goodbye!"; }
}
