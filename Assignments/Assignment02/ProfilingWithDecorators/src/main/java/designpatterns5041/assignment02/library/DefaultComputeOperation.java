package designpatterns5041.assignment02.library;

import java.util.Random;
import java.util.stream.IntStream;

// This code CAN NOT be changed!
public final class DefaultComputeOperation implements ComputeOperation {
    private final Random _random;

    public DefaultComputeOperation() {
        _random = new Random(System.currentTimeMillis());
    }

    public void compute(int range) {
        IntStream query = IntStream.range(0, range)
                .filter(this::isEven);

        query.forEach(System.out::println);
    }

    private boolean isEven(int i) {
        try {
            Thread.sleep(_random.nextInt(100));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return i % 2 == 0;
    }
}
