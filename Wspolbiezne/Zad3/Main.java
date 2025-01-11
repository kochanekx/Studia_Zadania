package Studia.Wspolbiezne.Zad3;

public class Main {
    public static void main(String[] args) {
        ReadersWritersController controller = new ReadersWritersController();

        int numReaders = 5;
        int numWriters = 2;


        for (int i = 1; i <= numReaders; i++) {
            new Reader(i, controller).start();
        }

        for (int i = 1; i <= numWriters; i++) {
            new Writer(i, controller).start();
        }
    }
}
