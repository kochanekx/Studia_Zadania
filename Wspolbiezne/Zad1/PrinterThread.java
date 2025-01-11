package Studia.Wspolbiezne.Zad1;

import java.util.concurrent.CountDownLatch;

public class PrinterThread extends Thread {
    private final String letter;
    private final int amount;
    private final int interval;
    private final CountDownLatch countDownLatch;


    public PrinterThread(String letter, int amount, int interval, CountDownLatch countDownLatch) {
        this.letter = letter;
        this.amount = amount;
        this.interval = interval;
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < amount; i++) {
                System.out.print(letter);
                Thread.sleep(interval);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted: " + letter);
        } finally {
            countDownLatch.countDown();
        }
    }
}
