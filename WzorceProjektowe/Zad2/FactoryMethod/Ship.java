package Studia.WzorceProjektowe.Zad2.FactoryMethod;

public class Ship implements Transport {
    @Override
    public void deliver() {
        System.out.println("Delivering by ship.");
    }
}
