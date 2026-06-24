// All these methods below can be replaced with a singular generic method!

double averageShorts(List<Short> list) {
	var sum = 0.0;
	for (var item : list) { sum += item; }
	return sum / list.size();
}

double averageInts(List<Integer> list) {
	var sum = 0.0;
	for (var item : list) { sum += item; }
	return sum / list.size();
}

double averageDoubles(List<Double> list) {
	var sum = 0.0;
	for (var item : list) { sum += item; }
	return sum / list.size();
}

/**
 * @author Jon Mrowczynski
 */
void main() {
	var shortsList = List.of((short) 1, (short) 2, (short) 3);
	var intsList = List.of(1, 2, 3);
	var doublesList = List.of(1.0, 2.0, 3.0);
	
	//		var shortsAverage = averageShorts(shortsList);
	//		var intsAverage = averageInts(intsList);
	//		var doublesAverage = averageDoubles(doublesList);
	
	var shortsAverage = average(shortsList);
	var intsAverage = average(intsList);
	var doublesAverage = average(doublesList);
	
	IO.println("""
			           Short average: %f
			           Int average: %f
			           Double average: %f""".formatted(shortsAverage, intsAverage, doublesAverage));
	
	// Show generic example.
	
	// Show self-referential
}

<T extends Number> double average(List<T> list) {
	var sum = 0.0;
	for (T item : list) { sum += item.doubleValue(); }
	return sum / list.size();
}

<T extends Number> double averageWithStreams(List<T> list) {
	return list.stream().mapToDouble(Number::doubleValue).average().orElse(Double.NaN);
}