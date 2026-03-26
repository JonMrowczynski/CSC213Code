package interfacesbasics;

import java.util.LinkedList;

/**
 * @author Jon Mrowczynski
 */
public class LanguageDriver {
	
	public static void main(String[] args) {
		complexGreetings();
	}
	
	public static void complexGreetings() {
		var languages = new LinkedList<Language>();
		var english = new English();
		var french = new French();
		languages.add(english);
		languages.add(french);
		for (var language : languages) { language.greeting(); }
	}
	
	public static void simpleGreetings() {
	
	}
	
}
