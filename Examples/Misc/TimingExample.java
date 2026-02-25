public class TimingExample {

    public static void main(String[] args) {
        final var ti = System.nanoTime();
        // Do some process...
        var sum = 0L;
        for (var i = 1; i < Integer.MAX_VALUE; ++i) { sum += i; }
        final var tf = System.nanoTime();
        final var deltaT = (tf - ti) / 1_000_000_000.0;
        System.out.println("It took " + deltaT + "s to sum all the integers, which yields: " + sum);
    }

}