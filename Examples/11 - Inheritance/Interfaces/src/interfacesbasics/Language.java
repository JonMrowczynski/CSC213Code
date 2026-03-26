package interfacesbasics;

/**
 * @author Jon Mrowczynski
 */
public interface Language {
	public static int NUM_OF_SUPPORTED_LANGUAGES = 2;
	
	public abstract String languageName();
	public abstract void greeting();
	public abstract String farewell();
}