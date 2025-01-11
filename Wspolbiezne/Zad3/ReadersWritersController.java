package Studia.Wspolbiezne.Zad3;

import java.util.concurrent.Semaphore;

public class ReadersWritersController {
    private int readCount = 0;
    private final Semaphore mutex = new Semaphore(1);
    private final Semaphore writeLock = new Semaphore(1);

    public void readerEnter() throws InterruptedException {
        mutex.acquire();
        readCount++;
        if (readCount == 1) {
            writeLock.acquire();
        }
        mutex.release();
    }

    public void readerExit() throws InterruptedException {
        mutex.acquire();
        readCount--;
        if (readCount == 0) {
            writeLock.release();
        }
        mutex.release();
    }

    public void writerEnter() throws InterruptedException {
        writeLock.acquire();
    }

    public void writerExit() {
        writeLock.release();
    }
}
