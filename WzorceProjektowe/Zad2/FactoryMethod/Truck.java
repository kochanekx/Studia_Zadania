package Studia.WzorceProjektowe.Zad2.FactoryMethod;

public class Truck implements Transport {
    @Override
    public void deliver() {
        System.out.println("Delivering by truck.");
    }
}
