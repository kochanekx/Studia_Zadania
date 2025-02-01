package Studia.Wspolbiezne.Zad3;

public class Reader extends Thread {
    private final int readerId;
    private final ReadersWritersController controller;

    public Reader(int readerId, ReadersWritersController controller) {
        this.readerId = readerId;
        this.controller = controller;
    }

    @Override
    public void run() {
        try {
            controller.readerEnter();
            System.out.println("Reader " + readerId + " is reading...");
            Thread.sleep(1000);
            System.out.println("Reader " + readerId + " finished reading.");
            controller.readerExit();
        } catch (InterruptedException e) {
            System.err.println("Reader " + readerId + " was interrupted.");
        }
    }
}

