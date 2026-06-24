package interfacesbasics;

import java.util.LinkedList;

/**
 * @author Jon Mrowczynski
 */
public class LanguageDriver {
	
	static void main() { complexGreetings(); }
	
	public static void complexGreetings() {
		var languages = new LinkedList<Language>();
		var english = new English();
		var french = new French();
		languages.add(english);
		languages.add(french);
		languages.forEach(Language::greeting);
	}
	
	public static void simpleGreetings() {
	
	}
	
}
