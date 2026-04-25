import java.util.List;

/**
 * @author Jon Mrowczynski
 */
public class GenericExamples {
	
	public static void main(String[] args) {
		List<Short> shortsList = List.of((short) 1, (short) 2, (short) 3);
		List<Integer> intsList = List.of(1, 2, 3);
		List<Double> doublesList = List.of(1.0, 2.0, 3.0);
		
		//		var shortsAverage = average(shortsList);
		//		var intsAverage = average(intsList);
		//		var doublesAverage = average(doublesList);
		
		var shortsAverage = average(shortsList);
		var intsAverage = average(intsList);
		var doublesAverage = average(doublesList);
		
		System.out.printf("""
				                  Short average: %f
				                  Int average: %f
				                  Double average: %f%n""", shortsAverage, intsAverage, doublesAverage);
		
		// Show generic example.
		
		// Show self-referential
	}
	
	private static <T extends Number> double average(List<T> list) {
		var sum = 0.0;
		for (T item : list) { sum += item.doubleValue(); }
		return sum / list.size();
	}
	
	// All the methods below can be replaced with a singular generic method!
	
	private static double averageShorts(List<Short> list) {
		var sum = 0.0;
		for (var item : list) { sum += item; }
		return sum / list.size();
	}
	
	private static double averageInts(List<Integer> list) {
		var sum = 0.0;
		for (var item : list) { sum += item; }
		return sum / list.size();
	}
	
	private static double averageDoubles(List<Double> list) {
		var sum = 0.0;
		for (var item : list) { sum += item; }
		return sum / list.size();
	}
}