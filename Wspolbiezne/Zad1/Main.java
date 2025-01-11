package Studia.Wspolbiezne.Zad1;

import java.util.concurrent.CountDownLatch;

public class Main {
    public static void main(String[] args) throws InterruptedException {


    /*
        Napisz program komputerowy,
        który powołuje do życia 5-10 wątków działających na współdzielonej pamięci (współdzielonych zmiennych).
        Zaobserwuj działanie programu w kolejnych jego uruchomieniach.
         */
        CountDownLatch countDownLatch = new CountDownLatch(3);


        PrinterThread printer1 = new PrinterThread("A", 20, 100, countDownLatch);
        PrinterThread printer2 = new PrinterThread("B", 10, 102, countDownLatch);
        PrinterThread printer3 = new PrinterThread("C", 10, 2028, countDownLatch);
        PrinterThread printer4 = new PrinterThread("X", 30, 122, countDownLatch);
        PrinterThread printer5 = new PrinterThread("D", 32, 222, countDownLatch);
        PrinterThread printer6 = new PrinterThread("E", 45, 22, countDownLatch);


        printer1.start();
        printer2.start();
        printer3.start();

        countDownLatch.await();
        printer4.start();
        printer5.start();
        printer6.start();


    }
}
