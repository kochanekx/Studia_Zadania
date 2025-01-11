package Studia.Wspolbiezne.Zad4;

import java.util.concurrent.Semaphore;

public class Philosopher extends Thread {
    private int id;
    private Semaphore[] forks;

    public Philosopher(int id, Semaphore[] forks) {
        this.id = id;
        this.forks = forks;
    }

    private void think() throws InterruptedException {
        System.out.println("Philosopher " + id + " is thinking.");
        Thread.sleep((int) (Math.random() * 1000));
    }

    private void eat() throws InterruptedException {
        System.out.println("Philosopher " + id + " is eating.");
        Thread.sleep((int) (Math.random() * 1000));
    }

    @Override
    public void run() {
        try {
            while (true) {
                think();
                forks[id].acquire();
                forks[(id + 1) % 5].acquire();
                eat();
                forks[id].release();
                forks[(id + 1) % 5].release();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
