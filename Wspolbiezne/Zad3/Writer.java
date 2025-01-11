package Studia.Wspolbiezne.Zad3;

public class Writer extends Thread {
    private final int writerId;
    private final ReadersWritersController controller;

    public Writer(int writerId, ReadersWritersController controller) {
        this.writerId = writerId;
        this.controller = controller;
    }

    @Override
    public void run() {
        try {
            controller.writerEnter();
            System.out.println("Writer " + writerId + " is writing...");
            Thread.sleep(1000);
            System.out.println("Writer " + writerId + " finished writing.");
            controller.writerExit();
        } catch (InterruptedException e) {
            System.err.println("Writer " + writerId + " was interrupted.");
        }
    }
}
