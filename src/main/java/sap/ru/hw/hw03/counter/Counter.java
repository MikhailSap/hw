package sap.ru.hw.hw03.counter;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Counter {
    private int count;
    private Lock lock;

    public Counter() {
        this.lock = new ReentrantLock();
    }

    public int increment() {
        int current;
        lock.lock();
        current = ++count;
        lock.unlock();
        return current;
    }

    public int decrement() {
        int current;
        lock.lock();
        current = --count;
        lock.unlock();
        return current;
    }

    public int getCount() {
        return count;
    }
}
