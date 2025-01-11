package Studia.Wspolbiezne.Zad5;

public class Philosopher extends Thread {
    private final int id;
    private final Monitor monitor;

    public Philosopher(int id, Monitor monitor) {
        this.id = id;
        this.monitor = monitor;
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
                monitor.pickUpForks(id);
                eat();
                monitor.putDownForks(id);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
