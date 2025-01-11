package Studia.WzorceProjektowe.Zad2.FactoryMethod;

public class RoadLogistics extends Logistics {
    @Override
    protected Transport createTransport() {
        return new Truck();
    }
}
