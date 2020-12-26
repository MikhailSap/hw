package sap.ru.hw;

import org.junit.jupiter.api.Test;
import sap.ru.hw.hw03.counter.Counter;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CounterTest {

    @Test
    public void fiveHundredIncrement_oneHundredFiftyEightDecrement_whenCountThreeHundredFortyTwo() {
        int expectedValue = 342;
        Counter counter = new Counter();

        Thread incrementThread = new Thread(() -> {
            for (int i = 0; i < 500; i++) {
                System.out.println(counter.increment());
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread decrementThread = new Thread(() -> {
            for (int i = 0; i < 158; i++) {
                System.out.println(counter.decrement());
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        incrementThread.start();
        decrementThread.start();
        try {
            incrementThread.join();
            decrementThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        assertTrue(expectedValue == counter.getCount());

    }
}
