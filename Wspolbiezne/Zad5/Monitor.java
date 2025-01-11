package Studia.Wspolbiezne.Zad5;

public class Monitor {
    private final boolean[] forks;

    public Monitor(int numberOfPhilosophers) {
        forks = new boolean[numberOfPhilosophers];
    }

    public synchronized void pickUpForks(int philosopherId) throws InterruptedException {
        while (forks[philosopherId] || forks[(philosopherId + 1) % forks.length]) {
            wait();
        }
        forks[philosopherId] = true;
        forks[(philosopherId + 1) % forks.length] = true;
    }

    public synchronized void putDownForks(int philosopherId) {
        forks[philosopherId] = false;
        forks[(philosopherId + 1) % forks.length] = false;
        notifyAll();
    }
}
