import java.util.stream.IntStream;
import java.util.stream.LongStream;

double calcTime(long startTime) { return (System.nanoTime() - startTime) / 1_000_000_000.0; }

void main() {

    var startTime = System.nanoTime();
    IO.println("Single-threaded sum: %,d".formatted(singleThreaded()));
    IO.println("Took: %.3fs".formatted(calcTime(startTime)));
    
    IO.println();

    startTime = System.nanoTime();
    IO.println("Multithreaded sum: %,d".formatted(multiThreaded()));
    IO.println("Took: %.3fs".formatted(calcTime(startTime)));
}

long singleThreaded() {
    return LongStream.range(0, Integer.MAX_VALUE).sum();
}

long multiThreaded() {
    return LongStream.range(0, Integer.MAX_VALUE).parallel().sum();
}