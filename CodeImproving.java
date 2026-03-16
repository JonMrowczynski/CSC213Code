/**
 * 
 * 
 * @author Jon Mrowczynski
 * 
 */
public class CodeImproving {

    public static void main(String[] args) {
		final var numTimes = 3;
		final var elapsedTime = 2_000_000_000;
        final var simpleResult = averageElapsedTimeSimple(numTimes, elapsedTime);
		final var complexResult = averageElapsedTimeComplex(numTimes, elapsedTime);
		System.out.println("Result from averageElapsedTimeSimple: " + simpleResult);
		System.out.println("Result from averageElapsedTimeComplex: " + complexResult);
    }

	/**
	 * One sentence description of method.
	 * <p>
	 * Very descriptive paragraph(s) of method. This might be able to be left out if the method is simple and relatively self-explanatory.
	 * 
	 * @param numTimes the number of times that the timer was started and stopped.
	 * @param elapsedTime the total amount of time that the timer ran in nanoseconds.
	 * @return the average amount of time that the timer ran in between starts and stops prior to being reset.
	 */
	public static double averageElapsedTimeSimple(int numTimes, long elapsedTime) {
		/*
			Simplifications made:
			1. deleted explicit else since always returning in the if statement.
			2. converted nanosecond time to seconds first to make Java implicitly cast elapsedTime to a double.
			3. Used ternary conditional operator -> (condition) ? <true value> : <false value>
		*/
		return numTimes == 0 ? 0 : (elapsedTime / 1_000_000_000.0) / numTimes;
	}

	public static double averageElapsedTimeComplex(int numTimes, long elapsedTime) {
		if (numTimes == 0) {
			return 0;
		} else {
			return ((double) elapsedTime / numTimes) / 1_000_000_000.0;
		}
	}

}