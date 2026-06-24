package defaultmethods;

/**
 * @author Jon Mrowczynski
 */
public class French implements Language {
	
	static void main() {
		var french = new French();
		french.presentLanguage();
	}
	
	@Override public void greeting() { IO.println("Bonjour!"); }
	
	@Override public String farewell() { return "Au Revoir!"; }
}
