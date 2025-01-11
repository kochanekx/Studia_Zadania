package Studia.Wspolbiezne.Zad5;

public class Main {
    public static void main(String[] args) {
        final int NUMBER_OF_PHILOSOPHERS = 5;
        Monitor monitor = new Monitor(NUMBER_OF_PHILOSOPHERS);
        Philosopher[] philosophers = new Philosopher[NUMBER_OF_PHILOSOPHERS];

        for (int i = 0; i < NUMBER_OF_PHILOSOPHERS; i++) {
            philosophers[i] = new Philosopher(i, monitor);
            philosophers[i].start();

        }
    }
}
