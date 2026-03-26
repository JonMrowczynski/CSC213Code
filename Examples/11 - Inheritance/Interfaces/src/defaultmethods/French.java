package defaultmethods;

/**
 * @author Jon Mrowczynski
 */
public class French implements Language {
	
	public static void main(String[] args) {
		var french = new French();
		french.presentLanguage();
	}
	
	@Override public void greeting() { System.out.println("Bonjour!"); }
	
	@Override public String farewell() { return "Au Revoir!"; }
}
