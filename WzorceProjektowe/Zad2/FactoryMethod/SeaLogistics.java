package Studia.WzorceProjektowe.Zad2.FactoryMethod;

public class SeaLogistics extends Logistics {
    @Override
    protected Transport createTransport() {
        return new Ship();
    }
}
