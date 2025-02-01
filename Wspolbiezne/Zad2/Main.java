package Studia.Wspolbiezne.Zad2;

import java.util.Arrays;
import java.util.Random;

public class Main {
    /*
Napisz program, który:

Tworzy tablicę 1_000_000 losowych elementów typu int lub double
Sortuje tablicę używając algorytmu quicksort i 1 zadania
Sortuje tablicę uzywając algorytmu quicksort i niezależnych n(*) zadań (wątków)
Gdyby się nie udało podejście z wykorzystaniem puli wątków(*), proszę tworzyć nowy wątek przy każdym zejściu rekurencyjnym i po prostu zliczać utworzone w ten sposób wątki w zmiennej n.
Po każdym posortowaniu proszę napisać asercję/e celem upewnienia się, że nieposortowana na początku tablica stała się faktycznie posortowana.

Jak zmienia się czas wykonania algorytmu dla zmieniającej się wartości n? Jak wyglądają czasy wykonania, kiedy ilość elementów w tablicy wynosi

10_000_000
10_000
100
 */
    private static int threadCount = 0;

    public static void main(String[] args) {
        int[] sizes = {100, 10_000, 10_000_000};
        Random random = new Random();

        for (int size : sizes) {
            int[] arr = random.ints(size, 0, 100).toArray();

            System.out.println("Sortowanie tablicy o rozmiarze " + size + " przy użyciu klasycznego quicksort");
            long startTime = System.nanoTime();
            int[] sortedArr = QuickSort.quicksort(arr);
            long elapsedTime = System.nanoTime() - startTime;
            assert QuickSort.isSorted(sortedArr) : "Tablica nie została poprawnie posortowana";
            System.out.printf("Czas wykonania:", elapsedTime / 1_000_000_000.0);

            arr = random.ints(size, 0, 100).toArray();

            System.out.println("Sortowanie tablicy o rozmiarze " + size + " przy użyciu wątków");
            startTime = System.nanoTime();
            threadCount = 0;
            sortedArr = threadedQuicksort(arr);
            elapsedTime = System.nanoTime() - startTime;
            assert QuickSort.isSorted(sortedArr) : "Tablica nie została poprawnie posortowana!";
            System.out.printf("Czas wykonania: %.4f sekundy%n", elapsedTime / 1_000_000_000.0);
            System.out.println("Liczba utworzonych wątków: " + threadCount + "\n");
        }
    }

    public static int[] threadedQuicksort(int[] arr) {
        if (arr.length <= 1) {
            return arr;
        }
        int pivot = arr[arr.length / 2];
        final int[][] left = {Arrays.stream(arr).filter(x -> x < pivot).toArray()};
        int[] middle = Arrays.stream(arr).filter(x -> x == pivot).toArray();
        final int[][] right = {Arrays.stream(arr).filter(x -> x > pivot).toArray()};

        Thread leftThread = new Thread(() -> {
            int[] leftSorted = threadedQuicksort(left[0]);
            left[0] = leftSorted;
        });
        Thread rightThread = new Thread(() -> {
            int[] rightSorted = threadedQuicksort(right[0]);
            right[0] = rightSorted;
        });

        threadCount += 2;
        leftThread.start();
        rightThread.start();
        try {
            leftThread.join();
            rightThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return QuickSort.concatenate(left[0], middle, right[0]);
    }
}
