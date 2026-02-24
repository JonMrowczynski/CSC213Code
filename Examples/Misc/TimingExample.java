public class TimingExample {

    public static void main(String[] args) {
        final var ti = System.nanoTime();
        // Do some process...
        var sum = 0L;
        for (var i = 0; i < 1_000_000_000; ++i) { 
            for (var j = 0; j < 10; ++j) { sum += j; }
            sum += i;
        }
        final var tf = System.nanoTime();
        final var deltaT = (tf - ti) / 1_000_000_000.0;
        System.out.println("It took " + deltaT + "s to run the process!");
    }

}